package org.codeoverflow.chatoverflow.api.io.dto.follow;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

public class Follow {
    private final User follower;
    private final User followed;
    private final OffsetDateTime time;

    public Follow(User follower, User followed, OffsetDateTime time) {
        this.follower = follower;
        this.followed = followed;
        this.time = time;
    }

    /**
     * @return user who is following
     */
    public User getFollower() {
        return follower;
    }

    /**
     * @return user who is followed
     */
    public User getFollowed() {
        return followed;
    }

    /**
     * @return time of the following
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
