package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.discord.DiscordEvent;

import java.util.Optional;
import java.util.concurrent.Future;

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
}
