/**
 * Controller class to specify API endpoints
 */

package com.example.oscarproject.Controller;

import com.example.oscarproject.Service.MovieService;
import com.example.oscarproject.Model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    //get all movies stored in the database
    @GetMapping()
    public List<Movie> getAllMovies(){
        return movieService.getMovies();
    }

    //get all movies nominated by year
    @RequestMapping(value = "/year/{year}")
    public List<Movie> findMovieByYear(@PathVariable(value ="year") String year){
        return movieService.getMovieByYear(year);
    }

    //get all the movies won the Oscar by year
    @RequestMapping(value = "/winner/{winner}/year/{year}")
    public List<Movie> findMovieByWinnerAndYear(@PathVariable(value ="winner") String winner,
                                                @PathVariable(value ="year") String year){
        return movieService.getMovieByWinnerAndYear(winner,year);
    }

    //get all movies nominated by their category and year
    @RequestMapping(value = "/category/{category}/year/{year}")
    public List<Movie> findMovieByCategoryAndYear(@PathVariable(value ="category") String category,
                                                  @PathVariable(value ="year") String year){
        return movieService.getMovieByCategoryAndYear(category,year);
    }

    //get all movies won the Oscar award by category in a specific year
    @RequestMapping(value = "/category/{category}/winner/{winner}/year/{year}")
    public List<Movie> findMovieByCategoryAndWinner(@PathVariable(value ="category") String category,
                                                    @PathVariable(value ="winner") String winner,
                                                    @PathVariable(value="year") String year){
        return movieService.getMovieByCategoryAndWinnerAndYear(category,winner,year);
    }

}
