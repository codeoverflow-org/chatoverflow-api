package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

/**
 * Another streamer has started hosting your stream on their channel.
 */
public class Host<T extends User> {
    private final T streamer;
    private final String message;
    private final int viewerCount;
    private final OffsetDateTime time;

    public Host(T streamer, String message, int viewerCount, OffsetDateTime time) {
        this.streamer = streamer;
        this.message = message;
        this.viewerCount = viewerCount;
        this.time = time;
    }

    /**
     * Get the streamer which started hosting you.
     *
     * @return streamer that hosts you
     */
    public T getStreamer() {
        return streamer;
    }

    /**
     * Get the message from the streamer that has started hosting you.
     *
     * @return the host message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Get the viewer count with which the streamer is hosting you.
     *
     * @return the viewer count of the host
     */
    public int getViewerCount() {
        return viewerCount;
    }

    /**
     * Get the time when the streamer has started hosting you.
     *
     * @return host time
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
