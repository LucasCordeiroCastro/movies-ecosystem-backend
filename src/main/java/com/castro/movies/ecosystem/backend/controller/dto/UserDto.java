package com.castro.movies.ecosystem.backend.controller.dto;

import java.util.List;

public record UserDto(
        Long id,
        String username,
        String email,
        String location,
        List<String> favoriteActors
) {}
