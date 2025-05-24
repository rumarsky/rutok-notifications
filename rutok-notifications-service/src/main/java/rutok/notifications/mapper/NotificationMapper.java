package rutok.notifications.mapper;

import org.mapstruct.*;
import rutok.notifications.dto.*;
import rutok.notifications.entity.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationMapper {

    Notification toEntity(NotificationCreateDto notificationCreateDto);

}
