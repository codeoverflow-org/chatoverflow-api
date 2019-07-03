package org.codeoverflow.chatoverflow.api.io.event.chat.mockup;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

/**
 * Event that is triggered if a private message is send from mockup chat
 */
public class MockupPrivateChatMessageSendEvent extends MockupChatMessageSendEvent implements MockupEvent {

    public MockupPrivateChatMessageSendEvent(ChatMessage message) {
        super(message);
    }
}
