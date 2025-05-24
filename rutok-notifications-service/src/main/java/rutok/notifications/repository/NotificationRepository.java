package rutok.notifications.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rutok.notifications.entity.*;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByUserId(Long userId);

    Page<Notification> findByUserId(Long userId, Pageable pageable);

    List<Notification> findByStatus(NotificationStatus status);

    List<Notification> findByStatusAndSentAtBefore(NotificationStatus status, LocalDateTime sentAt);

    boolean existsByUserIdAndStatus(Long userId, NotificationStatus status);

}
