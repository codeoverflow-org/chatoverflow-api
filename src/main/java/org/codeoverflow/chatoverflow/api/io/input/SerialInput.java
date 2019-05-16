package org.codeoverflow.chatoverflow.api.io.input;

import java.io.InputStream;
import java.util.function.Consumer;

/**
 * Connects to a device that is connected to your pc through a serial port (an Arduino for example)
 * to receive data
 */
public interface SerialInput extends Input {

    /**
     * Listen for incoming data as string
     *
     * @param consumer consumer to accept a incoming string
     */
    void registerStringListener(Consumer<String> consumer);

    /**
     * Listen for incoming data in a raw form
     *
     * @param consumer consumer to accept a byte array with the data
     */
    void registerDataListener(Consumer<byte[]> consumer);

    /**
     * Get a input stream to easily read all incoming data<br>
     * I suggest wrapping this with a {@link java.io.BufferedInputStream} or a {@link java.io.BufferedReader}
     *
     * @return stream of incoming data
     */
    InputStream getInputStream();
}
