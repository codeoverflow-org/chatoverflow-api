package org.codeoverflow.chatoverflow.api.io.dto.event;

import java.time.ZonedDateTime;

public interface Event {
     ZonedDateTime getCreatedAt();
     String getMessage();
}
