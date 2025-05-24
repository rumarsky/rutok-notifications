package rutok.notifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rutok.notifications.entity.*;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserNotificationSettingsRepository extends JpaRepository<UserNotificationSettings, UserNotificationSettingsId> {

    Optional<UserNotificationSettings> findById_UserIdAndId_TypeId(Long userId, Long typeId);

    List<UserNotificationSettings> findById_UserId(Long userId);
}