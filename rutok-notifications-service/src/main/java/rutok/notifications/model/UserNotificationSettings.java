package rutok.notifications.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "user_notification_settings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserNotificationSettings {

    @EmbeddedId
    private UserNotificationSettingsId id;

    @Column(name = "is_enabled", nullable = false)
    private Boolean isEnabled = true;
}

