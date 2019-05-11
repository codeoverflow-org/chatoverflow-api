package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.List;
import java.util.function.Consumer;

/**
 * Just like {@link ChatInput} but with private chats instead of public ones
 *
 * @param <T> type of the incoming chat messages
 */
public interface PrivateChatInput<T extends ChatMessage> extends Input {

    /**
     * Let's you retrieve all private messages that were recently received
     *
     * @param lastMilliseconds how old messages you want to get, maximum age in milliseconds
     * @return list that contains copies of all last messages
     */
    List<T> getLastPrivateMessages(long lastMilliseconds);


    /**
     * Let's you register a simple handler immediately react on incoming private messages
     * @param handler
     */
    void registerPrivateMessageHandler(Consumer<T> handler);
}
