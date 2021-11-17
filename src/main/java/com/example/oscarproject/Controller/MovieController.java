package com.example.oscarproject.Controller;

import com.example.oscarproject.Model.Movie;
import com.example.oscarproject.Service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        super();
        this.movieService = movieService;
    }

    //create a movie REST API
    @PostMapping()
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    //get all movies
    @GetMapping()
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    //get all movies by their award (WINNER OR NOMINEES)
    @RequestMapping("/award/{award}")
    public List<Movie> findMovieByAward(@PathVariable(value ="award") String award){
        return movieService.getMovieByAward(award);
    }

    //get all movies by their category
    @RequestMapping(value = "/category/{category}")
    public List<Movie> findMovieByCategory(@PathVariable(value ="category") String category){
        return movieService.getMovieByCategory(category);
    }

    //get all movies by their catergory and year
    @RequestMapping(value = "/category/{category}/year/{year}")
    public List<Movie> findMovieByCategory(@PathVariable(value ="category") String category, @PathVariable(value ="year") String year){
        return movieService.getMovieByCategoryAndYear(category,year);
    }


}
