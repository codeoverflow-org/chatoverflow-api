package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered when a user deletes a private message on discord
 */
public class DiscordPrivateChatMessageDeleteEvent extends ChatMessageSendEvent<DiscordChatMessage> {

    public DiscordPrivateChatMessageDeleteEvent(DiscordChatMessage message) {
        super(message, message.getTime());
    }
}
