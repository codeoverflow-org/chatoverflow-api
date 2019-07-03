package org.codeoverflow.chatoverflow.api.io.event.chat.mockup;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageReceiveEvent;

/**
 * Event that is triggered if a message is send from mockup chat
 */
public class MockupChatMessageReceiveEvent extends ChatMessageReceiveEvent implements MockupEvent {

    public MockupChatMessageReceiveEvent(ChatMessage message) {
        super(message);
    }
}
