package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageReceiveEvent;

/**
 * Event that is triggered when a user sends a private message in a discord channel
 */
public class DiscordPrivateChatMessageReceiveEvent extends ChatMessageReceiveEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordPrivateChatMessageReceiveEvent(DiscordChatMessage message) {
        super(message);
    }
}
