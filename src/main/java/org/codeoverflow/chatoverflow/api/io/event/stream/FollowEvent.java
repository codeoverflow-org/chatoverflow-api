package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Follow;

/**
 * Generic event for follows
 */
public abstract class FollowEvent<T extends Follow> {

    private final T info;

    protected FollowEvent(T info) {
        this.info = info;
    }

    /**
     * Get the Follow object that contains all information about that follow
     *
     * @return all info about that follow
     */
    public T getInfo() {
        return info;
    }
}
