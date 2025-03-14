package com.castro.movies.ecosystem.backend.repository;

import com.castro.movies.ecosystem.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
