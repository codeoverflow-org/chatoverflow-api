package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Subscription;

import java.time.OffsetDateTime;

public class TipeeestreamSubscription extends Subscription<User> {

    private final TipeeestreamProvider provider;

    public TipeeestreamSubscription(User subscriber, int resub, OffsetDateTime time, TipeeestreamProvider provider) {
        super(subscriber, resub, time);
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
