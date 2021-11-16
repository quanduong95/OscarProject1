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
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        super();
        this.movieService = movieService;
    }

    //create a movie REST API
    @PostMapping()
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    //get all movies REST AP
    @GetMapping()
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

}
