package com.github.rumarsky.rutoknotification.service;

import com.github.rumarsky.rutoknotification.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationTemplateRepository notificationTemplateRepository;
    private final NotificationTypeRepository notificationTypeRepository;
    private final NotificationChannelRepository notificationChannelRepository;
    private final UserNotificationSettingsRepository userNotificationSettingsRepository;
}
