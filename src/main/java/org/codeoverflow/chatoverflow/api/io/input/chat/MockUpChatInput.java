package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.TextChannel;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;
import org.codeoverflow.chatoverflow.api.io.event.chat.discord.DiscordChatMessageDeleteEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.mockup.MockupChatMessageSendEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.mockup.MockupEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.mockup.MockupPrivateChatMessageSendEvent;

import java.util.function.Consumer;

/**
 * A MockUp chat input for testing purposes, allows simulating public and private messages
 */
public interface MockUpChatInput extends
        ChatInput<ChatMessage<ChatMessageAuthor, TextChannel, ChatEmoticon>, MockupEvent>,
        PrivateChatInput<ChatMessage<ChatMessageAuthor, TextChannel, ChatEmoticon>, MockupEvent> {

    /**
     * Register an event handler that listens to all {@link MockupChatMessageSendEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerChatMessageSendEventHandler(Consumer<MockupChatMessageSendEvent> eventHandler) {
        registerEventHandler(eventHandler, MockupChatMessageSendEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link MockupPrivateChatMessageSendEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerPrivateChatMessageSendEventHandler(Consumer<MockupPrivateChatMessageSendEvent> eventHandler) {
        registerEventHandler(eventHandler, MockupPrivateChatMessageSendEvent.class);
    }
}
