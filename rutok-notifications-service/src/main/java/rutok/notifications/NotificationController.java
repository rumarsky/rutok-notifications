package rutok.notifications;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import rutok.notifications.api.*;
import rutok.notifications.dto.*;

@RestController
public class NotificationController implements NotificationApi {

    @Override
    public ResponseEntity<NotificationsGetDto> getNotifications(
        Long statusId,
        int page,
        int pageSize
    ) {
        return null;
    }

}
