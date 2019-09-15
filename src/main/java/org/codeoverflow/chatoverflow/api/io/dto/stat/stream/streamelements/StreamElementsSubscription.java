package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Subscription;

import java.time.OffsetDateTime;

/**
 * A subscription to the channel of the streamer that is reported by StreamElements.
 */
public class StreamElementsSubscription extends Subscription<User> {

    private final StreamElementsProvider provider;
    private final boolean gifted;

    public StreamElementsSubscription(User subscriber, int resub, OffsetDateTime time, StreamElementsProvider provider, boolean gifted) {
        super(subscriber, resub, time);
        this.provider = provider;
        this.gifted = gifted;
    }

    public StreamElementsProvider getProvider() {
        return provider;
    }

    public boolean isGifted() {
        return gifted;
    }
}
