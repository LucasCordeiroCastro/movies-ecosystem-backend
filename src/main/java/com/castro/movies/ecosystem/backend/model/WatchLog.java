package com.castro.movies.ecosystem.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class WatchLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    private double rating;

    private String review;

    @PastOrPresent
    private LocalDate watchDate;
}
