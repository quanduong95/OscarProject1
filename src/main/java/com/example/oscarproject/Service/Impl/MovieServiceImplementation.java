/**
 * Implementation class
 * To store definitions of methods used for Controller
 */
package com.example.oscarproject.Service.Impl;

import com.example.oscarproject.Repository.MovieRepository;
import com.example.oscarproject.Service.MovieService;
import com.example.oscarproject.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

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
    public List<Movie> getMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    //get all movies with particular category and year
    @Override
    public List<Movie> getMovieByCategoryAndYear(String category, String year) {
        return (List<Movie>) movieRepository.findAllByCategoryAndYear(category,year);
    }

    //get all movies won the Oscar in particular year
    @Override
    public List<Movie> getMovieByCategoryAndWinnerAndYear(String category, String winner,String year) {
        return (List<Movie>) movieRepository.findAllByCategoryAndWinnerAndYear(category,winner,year);
    }
    //get all Movies nominated from a year to present
    public List<Movie> getMovieByYearGreaterThanEqual(String year) {
        return (List<Movie>) movieRepository.findAllByYearGreaterThanEqual(year);
    }

    // get all movies nominated for the Oscar by year
    @Override
    public List<Movie> getMovieByYear(String year) {
        return (List<Movie>) movieRepository.findAllByYear(year);
    }

    //get all movies that won the Oscar by year
    @Override
    public List<Movie> getMovieByWinnerAndYear(String winner, String year) {
        return (List<Movie>) movieRepository.findAllByWinnerAndYear(winner,year);
    }


}
