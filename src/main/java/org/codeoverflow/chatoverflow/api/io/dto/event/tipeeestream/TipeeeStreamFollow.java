package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import java.time.ZonedDateTime;

public class TipeeeStreamFollow implements TipeeeStreamEvent {
    private final ZonedDateTime createdAt;
    private final String follower;
    private final String message;

    public TipeeeStreamFollow(ZonedDateTime createdAt, String follower, String message) {
        this.createdAt = createdAt;
        this.follower = follower;
        this.message = message;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public String getFollower() {
        return follower;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getType() {
        return "follow";
    }
}
