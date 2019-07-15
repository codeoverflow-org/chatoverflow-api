package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

public class Subscription<T extends User> {
    private final T subscriber;
    private final OffsetDateTime time;
    private final int resub;

    public Subscription(T subscriber, int resub, OffsetDateTime time) {
        this.subscriber = subscriber;
        this.time = time;
        this.resub = resub;
    }

    /**
     * Get the user object of the person that started following
     *
     * @return the subscriber
     */
    public T getSubscriber() {
        return subscriber;
    }

    /**
     * Returns how often that user has subscribed
     *
     * @return how often a user resubbed
     */
    public int getResub() {
        return resub;
    }

    /**
     * Get the time when the user started following
     *
     * @return follow start time
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
