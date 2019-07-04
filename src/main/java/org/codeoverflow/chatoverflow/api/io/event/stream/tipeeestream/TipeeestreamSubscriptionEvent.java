package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamSubscription;
import org.codeoverflow.chatoverflow.api.io.event.stream.SubscriptionEvent;

/**
 * Event that is triggered by tipeeestream if a user subscribes your channel
 */
public class TipeeestreamSubscriptionEvent extends SubscriptionEvent<TipeeestreamSubscription> implements TipeeestreamEvent {
    public TipeeestreamSubscriptionEvent(TipeeestreamSubscription info) {
        super(info);
    }
}
