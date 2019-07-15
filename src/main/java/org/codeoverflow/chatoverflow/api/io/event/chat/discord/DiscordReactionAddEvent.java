package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordReaction;

import java.time.OffsetDateTime;

/**
 * Event that is triggered when a reaction is added to a discord chat message
 */
public class DiscordReactionAddEvent extends DiscordReactionEvent implements DiscordEvent {

    public DiscordReactionAddEvent(DiscordChatMessage message, DiscordReaction reaction) {
        super(message, reaction);
    }
}
