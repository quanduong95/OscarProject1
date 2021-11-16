package com.example.oscarproject.Model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="actresses")
public class Actress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="actress_name",nullable = false)
    private String actressName;

    //name of the movie the actress starred in
    @Column(name = "movie_name")
    private String movieName;

    //year of the movie / year of the actress nominated/won the Oscar award
    @Column(name = "year")
    private String year;

    //nominated or won any award
    @Column(name = "award")
    private String award;

}