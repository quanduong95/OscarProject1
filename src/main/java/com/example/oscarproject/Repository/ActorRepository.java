package com.example.oscarproject.Repository;

import com.example.oscarproject.Model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long>  {
    List<Actor> findAllByAward(String award);
    List<Actor> findAllByCategory(String category);
    List<Actor> findAllByCategoryAndYear(String category, String year);
    List<Actor> findAllByAwardAndYear(String award,String year);
}
