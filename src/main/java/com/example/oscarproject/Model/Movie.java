package com.example.oscarproject.Model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="movieName",nullable = false)
    private String movieName;

    @Column(name = "category")
    private String category;

    // the year when the movie was released
    @Column(name = "year")
    private String year;

    //nominated or won any award.
    @Column(name = "award")
    private String award;

}