package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamFollow;
import org.codeoverflow.chatoverflow.api.io.event.stream.FollowEvent;

/**
 * Event that is triggered by tipeeestream if a user follows your channel
 */
public class TipeeestramFollowEvent extends FollowEvent<TipeeestreamFollow> implements TipeeestreamEvent {
    public TipeeestramFollowEvent(TipeeestreamFollow info) {
        super(info);
    }
}
