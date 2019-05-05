package org.codeoverflow.chatoverflow.api.io.input.chat;


public class DiscordChatMessage extends ChatMessage {

    //TODO: Support for emojis
    //TODO: Calculate timestamp from snowflakeId
    //TODO: Support for reactions?
    private final long snowflakeId;

    public DiscordChatMessage(ChatMessageAuthor author, String message, Long timestamp, Channel channel, long snowflakeId) {
        super(author, message, timestamp, channel);
        this.snowflakeId = snowflakeId;
    }

    public long getSnowflakeId() {
        return snowflakeId;
    }
}
