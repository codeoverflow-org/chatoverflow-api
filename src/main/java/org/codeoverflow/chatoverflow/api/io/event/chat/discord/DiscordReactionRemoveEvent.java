package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordReaction;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a reaction is removed from a discord message
 */
public class DiscordReactionRemoveEvent extends DiscordReactionEvent {

    public DiscordReactionRemoveEvent(DiscordChatMessage message, DiscordReaction reaction) {
        super(message, reaction);
    }

    public DiscordReactionRemoveEvent(DiscordChatMessage message, DiscordReaction reaction, OffsetDateTime time) {
        super(message, reaction, time);
    }
}
