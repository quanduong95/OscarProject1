/**
 * This interface 's purpose is to allow access with multiple methods within CrudRepository framework
 */
package com.example.oscarproject.Repository;

import com.example.oscarproject.Model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>  {
    List<Movie> findAllByCategoryAndYear(String category, String year);
    List<Movie> findAllByCategoryAndWinnerAndYear(String category, String winner,String year);
    List<Movie> findAllByYear(String year);
    List<Movie> findAllByWinnerAndYear(String winner,String year);
    List<Movie> findAllByYearGreaterThanEqual(String year);

}