package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;


import java.util.Arrays;

/**
 * The streaming provider from which a StreamElements event is originated. Either Twitch or Youtube.
 */
public enum StreamElementsProvider {
    // StreamElements only supports Twitch and Youtube
    TWITCH,
    YOUTUBE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    /**
     * Parse the provider from a string
     * @param provider string with the providers name
     * @return the provider for that string or null, if it doesn't exists.
     */
    public static StreamElementsProvider parse(String provider) {
        return Arrays.stream(values()).filter(p -> p.toString().equals(provider.trim().toLowerCase())).findAny().orElse(null);
    }
}
