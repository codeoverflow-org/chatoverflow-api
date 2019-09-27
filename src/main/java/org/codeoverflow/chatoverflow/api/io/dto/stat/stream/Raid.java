package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

/**
 * Another streamer has started a raid against your stream.
 */
public class Raid<T extends User> {
    private final T streamer;
    private final String message;
    private final int viewerCount;
    private final OffsetDateTime time;

    public Raid(T streamer, String message, int viewerCount, OffsetDateTime time) {
        this.streamer = streamer;
        this.message = message;
        this.viewerCount = viewerCount;
        this.time = time;
    }

    /**
     * Get the streamer which started the raid.
     *
     * @return initiating streamer
     */
    public T getStreamer() {
        return streamer;
    }

    /**
     * Get the message from the initiating streamer.
     *
     * @return the raid message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Get the viewer count with which the streamer raids you.
     *
     * @return the viewer count of the raid
     */
    public int getViewerCount() {
        return viewerCount;
    }

    /**
     * Get the time when the raid has started
     *
     * @return raid time
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
