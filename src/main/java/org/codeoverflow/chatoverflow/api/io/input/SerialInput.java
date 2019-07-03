package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.io.event.serial.SerialEvent;
import org.codeoverflow.chatoverflow.api.io.input.event.EventInput;

import java.io.InputStream;
import java.util.function.Consumer;

/**
 * Connects to a device that is connected to your pc through a serial port (an Arduino for example)
 * to receive data
 */
public interface SerialInput extends EventInput<SerialEvent> {

    /**
     * Get a input stream to easily read all incoming data<br>
     * I suggest wrapping this with a {@link java.io.BufferedInputStream} or a {@link java.io.BufferedReader}
     *
     * @return stream of incoming data
     */
    InputStream getInputStream();
}
