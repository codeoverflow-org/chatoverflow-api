package org.codeoverflow.chatoverflow.api.io.input;

public interface RconInput extends Input {

    /**
     * Get the output of a rcon command
     * Command will be directly executed on the rcon server and the returned response will be returned
     * If null is returned this means that there is some problem with the connection (typically the server is shut down or there is some other reason for a lost connection)
     * Notice: There is no way of knowing that a command exists, which does not return a response. Every command without response will return an empty string.
     * @param command the command which should be executed on the remote server
     * @return response of the server or null
     */
    String getCommandOutput(String command);
}
