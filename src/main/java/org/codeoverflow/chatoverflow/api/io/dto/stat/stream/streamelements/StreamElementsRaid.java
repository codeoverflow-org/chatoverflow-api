package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Raid;

import java.time.OffsetDateTime;

public class StreamElementsRaid extends Raid<User> {
    public StreamElementsRaid(User streamer, String message, int viewerCount, OffsetDateTime time) {
        super(streamer, message, viewerCount, time);
    }
}
