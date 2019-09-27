package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamHost;
import org.codeoverflow.chatoverflow.api.io.event.stream.HostEvent;

public class TipeeestreamHostEvent extends HostEvent<TipeeestreamHost> implements TipeeestreamEvent {
    public TipeeestreamHostEvent(TipeeestreamHost cheerInfo) {
        super(cheerInfo);
    }
}
