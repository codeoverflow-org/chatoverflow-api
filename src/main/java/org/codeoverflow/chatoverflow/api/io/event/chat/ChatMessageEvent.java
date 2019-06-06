package org.codeoverflow.chatoverflow.api.io.event.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.Event;

import java.time.OffsetDateTime;

/**
 * An event that involved a {@link ChatMessage}
 */
public abstract class ChatMessageEvent<T extends ChatMessage> extends Event {
    private final T message;

    public ChatMessageEvent(T message) {
        super();
        this.message = message;
    }

    public ChatMessageEvent(T message, OffsetDateTime time) {
        super(time);
        this.message = message;
    }

    /**
     * @return the message involved in this event
     */
    public T getMessage() {
        return message;
    }
}
