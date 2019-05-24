package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.event.Event;

import java.time.ZonedDateTime;

public interface TipeeeStreamEvent extends Event {
     ZonedDateTime getCreatedAt();
     String getMessage();
     String getType();
}
