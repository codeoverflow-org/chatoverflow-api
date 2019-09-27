package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamRaid;
import org.codeoverflow.chatoverflow.api.io.event.stream.RaidEvent;

/**
 * Event that is triggered by tipeeestream if a streamer raids your channel
 */
public class TipeeestreamRaidEvent extends RaidEvent<TipeeestreamRaid> implements TipeeestreamEvent {
    public TipeeestreamRaidEvent(TipeeestreamRaid raidInfo) {
        super(raidInfo);
    }
}
