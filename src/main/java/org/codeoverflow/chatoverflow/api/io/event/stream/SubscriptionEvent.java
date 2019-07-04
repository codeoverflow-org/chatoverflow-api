package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Subscription;

/**
 * Generic event for subscriptions
 */
public abstract class SubscriptionEvent<T extends Subscription> {

    private final T info;

    protected SubscriptionEvent(T info) {
        this.info = info;
    }

    /**
     * Get the Subscription object that contains all information about that subscription
     *
     * @return all info about that subscription
     */
    public T getInfo() {
        return info;
    }
}
