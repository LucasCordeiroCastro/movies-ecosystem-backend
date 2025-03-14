package com.castro.movies.ecosystem.backend.controller;

import com.castro.movies.ecosystem.backend.controller.dto.MovieDto;
import com.castro.movies.ecosystem.backend.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getMovies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) String director,
            @RequestParam(required = false) String actor,
            @RequestParam(required = false) Integer year
    ) {
        return ResponseEntity.ok(movieService.getMovies(title, genre, director, actor, year));
    }

    /**
     @PostMapping public ResponseEntity<MovieDto> createMovie(@RequestBody @Valid MovieDto movieDto) {
     return ResponseEntity.ok(movieService.createMovie(movieDto));
     }
     **/
}
