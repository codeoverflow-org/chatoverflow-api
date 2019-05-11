package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.List;
import java.util.function.Consumer;

public interface ChatInput<T extends ChatMessage> extends Input {
    List<T> getLastMessages(long lastMilliseconds);

    List<T> getLastPrivateMessages(long lastMilliseconds);

    void registerMessageHandler(Consumer<T> handler);

    void registerPrivateMessageHandler(Consumer<T> handler);
}
