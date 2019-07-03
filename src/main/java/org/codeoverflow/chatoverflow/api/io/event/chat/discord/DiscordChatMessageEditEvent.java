package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEditEvent;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a user edits a message in a discord channel
 */
public class DiscordChatMessageEditEvent extends ChatMessageEditEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordChatMessageEditEvent(DiscordChatMessage newMessage, DiscordChatMessage oldMessage) {
        super(newMessage, oldMessage);
    }
}
