package org.codeoverflow.chatoverflow.api.io.input.chat;

public class DiscordChatMessageAuthor extends ChatMessageAuthor {

    //TODO Shoudl this have getCreationTime() Method?
    //TODO Abstraction for snowflake Id?

    private final long snowflakeId;

    public DiscordChatMessageAuthor(String displayName, long snowflakeId) {
        super(displayName);
        this.snowflakeId = snowflakeId;
    }

    public long getSnowflakeId() {
        return snowflakeId;
    }
}
