package com.castro.movies.ecosystem.backend.controller;

import com.castro.movies.ecosystem.backend.controller.dto.UserDto;
import com.castro.movies.ecosystem.backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<UserDto> getUserProfile(@PathVariable String username) {
        UserDto userDto = userService.getUserByUsername(username);
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUserProfile(@PathVariable Long userId, @RequestBody @Valid UserDto userDto) {
        UserDto updatedUserDto = userService.updateUser(userId, userDto);
        return ResponseEntity.ok(updatedUserDto);
    }
}
