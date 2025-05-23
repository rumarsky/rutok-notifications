package rutok.notifications.dto;

import io.swagger.v3.oas.annotations.media.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Ответ с мета информацией",
    requiredProperties = {
        "page", "pageSize",
        "totalPages", "totalElements"
    }
)
public class MetaInfoDto {

    @Schema(description = "Номер страницы", example = "1")
    private int page;

    @Schema(description = "Количество объектов на странице", example = "10")
    private int pageSize;

    @Schema(description = "Общее количество страниц", example = "10")
    private int totalPages;

    @Schema(description = "Общее количество элементов", example = "100")
    private Long totalElements;

}
