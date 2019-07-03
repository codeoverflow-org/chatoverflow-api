package org.codeoverflow.chatoverflow.api.io.event.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.time.OffsetDateTime;

/**
 * An event that indicates the creation of a chat message
 */
public abstract class ChatMessageReceiveEvent<T extends ChatMessage> extends ChatMessageEvent<T> {

    public ChatMessageReceiveEvent(T message) {
        super(message);
    }
}
