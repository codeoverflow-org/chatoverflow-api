package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.event.serial.SerialDataAvailableEvent;
import org.codeoverflow.chatoverflow.api.io.event.serial.SerialEvent;
import org.codeoverflow.chatoverflow.api.io.input.event.EventInput;

import java.io.InputStream;
import java.util.function.Consumer;

/**
 * Connects to a device that is connected to your pc through a serial port (an Arduino for example)
 * to receive data
 */
@IsRequirement(requires = "connection with a device connected to a serial port (an Arduino for example)")
public interface SerialInput extends EventInput<SerialEvent> {

    /**
     * Get a input stream to easily read all incoming data<br>
     * I suggest wrapping this with a {@link java.io.BufferedInputStream} or a {@link java.io.BufferedReader}
     *
     * @return stream of incoming data
     */
    InputStream getInputStream();


    /**
     * Register an event handler that listens to all {@link SerialDataAvailableEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerDataAvailableEventHandler(Consumer<SerialDataAvailableEvent> eventHandler) {
        registerEventHandler(eventHandler, SerialDataAvailableEvent.class);
    }
}
