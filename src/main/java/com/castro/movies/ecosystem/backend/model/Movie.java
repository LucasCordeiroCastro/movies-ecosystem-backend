package com.castro.movies.ecosystem.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String synopsis;

    private LocalDate releaseDate;

    @ElementCollection
    private List<String> genres;

    @ElementCollection
    private List<String> director;

    @ElementCollection
    private List<String> cast;

    private Integer duration;
}
