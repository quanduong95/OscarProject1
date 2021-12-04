/**
 * This interface class is to store methods needed for the MovieServiceImplementation class
 */
package com.example.oscarproject.Service;

import com.example.oscarproject.Model.Movie;

import java.util.List;

public interface MovieService {
    Movie saveMovie (Movie movie);
    List<Movie> getMovies();
    List<Movie> getMovieByCategoryAndYear(String category, String year);
    List<Movie> getMovieByCategoryAndWinnerAndYear(String category, String winner,String year);
    List<Movie> getMovieByYear(String year);
    List<Movie> getMovieByWinnerAndYear(String winner,String year);
    List<Movie> getMovieByYearGreaterThanEqual(String year);
}
