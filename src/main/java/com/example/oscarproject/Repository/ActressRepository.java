package com.example.oscarproject.Repository;

import com.example.oscarproject.Model.Actress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActressRepository extends CrudRepository<Actress, Long>  {
    List<Actress> findAllByAward(String award);
    List<Actress> findAllByCategory(String category);
    List<Actress> findAllByCategoryAndYear(String category, String year);
    List<Actress> findAllByAwardAndYear(String award,String year);
}
