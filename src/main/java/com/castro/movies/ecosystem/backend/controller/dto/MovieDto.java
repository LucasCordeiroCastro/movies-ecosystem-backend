package com.castro.movies.ecosystem.backend.controller.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.List;

public record MovieDto(
        Long id,
        @NotBlank String title,
        LocalDate releaseDate,
        List<String> genres,
        List<String> cast,
        Integer duration
) {
}
