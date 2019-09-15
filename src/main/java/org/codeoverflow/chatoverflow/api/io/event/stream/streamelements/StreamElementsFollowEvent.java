package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsFollow;
import org.codeoverflow.chatoverflow.api.io.event.stream.FollowEvent;

/**
 * Event that is triggered by StreamElements if a user starts following your channel.
 */
public class StreamElementsFollowEvent extends FollowEvent<StreamElementsFollow> implements StreamElementsEvent {
    public StreamElementsFollowEvent(StreamElementsFollow info) {
        super(info);
    }
}
