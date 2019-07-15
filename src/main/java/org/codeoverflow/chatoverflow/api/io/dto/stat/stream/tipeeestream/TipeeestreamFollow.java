package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Follow;

import java.time.OffsetDateTime;

public class TipeeestreamFollow extends Follow<User> {

    private final TipeeestreamProvider provider;

    public TipeeestreamFollow(User follower, OffsetDateTime time, TipeeestreamProvider provider) {
        super(follower, time);
        this.provider = provider;
    }

    /**
     * Get the service over which this follow was made
     *
     * @return the provider of this follow
     */
    public TipeeestreamProvider getProvider() {
        return provider;
    }
}
