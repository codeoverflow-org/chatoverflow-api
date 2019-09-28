package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsHost;
import org.codeoverflow.chatoverflow.api.io.event.stream.HostEvent;

/**
 * Event that is triggered by StreamElements if a streamer starts hosting your stream on their channel
 */
public class StreamElementsHostEvent extends HostEvent<StreamElementsHost> implements StreamElementsEvent {
    public StreamElementsHostEvent(StreamElementsHost cheerInfo) {
        super(cheerInfo);
    }
}
