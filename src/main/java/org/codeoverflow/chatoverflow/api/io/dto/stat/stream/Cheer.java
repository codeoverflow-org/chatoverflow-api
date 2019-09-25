package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

/**
 * A user has cheered some bits to your stream
 */
public class Cheer<T extends User> {
    private final T cheerer;
    private final int amount;
    private final String cheerMessage;
    private final OffsetDateTime time;

    public Cheer(T cheerer, int amount, String cheerMessage, OffsetDateTime time) {
        this.cheerer = cheerer;
        this.amount = amount;
        this.cheerMessage = cheerMessage;
        this.time = time;
    }

    /**
     * Get the user object of the person that has cheered
     *
     * @return the cheerer
     */
    public T getCheerer() {
        return cheerer;
    }

    /**
     * Get how much the user cheered in twitch bits
     *
     * @return amount of cheered bits e.g. 100
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Get the message with which the user has cheered
     *
     * @return the cheer message
     */
    public String getMessage() {
        return cheerMessage;
    }

    /**
     * Get the time when the cheer was made
     *
     * @return cheer time
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
