package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Subscription;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.SubscriptionTier;

import java.time.OffsetDateTime;

/**
 * A subscription to the channel of the streamer that is reported by StreamElements.
 */
public class StreamElementsSubscription extends Subscription<User> {

    private final StreamElementsProvider provider;

    public StreamElementsSubscription(User subscriber, OffsetDateTime time, int resub, SubscriptionTier tier, boolean gifted, User donor, StreamElementsProvider provider) {
        super(subscriber, time, resub, tier, gifted, donor);
        this.provider = provider;
    }

    public StreamElementsProvider getProvider() {
        return provider;
    }
}
