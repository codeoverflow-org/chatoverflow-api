package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Raid;

import java.time.OffsetDateTime;

public class TipeeestreamRaid extends Raid<User> {
    public TipeeestreamRaid(User streamer, String message, int viewerCount, OffsetDateTime time) {
        super(streamer, message, viewerCount, time);
    }
}
