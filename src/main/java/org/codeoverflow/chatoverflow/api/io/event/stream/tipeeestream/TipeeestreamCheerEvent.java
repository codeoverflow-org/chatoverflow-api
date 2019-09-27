package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamCheer;
import org.codeoverflow.chatoverflow.api.io.event.stream.CheerEvent;

/**
 * Event that is triggered by tipeeestream if a user cheers on the stream.
 */
public class TipeeestreamCheerEvent extends CheerEvent<TipeeestreamCheer> implements TipeeestreamEvent {
    public TipeeestreamCheerEvent(TipeeestreamCheer donationInfo) {
        super(donationInfo);
    }
}
