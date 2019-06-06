package org.codeoverflow.chatoverflow.api.io.event.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.time.OffsetDateTime;

/**
 * An event that indicates the creation of a chat message
 */
public abstract class ChatMessageSendEvent<T extends ChatMessage> extends ChatMessageEvent<T> {

    public ChatMessageSendEvent(T message) {
        super(message);
    }

    public ChatMessageSendEvent(T message, OffsetDateTime time) {
        super(message, time);
    }
}
