package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Cheer;

import java.time.OffsetDateTime;

public class TipeeestreamCheer extends Cheer<User> {
    public TipeeestreamCheer(User cheerer, int amount, String cheerMessage, OffsetDateTime time) {
        super(cheerer, amount, cheerMessage, time);
    }
}
