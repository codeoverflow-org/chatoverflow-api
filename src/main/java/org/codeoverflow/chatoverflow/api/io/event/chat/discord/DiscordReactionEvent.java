package org.codeoverflow.chatoverflow.api.io.event.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordChatMessage;
import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordReaction;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageEvent;

import java.time.OffsetDateTime;

/**
 * An event that involved a reaction to a discord message
 */
public abstract class DiscordReactionEvent extends ChatMessageEvent<DiscordChatMessage> {
    private final DiscordReaction reaction;

    public DiscordReactionEvent(DiscordChatMessage message, DiscordReaction reaction) {
        super(message, OffsetDateTime.now());
        this.reaction = reaction;
    }

    public DiscordReactionEvent(DiscordChatMessage message, DiscordReaction reaction, OffsetDateTime time) {
        super(message, time);
        this.reaction = reaction;
    }

    /**
     * @return the reaction involved in this event
     */
    public DiscordReaction getReaction() {
        return reaction;
    }
}
