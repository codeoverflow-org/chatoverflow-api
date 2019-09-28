package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.event.stream.RaidEvent;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsRaid;

/**
 * Event that is triggered by StreamElements if a streamer raids your channel
 */
public class StreamElementsRaidEvent extends RaidEvent<StreamElementsRaid> implements StreamElementsEvent {
    public StreamElementsRaidEvent(StreamElementsRaid raidInfo) {
        super(raidInfo);
    }
}
