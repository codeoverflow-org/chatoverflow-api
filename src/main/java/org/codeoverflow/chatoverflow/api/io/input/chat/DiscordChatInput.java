package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface DiscordChatInput extends ChatInput<DiscordChatMessage>, PrivateChatInput<DiscordChatMessage> {

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
     * Retrieve a specific message form the buffer
     *
     * @param messageId id of the message to retrieve
     * @return the retrieved message or null if none found
     */
    DiscordChatMessage getMessage(String messageId);

    /**
     * Let's you register a simple handler to immediately react on edited messages
     *
     * @param handler the consumer to handle edited messages, first argument is the old, second the new message
     */
    void registerMessageEditHandler(BiConsumer<DiscordChatMessage, DiscordChatMessage> handler);

    /**
     * Let's you register a simple handler to immediately react on edited messages
     *
     * @param handler the consumer to handle edited messages, first argument is the old, second the new message
     */
    void registerPrivateMessageEditHandler(BiConsumer<DiscordChatMessage, DiscordChatMessage> handler);

    /**
     * Let's you register a simple handler to immediately react on deleted messages
     *
     * @param handler the consumer with the deleted message
     */
    void registerMessageDeleteHandler(Consumer<DiscordChatMessage> handler);

    /**
     * Let's you register a simple handler to immediately react on deleted messages
     *
     * @param handler the consumer with the deleted message
     */
    void registerPrivateMessageDeleteHandler(Consumer<DiscordChatMessage> handler);
}
