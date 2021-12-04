/**
 * Entity class
 * To define our entity (Movie) with its properties.
 * Also to specify columns in our database's table
 */
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

    @Column(name="year",nullable = false)
    private String year;

    @Column(name = "category")
    private String category;

    @Column(name = "winner")
    private String winner;


    @Column(name = "entity")
    private String entity;


}