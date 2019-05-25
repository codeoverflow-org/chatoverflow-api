package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordReaction;

import java.util.Optional;
import java.util.concurrent.Future;
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

    /**
     * Let's you register a simple handler to immediately react on reactions
     *
     * @param handler a biconsumer that receives the reaction as first and the message as second argument
     */
    void registerReactionAddHandler(BiConsumer<DiscordReaction, DiscordChatMessage> handler);

    /**
     * Let's you register a simple handler to immediately react on the removal of reactions
     *
     * @param handler a biconsumer that receives the deleted reaction as first and the message as second argument
     */
    void registerReactionRemoveHandler(BiConsumer<DiscordReaction, DiscordChatMessage> handler);
}
