package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import java.util.Arrays;

/**
 * Represents the tier of a {@link Subscription}.
 */
public enum SubscriptionTier {
    PRIME, // Free for the user, same as a tier 1 for the streamer.
    TIER1, // 4.99
    TIER2, // 9.99
    TIER3, // 24.99
    UNKNOWN;

    /**
     * Converts the tier to a string, e.g. {@link #TIER1} is "tier 1", {@link #PRIME} is "prime" and
     * {@link #UNKNOWN} is "unknown".
     *
     * @return the tier formatted as a string.
     */
    @Override
    public String toString() {
        switch (this) {
            case PRIME: return "prime";
            case TIER1: return "tier 1";
            case TIER2: return "tier 2";
            case TIER3: return "tier 3";
            default: return "unknown";
        }
    }

    /**
     * Parse the tier from a string
     *
     * @param tier the tier of the subscription. 0 is prime, 1 is tier 1 and so on.
     * @return the subscription-tier represented by the passed number or {@link #UNKNOWN}.
     */
    public static SubscriptionTier parse(int tier) {
        return Arrays.stream(values())
                .filter(e -> e.ordinal() == tier)
                .findAny().orElse(UNKNOWN);
    }
}