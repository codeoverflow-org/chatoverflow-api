package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.discord.*;

import java.util.Optional;
import java.util.concurrent.Future;
import java.util.function.Consumer;

public interface DiscordChatInput extends ChatInput<DiscordChatMessage, DiscordEvent>, PrivateChatInput<DiscordChatMessage, DiscordEvent> {

    /**
     * Changes the discord text channel to output to
     *
     * @param channelId id of the channel to output to
     */
    void setChannel(String channelId);

    /**
     * @return the id of the channel to output to
     */
    String getChannelId();

    /**
     * Retrieve a specific message form the buffer.<br>
     * <b>Use this if the message was received during this lifecycle,
     * for older messages use {@link #retrieveMessage(String)}</b>
     *
     * @param messageId id of the message to retrieve
     * @return a optional container with the retrieved message or an empty optional if none found
     */
    Optional<DiscordChatMessage> getMessage(String messageId);

    /**
     * Retrieve a specific message form the discord api.<br>
     * <b>Use this for old messages, if the message is already in the buffer use {@link #getMessage(String)}</b>
     *
     * @param messageId id of the message to retrieve
     * @return future container that returns an optional container with the retrieved message or an empty optional if none found
     */
    Future<Optional<DiscordChatMessage>> retrieveMessage(String messageId);

    /**
     * Register an event handler that listens to all {@link DiscordChatMessageDeleteEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerChatMessageDeleteEventHandler(Consumer<DiscordChatMessageDeleteEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordChatMessageDeleteEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordChatMessageEditEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerChatMessageEditEventHandler(Consumer<DiscordChatMessageEditEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordChatMessageEditEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordChatMessageReceiveEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerChatMessageReceiveEventHandler(Consumer<DiscordChatMessageReceiveEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordChatMessageReceiveEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordPrivateChatMessageDeleteEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerPrivateChatMessageDeleteEventHandler(Consumer<DiscordPrivateChatMessageDeleteEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordPrivateChatMessageDeleteEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordPrivateChatMessageEditEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerPrivateChatMessageEditEventHandler(Consumer<DiscordPrivateChatMessageEditEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordPrivateChatMessageEditEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordPrivateChatMessageReceiveEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerPrivateChatMessageReceiveEventHandler(Consumer<DiscordPrivateChatMessageReceiveEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordPrivateChatMessageReceiveEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordReactionAddEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerReactionAddEventHandler(Consumer<DiscordReactionAddEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordReactionAddEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link DiscordReactionRemoveEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerReactionRemoveEventHandler(Consumer<DiscordReactionRemoveEvent> eventHandler) {
        registerEventHandler(eventHandler, DiscordReactionRemoveEvent.class);
    }
}
