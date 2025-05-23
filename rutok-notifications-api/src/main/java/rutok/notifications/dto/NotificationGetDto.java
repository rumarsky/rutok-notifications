package rutok.notifications.dto;

import java.time.*;

import io.swagger.v3.oas.annotations.media.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Ответ с информацией о уведомлении",
    requiredProperties = {
        "id", "userId", "title",
        "status", "sendAt"
    }
)
public class NotificationGetDto {

    private Long id;

    private Long userId;

    private String title;

    private String message;

    private String status;

    private ZonedDateTime sendAt;

}
