package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.io.PrintStream;

/**
 * Connects to a device that is connected to your pc through a serial port (an Arduino for example)
 * to output data
 */
@IsRequirement(requires = "connection with a device connected to a serial port (an Arduino for example)")
public interface SerialOutput extends Output {

    /**
     * This print stream let's you easily write data to the serial port
     *
     * @return print stream connected to the serial port, autoFlush is true, encoding is US-ASCII
     */
    PrintStream getPrintStream();
}
