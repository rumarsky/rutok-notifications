package rutok.notifications.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_settings")
public class UserNotificationSettings {

    @EmbeddedId
    private UserNotificationSettingsId id;

    @Column(nullable = false)
    private Boolean isEnabled = true;

}
