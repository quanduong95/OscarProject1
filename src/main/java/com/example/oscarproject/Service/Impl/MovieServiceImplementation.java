/**
 * Implementation class
 * To store definitions of methods used for Controller
 */
package com.example.oscarproject.Service.Impl;

import com.example.oscarproject.Model.Movie;
import com.example.oscarproject.Repository.MovieRepository;
import com.example.oscarproject.Service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImplementation implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImplementation(MovieRepository movieRepository) {
        super();
        this.movieRepository = movieRepository;
    }

    //Write method that allows to write a new movie into database
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    //get all movies method
    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    //get all movies with category
    @Override
    public List<Movie> getMovieByCategory(String category) {
        return movieRepository.findAllByCategory(category);
    }

    //get all movies with particular category and year
    @Override
    public List<Movie> getMovieByCategoryAndYear(String category, String year) {
        return movieRepository.findAllByCategoryAndYear(category,year);
    }

    //get all movies won the Oscar in particular year
    @Override
    public List<Movie> getMovieByCategoryAndWinnerAndYear(String category, String winner,String year) {
        return movieRepository.findAllByCategoryAndWinnerAndYear(category,winner,year);
    }

    // get all movies nominated for the Oscar by year
    @Override
    public List<Movie> getMovieByYear(String year) {
        return movieRepository.findAllByYear(year);
    }

}
