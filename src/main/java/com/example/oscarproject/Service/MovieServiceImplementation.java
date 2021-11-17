package com.example.oscarproject.Service;

import com.example.oscarproject.Model.Movie;
import com.example.oscarproject.Repository.MovieRepository;
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
    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }
    public List<Movie> getMovieByAward(String award){
        return movieRepository.findAllByAward(award);
    }
    @Override
    public List<Movie> getMovieByCategory(String category) {
        return movieRepository.findAllByCategory(category);
    }

    @Override
    public List<Movie> getMovieByCategoryAndYear(String category, String year) {
        return movieRepository.findAllByCategoryAndYear(category,year);
    }

}
