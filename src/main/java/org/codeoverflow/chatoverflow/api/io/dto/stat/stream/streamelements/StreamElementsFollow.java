package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Follow;

import java.time.OffsetDateTime;

/**
 * A follow that is reported by StreamElements.
 */
public class StreamElementsFollow extends Follow<User> {

    private final StreamElementsProvider provider;

    public StreamElementsFollow(User follower, OffsetDateTime time, StreamElementsProvider provider) {
        super(follower, time);
        this.provider = provider;
    }

    public StreamElementsProvider getProvider() {
        return provider;
    }
}
