package com.github.rumarsky.rutoknotification.repository;

import com.github.rumarsky.rutoknotification.model.NotificationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplate, Long> {

    @Query("SELECT t FROM NotificationTemplate t WHERE t.channel.id = :channelId AND t.type = :typeId")
    Optional<NotificationTemplate> findByChannelAndTypeId(long channelId, long typeId);

    List<NotificationTemplate> findByChannelId(Long channelId);

    List<NotificationTemplate> findByTypeId(Long typeId);
}
