package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import java.util.Arrays;

/**
 * A provider service to which tipeeestream is connected (like youtoube or twitch)
 */
public enum TipeeestreamProvider {
    TWITCH,
    YOUTUBE,
    UNKNOWN;
    //Currently we have no dataset to test the less popular providers, therefore they are grouped under UNKNOWN

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    /**
     * Parse the provider from a string
     * @param provider string with the providers name
     * @return the provider for that string or {@link #UNKNOWN}
     */
    public static TipeeestreamProvider parse(String provider) {
        return Arrays.stream(values()).filter(p -> p.toString().equals(provider.trim().toLowerCase())).findAny().orElse(UNKNOWN);
    }
}
