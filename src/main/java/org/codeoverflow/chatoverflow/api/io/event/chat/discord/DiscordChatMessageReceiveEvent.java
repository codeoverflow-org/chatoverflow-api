package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageReceiveEvent;

/**
 * Event that is triggered when a user sends a message in a discord channel
 */
public class DiscordChatMessageReceiveEvent extends ChatMessageReceiveEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordChatMessageReceiveEvent(DiscordChatMessage message) {
        super(message);
    }
}
