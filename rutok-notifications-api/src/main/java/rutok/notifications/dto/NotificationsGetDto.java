package rutok.notifications.dto;

import io.swagger.v3.oas.annotations.media.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Ответ со списков уведомлений для пользователя")
public class NotificationsGetDto {

    private List<NotificationsGetDto> notifications;

}
