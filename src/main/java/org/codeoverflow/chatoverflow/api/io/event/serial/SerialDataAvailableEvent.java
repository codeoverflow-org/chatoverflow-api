package org.codeoverflow.chatoverflow.api.io.event.serial;

import org.codeoverflow.chatoverflow.api.io.event.Event;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SerialDataAvailableEvent extends Event {

    private final byte[] data;

    public SerialDataAvailableEvent(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public String getAsString(Charset charset) {
        return new String(data, charset);
    }

    public String getAsString() {
        return new String(data, StandardCharsets.US_ASCII);
    }

    public int getAvailable() {
        return data.length;
    }
}
