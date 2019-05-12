package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.List;
import java.util.function.Consumer;

/**
 * A input that connects to a service using a connector and allows to handle incoming chat messages
 *
 * @param <T> type of the incoming chat messages
 */
public interface ChatInput<T extends ChatMessage> extends Input {

    /**
     * Let's you retrieve all chat messages that were recently received
     *
     * @param lastMilliseconds how old messages you want to get, maximum age in milliseconds
     * @return list that contains copies of all last messages
     */
    List<T> getLastMessages(long lastMilliseconds);

    /**
     * Let's you register a simple handler immediately react on incoming messages
     *
     * @param handler the consumer to handle incoming messages
     */
    void registerMessageHandler(Consumer<T> handler);
}
