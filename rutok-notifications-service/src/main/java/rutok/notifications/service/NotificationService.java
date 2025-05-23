package rutok.notifications.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rutok.notifications.repository.*;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationTemplateRepository notificationTemplateRepository;
    private final NotificationTypeRepository notificationTypeRepository;
    private final NotificationChannelRepository notificationChannelRepository;
    private final UserNotificationSettingsRepository userNotificationSettingsRepository;
}
