package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

public class Subscription<T extends User> {
    private final T subscriber;
    private final OffsetDateTime time;
    private final int resub;
    private final SubscriptionTier tier;
    private final boolean gifted;
    private final T donor;

    public Subscription(T subscriber, OffsetDateTime time, int resub, SubscriptionTier tier, boolean gifted, T donor) {
        this.subscriber = subscriber;
        this.time = time;
        this.resub = resub;
        this.tier = tier;
        this.gifted = gifted;
        this.donor = donor;
    }

    /**
     * Get the user object of the person that started following
     *
     * @return the subscriber
     */
    public T getSubscriber() {
        return subscriber;
    }

    /**
     * Get the time when the user has subscribed
     *
     * @return subscription time
     */
    public OffsetDateTime getTime() {
        return time;
    }

    /**
     * Returns how often that user has subscribed
     *
     * @return how often a user resubbed
     */
    public int getResub() {
        return resub;
    }

    /**
     * Returns the tier of the subscription {@link SubscriptionTier}.
     *
     * @return the sub tier
     */
    public SubscriptionTier getTier() {
        return tier;
    }

    /**
     * Returns if the sub was gifted by someone else or not
     *
     * @return it the sub was gifted
     */
    public boolean isGifted() {
        return gifted;
    }

    /**
     * Returns the donor of the subscription if it was gifted.
     *
     * @return the donor of the sub
     */
    public T getDonor() {
        return donor;
    }
}
