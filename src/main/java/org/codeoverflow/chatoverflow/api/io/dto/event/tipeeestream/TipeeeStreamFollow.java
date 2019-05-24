package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.event.Event;
import org.codeoverflow.chatoverflow.api.io.dto.stat.User;

import java.time.ZonedDateTime;

public class TipeeeStreamFollow implements Event {
    private final ZonedDateTime createdAt;
    private final User user;
    private final String message;

    public TipeeeStreamFollow(ZonedDateTime createdAt, User user, String message) {
        this.createdAt = createdAt;
        this.user = user;
        this.message = message;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
