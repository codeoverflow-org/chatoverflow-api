package org.codeoverflow.chatoverflow.api.io.event.chat.mockup;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

/**
 * Event that is triggered if a private message is send from mockup chat
 */
public class MockupPrivateChatMessageReceiveEvent extends MockupChatMessageReceiveEvent implements MockupEvent {

    public MockupPrivateChatMessageReceiveEvent(ChatMessage message) {
        super(message);
    }
}
