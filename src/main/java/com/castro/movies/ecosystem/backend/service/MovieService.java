package com.castro.movies.ecosystem.backend.service;

import com.castro.movies.ecosystem.backend.controller.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    public MovieDto getMovieById(Long id) {
        return null;
    }

    public List<MovieDto> getMovies(String title, String genre, String director, String actor, Integer year) {
        return null;
    }
}
