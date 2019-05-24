package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.event.Event;
import org.codeoverflow.chatoverflow.api.io.dto.stat.User;

import java.time.ZonedDateTime;

public class TipeeeStreamSubscription implements Event {
    private final ZonedDateTime createdAt;
    private final User user;
    private final String message;
    private final Integer resub;

    public TipeeeStreamSubscription(ZonedDateTime createdAt, User user, String message, Integer resub) {
        this.createdAt = createdAt;
        this.user = user;
        this.message = message;
        this.resub = resub;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public Integer getResub() {
        return resub;
    }
}
