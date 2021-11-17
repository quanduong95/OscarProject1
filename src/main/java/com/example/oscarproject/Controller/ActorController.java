package com.example.oscarproject.Controller;

import com.example.oscarproject.Model.Actor;
import com.example.oscarproject.Service.ActorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actors")
public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        super();
        this.actorService = actorService;
    }

    //create a movie REST API
    @PostMapping()
    public ResponseEntity<Actor> saveActor(@RequestBody Actor actor){
        return new ResponseEntity<Actor>(ActorService.saveActor(actor), HttpStatus.CREATED);
    }

    //get all movies
    @GetMapping()
    public List<Actor> findAllActors(){
        return ActorService.getAllActors();
    }

    //get all movies by their award(WINNER OR NOMINEES)
    @RequestMapping("/award/{award}")
    public List<Actor> findActorByAward(@PathVariable(value ="award") String award){
        return ActorService.getActorByAward(award);
    }

    //get all movies by their award and year (WINNER OR NOMINEES)
    @RequestMapping("/award/{award}/year/{year}")
    public List<Actor> findByAward(@PathVariable(value ="award") String award,@PathVariable(value ="year") String year){
        return ActorService.getActorByAwardAndYear(award,year);
    }

    //get all movies by their category
    @RequestMapping(value = "/category/{category}")
    public List<Actor> findByCategory(@PathVariable(value ="category") String category){
        return ActorService.getActorByCategory(category);
    }

    //get all movies by their catergory and year
    @RequestMapping(value = "/category/{category}/year/{year}")
    public List<Actor> findActorByCategory(@PathVariable(value ="category") String category, @PathVariable(value ="year") String year){
        return ActorService.getActorByCategoryAndYear(category,year);
    }


}
