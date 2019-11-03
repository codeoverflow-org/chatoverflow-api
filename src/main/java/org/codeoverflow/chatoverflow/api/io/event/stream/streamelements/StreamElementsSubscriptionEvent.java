package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsSubscription;
import org.codeoverflow.chatoverflow.api.io.event.stream.SubscriptionEvent;

/**
 * A event that is triggered by StreamElements if a users subscribes your channel.
 */
public class StreamElementsSubscriptionEvent extends SubscriptionEvent<StreamElementsSubscription> implements StreamElementsEvent {
    public StreamElementsSubscriptionEvent(StreamElementsSubscription info) {
        super(info);
    }
}
