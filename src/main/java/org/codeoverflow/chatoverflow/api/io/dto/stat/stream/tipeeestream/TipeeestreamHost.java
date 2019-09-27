package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Host;

import java.time.OffsetDateTime;

public class TipeeestreamHost extends Host<User> {
    public TipeeestreamHost(User streamer, String message, int viewerCount, OffsetDateTime time) {
        super(streamer, message, viewerCount, time);
    }
}
