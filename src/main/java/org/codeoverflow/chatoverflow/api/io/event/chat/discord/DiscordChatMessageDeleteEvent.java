package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageDeleteEvent;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a user deletes a message in a discord channel
 */
public class DiscordChatMessageDeleteEvent extends ChatMessageDeleteEvent<DiscordChatMessage> implements DiscordEvent {

    public DiscordChatMessageDeleteEvent(DiscordChatMessage message) {
        super(message);
    }
}
