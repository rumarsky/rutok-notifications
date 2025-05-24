package rutok.notifications.rabbitmq;

import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.*;
import rutok.notifications.dto.*;
import rutok.notifications.mapper.*;
import rutok.notifications.service.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitConsumer {

    private final NotificationService notificationService;

    private final NotificationMapper notificationMapper;

    @RabbitListener(queues = "${rabbitmq.queues.decisions}")
    public void listen(NotificationCreateDto notificationDto) {
        log.info("Обновляем заявку {}");
        var notification = notificationMapper.toEntity(notificationDto);
        notificationService.createNotification(notification);
    }

}
