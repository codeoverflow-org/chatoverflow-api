package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered when a user sends a private message in a discord channel
 */
public class DiscordPrivateChatMessageSendEvent extends ChatMessageSendEvent<DiscordChatMessage> {

    public DiscordPrivateChatMessageSendEvent(DiscordChatMessage message) {
        super(message, message.getTime());
    }
}
