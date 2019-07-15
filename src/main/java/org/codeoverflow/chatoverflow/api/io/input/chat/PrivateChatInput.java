package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.Event;
import org.codeoverflow.chatoverflow.api.io.input.event.EventInput;

import java.util.List;

/**
 * Just like {@link ChatInput} but with private chats instead of public ones
 *
 * @param <T> type of the incoming chat messages
 * @param <S> type of the events provided by this input
 */
public interface PrivateChatInput<T extends ChatMessage, S extends Event> extends EventInput<S> {

    /**
     * Let's you retrieve all private messages that were recently received
     *
     * @param lastMilliseconds how old messages you want to get, maximum age in milliseconds
     * @return list that contains copies of all last messages
     */
    List<T> getLastPrivateMessages(long lastMilliseconds);
}
