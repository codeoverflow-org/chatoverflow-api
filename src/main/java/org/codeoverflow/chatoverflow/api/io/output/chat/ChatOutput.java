package org.codeoverflow.chatoverflow.api.io.output.chat;

import org.codeoverflow.chatoverflow.api.io.output.Output;

/**
 * An output that connects to a service using a connector to send messages
 */
public interface ChatOutput extends Output {

    /**
     * Send a message to this service
     * @param message the message as string
     */
    void sendChatMessage(String message);
}
