package org.codeoverflow.chatoverflow.api.io.event.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

/**
 * An event that indicates the removal of a chat message
 */
public abstract class ChatMessageDeleteEvent<T extends ChatMessage> extends ChatMessageEvent<T> {

    public ChatMessageDeleteEvent(T message) {
        super(message);
    }
}
