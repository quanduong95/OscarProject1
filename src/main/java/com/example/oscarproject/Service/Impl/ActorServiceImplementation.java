package com.example.oscarproject.Service.Impl;

import com.example.oscarproject.Model.Actor;
import com.example.oscarproject.Repository.ActorRepository;
import com.example.oscarproject.Service.ActorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImplementation implements ActorService {
    private ActorRepository actorRepository;

    public ActorServiceImplementation(ActorRepository ActorRepository) {
        super();
        this.actorRepository = actorRepository;
    }

    @Override
    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public List<Actor> getAllActors() {
        return (List<Actor>) actorRepository.findAll();
    }

    @Override
    public Optional<Actor> getActorById(Long id) {
        return actorRepository.findById(id);
    }

    @Override
    public List<Actor> getActorByAward(String award) {
        return actorRepository.findAllByAward(award);
    }

    public List<Actor> getActorByAwardAndYear(String award,String year){
        return actorRepository.findAllByAwardAndYear(award,year);
    }
    @Override
    public List<Actor> getActorByCategory(String category) {
        return actorRepository.findAllByCategory(category);
    }

    @Override
    public List<Actor> getActorByCategoryAndYear(String category, String year) {
        return actorRepository.findAllByCategoryAndYear(category,year);
    }

}
