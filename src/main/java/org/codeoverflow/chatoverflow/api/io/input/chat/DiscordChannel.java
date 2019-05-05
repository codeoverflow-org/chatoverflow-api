package org.codeoverflow.chatoverflow.api.io.input.chat;

public class DiscordChannel extends Channel {

    private final long snowflakeId;

    public DiscordChannel(String name, long snowflakeId) {
        super(name);
        this.snowflakeId = snowflakeId;
    }

    public long getSnowflakeId() {
        return snowflakeId;
    }
}
