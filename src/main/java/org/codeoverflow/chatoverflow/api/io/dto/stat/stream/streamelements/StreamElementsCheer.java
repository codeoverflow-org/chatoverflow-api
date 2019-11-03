package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Cheer;

import java.time.OffsetDateTime;

public class StreamElementsCheer extends Cheer<User> {
    public StreamElementsCheer(User cheerer, int amount, String cheerMessage, OffsetDateTime time) {
        super(cheerer, amount, cheerMessage, time);
    }
}
