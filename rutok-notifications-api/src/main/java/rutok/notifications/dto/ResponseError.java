package rutok.notifications.dto;

import io.swagger.v3.oas.annotations.media.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Ответ с ошибкой",
    requiredProperties = {
        "type", "message"
    }
)
public class ResponseError {

    @Schema(description = "Тип ошибки", example = "RETRY")
    private String type;

    @Schema(description = "Сообщение об ошибке", example = "Параметр page должен быть не менее 0")
    private String message;

}
