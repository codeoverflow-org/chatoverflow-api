package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered when a user sends a message in a discord channel
 */
public class DiscordChatMessageSendEvent extends ChatMessageSendEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordChatMessageSendEvent(DiscordChatMessage message) {
        super(message);
    }
}
