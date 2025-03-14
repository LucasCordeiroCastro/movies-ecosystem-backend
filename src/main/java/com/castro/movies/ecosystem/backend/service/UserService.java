package com.castro.movies.ecosystem.backend.service;

import com.castro.movies.ecosystem.backend.controller.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto getUserByUsername(String username) {
        return null;
    }

    public UserDto updateUser(Long userId, @Valid UserDto userDto) {
        return null;
    }
}
