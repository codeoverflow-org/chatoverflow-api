package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Cheer;

/**
 * Generic event for cheers
 */
public abstract class CheerEvent<T extends Cheer> {

    private final T info;

    protected CheerEvent(T cheerInfo) {
        this.info = cheerInfo;
    }

    /**
     * Get the Cheer object that contains all information about that cheer
     *
     * @return all info about that cheer
     */
    public T getInfo() {
        return info;
    }
}
