package rutok.notifications.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rutok.notifications.model.*;

import java.util.Optional;

@Repository
public interface NotificationChannelRepository extends JpaRepository<NotificationChannel, Long> {
    Optional<NotificationChannel> findByName(String name);

    boolean existsByName(String name);
}