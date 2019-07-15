package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

/**
 * A user started following the stream
 */
public class Follow<T extends User> {

    private final T follower;
    private final OffsetDateTime time;

    public Follow(T follower, OffsetDateTime time) {
        this.follower = follower;
        this.time = time;
    }

    /**
     * Get the user object of the person that started following
     *
     * @return the follower
     */
    public T getFollower() {
        return follower;
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
