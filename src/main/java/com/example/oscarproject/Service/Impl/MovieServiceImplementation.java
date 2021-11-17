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

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public List<Movie> getMovieByCategory(String category) {
        return movieRepository.findAllByCategory(category);
    }

    @Override
    public List<Movie> getMovieByCategoryAndYear(String category, String year) {
        return movieRepository.findAllByCategoryAndYear(category,year);
    }

    @Override
    public List<Movie> getMovieByCategoryAndWinnerAndYear(String category, String winner,String year) {
        return movieRepository.findAllByCategoryAndWinnerAndYear(category,winner,year);
    }

}
