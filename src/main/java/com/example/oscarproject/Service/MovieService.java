package com.example.oscarproject.Service;

import com.example.oscarproject.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie saveMovie (Movie movie);
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    List<Movie> getMovieByAward(String award);
    List<Movie> getMovieByCategory(String category);
    List<Movie> getMovieByCategoryAndYear(String category, String year);
}
