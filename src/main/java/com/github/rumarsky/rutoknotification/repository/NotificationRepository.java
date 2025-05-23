package com.github.rumarsky.rutoknotification.repository;

import com.github.rumarsky.rutoknotification.model.Notification;
import com.github.rumarsky.rutoknotification.model.NotificationStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByUserId(Long userId);

    Page<Notification> findByUserId(Long userId, Pageable pageable);

    List<Notification> findByStatus(NotificationStatus status);

    List<Notification> findByStatusAndSentAtBefore(NotificationStatus status, LocalDateTime sentAt);

    @Query("SELECT n FROM Notification n WHERE n.userId = :userId AND n.status = :status")
    List<Notification> findByUserAndStatus(Long userId, NotificationStatus status);

    @Modifying
    @Query("UPDATE Notification n SET n.status = :status, n.sentAt = :sentAt WHERE n.id = :id")
    void updateStatusAndSentAt(Long id, NotificationStatus status, LocalDateTime sentAt);

    @Modifying
    @Query("UPDATE Notification n SET n.status = :status, n.readAt = :readAt WHERE n.id = :id")
    void updateStatusAndReadAt(Long id, NotificationStatus status, LocalDateTime readAt);

    boolean existsByUserIdAndStatus(Long userId, NotificationStatus status);
}
