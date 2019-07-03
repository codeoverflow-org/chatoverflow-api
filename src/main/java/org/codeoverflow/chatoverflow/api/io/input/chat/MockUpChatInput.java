package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.TextChannel;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;
import org.codeoverflow.chatoverflow.api.io.event.chat.mockup.MockupEvent;

/**
 * A MockUp chat input for testing purposes, allows simulating public and private messages
 */
public interface MockUpChatInput extends
        ChatInput<ChatMessage<ChatMessageAuthor, TextChannel, ChatEmoticon>, MockupEvent>,
        PrivateChatInput<ChatMessage<ChatMessageAuthor, TextChannel, ChatEmoticon>, MockupEvent> {
}
