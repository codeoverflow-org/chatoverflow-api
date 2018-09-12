package org.codeoverflow.chatoverflow.api.io.input.chat;

import java.util.List;

public class TwitchChatMessage extends ChatMessage {

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, Long timestamp, Channel channel) {
        super(author, message, timestamp, channel);
    }

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, Long timestamp, Channel channel, List<ChatEmoticon> emoticons) {
        super(author, message, timestamp, channel, emoticons);
    }

    public TwitchChatMessage(TwitchChatMessageAuthor author, String message, Long timestamp, Channel channel, List<ChatEmoticon> emoticons, String color) {
        super(author, message, timestamp, channel, emoticons, color);
    }
}
