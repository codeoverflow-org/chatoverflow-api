package org.codeoverflow.chatoverflow.api.io.dto.follow;

import org.codeoverflow.chatoverflow.api.io.dto.User;

public class Follow {
    private final User follower;
    private final User followed;
    private final Long timestamp;

    public Follow(User follower, User followed, Long timestamp) {
        this.follower = follower;
        this.followed = followed;
        this.timestamp = timestamp;
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
    public Long getTimestamp() {
        return timestamp;
    }
}
