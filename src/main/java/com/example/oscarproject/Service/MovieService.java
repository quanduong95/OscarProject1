package com.example.oscarproject.Service;

import com.example.oscarproject.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie saveMovie (Movie movie);
    List<Movie> getAllMovies();
    List<Movie> getMovieByCategory(String category);
    List<Movie> getMovieByCategoryAndYear(String category, String year);
    List<Movie> getMovieByCategoryAndWinnerAndYear(String category, String winner,String year);
    List<Movie> getMovieByYear(String year);
}
