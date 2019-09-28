package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Host;

import java.time.OffsetDateTime;

public class StreamElementsHost extends Host<User> {
    public StreamElementsHost(User streamer, String message, int viewerCount, OffsetDateTime time) {
        super(streamer, message, viewerCount, time);
    }
}
