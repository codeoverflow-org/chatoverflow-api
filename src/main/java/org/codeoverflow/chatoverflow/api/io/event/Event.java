package org.codeoverflow.chatoverflow.api.io.event;

import java.time.OffsetDateTime;

/**
 * An generic event that was triggered by an event input
 */
public abstract class Event {

    private final OffsetDateTime time;

    public Event(OffsetDateTime time) {
        this.time = time;
    }

    public Event() {
        this(OffsetDateTime.now());
    }

    /**
     * @return the t ime when the event was triggered
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
