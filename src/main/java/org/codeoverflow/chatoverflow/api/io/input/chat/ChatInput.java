package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.Event;
import org.codeoverflow.chatoverflow.api.io.input.event.EventInput;

import java.util.List;

/**
 * A input that connects to a service using a connector and allows to handle incoming chat messages
 *
 * @param <T> type of the incoming chat messages
 * @param <S> type of the events provided by this input
 */
public interface ChatInput<T extends ChatMessage, S extends Event> extends EventInput<S> {

    /**
     * Let's you retrieve all chat messages that were recently received
     *
     * @param lastMilliseconds how old messages you want to get, maximum age in milliseconds
     * @return list that contains copies of all last messages
     */
    List<T> getLastMessages(long lastMilliseconds);
}
