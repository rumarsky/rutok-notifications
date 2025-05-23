package rutok.notifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rutok.notifications.model.*;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserNotificationSettingsRepository extends JpaRepository<UserNotificationSettings, UserNotificationSettingsId> {

    Optional<UserNotificationSettings> findById_UserIdAndId_TypeId(Long userId, Long typeId);

    List<UserNotificationSettings> findById_UserId(Long userId);

    @Query("SELECT uns FROM UserNotificationSettings uns WHERE uns.id.userId = :userId AND uns.isEnabled = true")
    List<UserNotificationSettings> findEnabledByUserId(Long userId);

    @Modifying
    @Query("UPDATE UserNotificationSettings uns SET uns.isEnabled = :isEnabled WHERE uns.id.userId = :userId AND uns.id.type.id = :typeId")
    void updateEnabledStatus(Long userId, Long typeId, Boolean isEnabled);

}