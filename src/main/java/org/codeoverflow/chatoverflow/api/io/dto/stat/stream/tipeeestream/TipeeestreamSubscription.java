package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Subscription;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.SubscriptionTier;

import java.time.OffsetDateTime;

public class TipeeestreamSubscription extends Subscription<User> {

    private final TipeeestreamProvider provider;

    public TipeeestreamSubscription(User subscriber, OffsetDateTime time, int resub, SubscriptionTier tier, boolean gifted, User donor, TipeeestreamProvider provider) {
        super(subscriber, time, resub, tier, gifted, donor);
        this.provider = provider;
    }

    /**
     * Get the service over which this subscription was made
     *
     * @return the provider of this subscription
     */
    public TipeeestreamProvider getProvider() {
        return provider;
    }
}
