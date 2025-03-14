package com.castro.movies.ecosystem.backend.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(
        @NotBlank String username,
        @Email String email,
        @NotBlank String password,
        @NotBlank String location
) {}
