package com.example.oscarproject.Model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="actors")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="actor_name",nullable = false)
    private String actressName;

    //name of the movie that the actor starred in
    @Column(name = "movie_name")
    private String movieName;

    //year of the movie/ the year that actor was nominated/won the Oscar award
    @Column(name = "year")
    private String year;

    //nominated or won any award
    @Column(name = "award")
    private String award;

}