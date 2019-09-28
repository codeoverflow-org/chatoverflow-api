package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsCheer;
import org.codeoverflow.chatoverflow.api.io.event.stream.CheerEvent;

/**
 * Event that is triggered by StreamElements if a user has cheered to your stream.
 */
public class StreamElementsCheerEvent extends CheerEvent<StreamElementsCheer> implements StreamElementsEvent {
    public StreamElementsCheerEvent(StreamElementsCheer cheerInfo) {
        super(cheerInfo);
    }
}
