package org.codeoverflow.chatoverflow.api.io.input.chat;


import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.twitch.TwitchChatMessageReceiveEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.twitch.TwitchEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.twitch.TwitchPrivateChatMessageReceiveEvent;

import java.util.function.Consumer;

/**
 * Input connecting to the Twitch Internet Relay Chat, allows public and private channels
 * <p>
 * <b>Important notice:</b><br>
 * <b>Call {@link #setChannel(String)} to bind this input to a channel before performing any other action</b>}
 */
@IsRequirement
public interface TwitchChatInput extends ChatInput<TwitchChatMessage, TwitchEvent>, PrivateChatInput<TwitchChatMessage, TwitchEvent> {

    /**
     * Changes the twitch channel to input from
     *
     * @param channel name of the channel
     */
    void setChannel(String channel);

    /**
     * Register an event handler that listens to all {@link TwitchChatMessageReceiveEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerChatMessageReceiveEventHandler(Consumer<TwitchChatMessageReceiveEvent> eventHandler) {
        registerEventHandler(eventHandler, TwitchChatMessageReceiveEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TwitchPrivateChatMessageReceiveEvent}
     * @param eventHandler consumer that receives the Events
     */
    default void registerPrivateChatMessageReceiveEventHandler(Consumer<TwitchPrivateChatMessageReceiveEvent> eventHandler) {
        registerEventHandler(eventHandler, TwitchPrivateChatMessageReceiveEvent.class);
    }

    /**
     * Returns the username of provided twitch account
     *
     * @return the twitch username of the bot
     */
    String getUsername();

    /**
     * Sets whether the messages from the provided twitch account should be ignored or not.
     * Note that this setting defaults to false.
     *
     * @param ignore whether the bot's own messages should be ignored
     */
    void ignoreOwnMessages(boolean ignore);
}
