package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Host;

/**
 * Generic event for hosts
 */
public abstract class HostEvent<T extends Host> {

    private final T info;

    protected HostEvent(T cheerInfo) {
        this.info = cheerInfo;
    }

    /**
     * Get the Host object that contains all information about that host
     *
     * @return all info about that host
     */
    public T getInfo() {
        return info;
    }
}
