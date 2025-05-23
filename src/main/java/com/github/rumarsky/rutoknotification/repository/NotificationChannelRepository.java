package com.github.rumarsky.rutoknotification.repository;

import com.github.rumarsky.rutoknotification.model.NotificationChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationChannelRepository extends JpaRepository<NotificationChannel, Long> {
    Optional<NotificationChannel> findByName(String name);

    boolean existsByName(String name);
}