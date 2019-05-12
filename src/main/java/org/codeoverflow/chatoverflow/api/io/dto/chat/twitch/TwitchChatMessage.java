package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.Channel;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.util.List;

/**
 * Chat message that is send in a twitch chat
 */
public class TwitchChatMessage extends ChatMessage<TwitchChatMessageAuthor, Channel, ChatEmoticon> {

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, Long timestamp, Channel channel) {
        super(author, message, timestamp, channel);
    }

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, Long timestamp, Channel channel, List<ChatEmoticon> emoticons) {
        super(author, message, timestamp, channel, emoticons);
    }
}
