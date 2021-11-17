package com.example.oscarproject.Repository;

import com.example.oscarproject.Model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>  {
    List<Movie> findAllByCategory(String category);
    List<Movie> findAllByCategoryAndYear(String category, String year);
    List<Movie> findAllByCategoryAndWinnerAndYear(String category, String winner,String year);
}
