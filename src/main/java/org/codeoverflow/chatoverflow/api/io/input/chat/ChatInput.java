package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.List;
import java.util.function.Consumer;

public interface ChatInput extends Input {
    List<ChatMessage> getLastMessages(long lastMilliseconds);

    List<ChatMessage> getLastPrivateMessages(long lastMilliseconds);

    void registerMessageHandler(Consumer<ChatMessage> handler);

    void registerPrivateMessageHandler(Consumer<ChatMessage> handler);
}
