package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.Channel;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;

/**
 * A MockUp chat input for testing purposes, allows simulating public and private messages
 */
public interface MockUpChatInput extends
        ChatInput<ChatMessage<ChatMessageAuthor, Channel, ChatEmoticon>>,
        PrivateChatInput<ChatMessage<ChatMessageAuthor, Channel, ChatEmoticon>> {
}
