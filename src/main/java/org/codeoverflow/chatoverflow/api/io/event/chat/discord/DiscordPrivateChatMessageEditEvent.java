package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEditEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a user edits a private message on discord
 */
public class DiscordPrivateChatMessageEditEvent extends ChatMessageEditEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordPrivateChatMessageEditEvent(DiscordChatMessage newMessage, DiscordChatMessage oldMessage) {
        super(newMessage, oldMessage);
    }

}
