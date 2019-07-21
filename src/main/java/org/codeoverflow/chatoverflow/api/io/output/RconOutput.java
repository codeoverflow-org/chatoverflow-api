package org.codeoverflow.chatoverflow.api.io.output;

public interface RconOutput extends Output {


    /**
     * Execute a command on a remote (rcon) server.
     * Notice: There is no way of knowing if the commands exists.
     * @param command the command which should be executed
     * @return if the command was successfully sent to the server. (Returns false for e.g. a not anymore existent server)
     */
    boolean sendCommand(String command);
}
