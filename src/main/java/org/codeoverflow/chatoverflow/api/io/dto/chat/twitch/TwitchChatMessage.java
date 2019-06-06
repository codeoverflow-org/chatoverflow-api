package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.TextChannel;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Chat message that is send in a twitch chat
 */
public class TwitchChatMessage extends ChatMessage<TwitchChatMessageAuthor, TextChannel, ChatEmoticon> {

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, OffsetDateTime time, TextChannel channel) {
        super(author, message, time, channel);
    }

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, OffsetDateTime time, TextChannel channel, List<ChatEmoticon> emoticons) {
        super(author, message, time, channel, emoticons);
    }
}
