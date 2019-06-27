package org.codeoverflow.chatoverflow.api.io.output;

public interface RconOutput extends Output {

    boolean sendCommand(String command);
}
