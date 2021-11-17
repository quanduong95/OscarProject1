package com.example.oscarproject.Service;

import com.example.oscarproject.Model.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorService  {
     Actor saveActor(Actor actor);
     List<Actor> getAllActors();
    Optional<Actor> getActorById(Long id);
     List<Actor> getActorByAward(String award);
     List<Actor> getActorByCategory(String category);
    List<Actor> getActorByCategoryAndYear(String category, String year);
    List<Actor> getActorByAward(String award);
     List<Actor> getActorByAwardAndYear(String award, String year);
}