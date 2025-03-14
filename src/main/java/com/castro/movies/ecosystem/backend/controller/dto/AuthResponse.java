package com.castro.movies.ecosystem.backend.controller.dto;

public record AuthResponse(
        String username,
        String token,
        String message
) {}
