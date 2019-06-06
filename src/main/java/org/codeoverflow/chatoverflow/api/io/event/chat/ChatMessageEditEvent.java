package org.codeoverflow.chatoverflow.api.io.event.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.time.OffsetDateTime;

/**
 * An event that indicates edits of a chat message
 */
public abstract class ChatMessageEditEvent<T extends ChatMessage> extends ChatMessageEvent<T> {

    private final T oldMessage;

    public ChatMessageEditEvent(T newMessage, T oldMessage) {
        super(newMessage);
        this.oldMessage = oldMessage;
    }

    public ChatMessageEditEvent(T newMessage, T oldMessage, OffsetDateTime time) {
        super(newMessage, time);
        this.oldMessage = oldMessage;
    }

    /**
     * @return the message as it was before it was edited
     */
    public T getOldMessage() {
        return oldMessage;
    }
}
