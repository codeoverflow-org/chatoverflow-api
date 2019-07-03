package org.codeoverflow.chatoverflow.api.io.event.chat.mockup;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered if a message is send from mockup chat
 */
public class MockupChatMessageSendEvent extends ChatMessageSendEvent implements MockupEvent {

    public MockupChatMessageSendEvent(ChatMessage message) {
        super(message);
    }
}
