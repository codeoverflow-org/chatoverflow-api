package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import java.time.ZonedDateTime;

public class TipeeeStreamSubscription implements TipeeeStreamEvent {
    private final ZonedDateTime createdAt;
    private final String subscriber;
    private final String message;
    private final Integer resub;

    public TipeeeStreamSubscription(ZonedDateTime createdAt, String subscriber, String message, Integer resub) {
        this.createdAt = createdAt;
        this.subscriber = subscriber;
        this.message = message;
        this.resub = resub;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String getType() {
        return "subscription";
    }

    public Integer getResub() {
        return resub;
    }
}
