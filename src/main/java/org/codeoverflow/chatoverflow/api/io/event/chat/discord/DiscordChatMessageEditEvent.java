package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEditEvent;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a user edits a message in a discord channel
 */
public class DiscordChatMessageEditEvent extends ChatMessageEditEvent<DiscordChatMessage> {

    public DiscordChatMessageEditEvent(DiscordChatMessage newMessage, DiscordChatMessage oldMessage, OffsetDateTime time) {
        super(newMessage, oldMessage, time);
    }
}
