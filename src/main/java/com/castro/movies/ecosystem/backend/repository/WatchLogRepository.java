package com.castro.movies.ecosystem.backend.repository;

import com.castro.movies.ecosystem.backend.model.WatchLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchLogRepository extends JpaRepository<WatchLog, Long> {
}
