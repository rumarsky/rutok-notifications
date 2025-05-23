package rutok.notifications.api;

import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.tags.*;
import jakarta.validation.constraints.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import rutok.notifications.dto.*;

@Tag(name = "Notifications", description = "Уведомления")
public interface NotificationApi {

    @GetMapping("/api/notifications")
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Успешный ответ",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = NotificationsGetDto.class)
            )
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Неверный формат входного параметра",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = ResponseError.class),
                examples = @ExampleObject(
                    value = """
                        {
                            "type": "RETRY",
                            "message": "Параметр page должен быть не менее 0"
                        }
                        """
                )
            )
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Статус не найден",
            content = {
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ResponseError.class),
                    examples = @ExampleObject(
                        value = """
                            {
                                "type": "RETRY",
                                "message": "Статуса не существует"
                            }
                            """
                    )
                )
            }
        ),
        @ApiResponse(
            responseCode = "500",
            description = "Внутрення ошибка сервера",
            content = {
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ResponseError.class),
                    examples = @ExampleObject(
                        value = """
                            {
                                "type": "FINAL",
                                "code": 1999,
                                "message": "Ошибка сервера. Пожалуйста, попробуйте позже или свяжитесь с поддержкой"
                            }
                            """
                    )
                )
            }
        )
    })
    ResponseEntity<NotificationsGetDto> getNotifications(
        @RequestParam(required = false)
        Long statusId,
        @RequestParam(required = false, defaultValue = "0")
        @Min(value = 0, message = "Параметр page должен быть не меньше 0")
        int page,
        @RequestParam(required = false, defaultValue = "10")
        @Min(value = 5, message = "Параметр page должен быть не меньше 5")
        @Max(value = 50, message = "Параметр pageSize должен быть не более 50")
        int pageSize
    );

}
