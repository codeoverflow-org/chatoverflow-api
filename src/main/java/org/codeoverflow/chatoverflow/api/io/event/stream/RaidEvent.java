package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Raid;

/**
 * Generic event for raids
 */
public abstract class RaidEvent<T extends Raid> {

    private final T info;

    protected RaidEvent(T raidInfo) {
        this.info = raidInfo;
    }

    /**
     * Get the Raid object that contains all information about that raid
     *
     * @return all info about that raid
     */
    public T getInfo() {
        return info;
    }
}
