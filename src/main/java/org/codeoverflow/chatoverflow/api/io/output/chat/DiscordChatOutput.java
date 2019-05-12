package org.codeoverflow.chatoverflow.api.io.output.chat;

/**
 * Output to send messages in a discord chat
 */
public interface DiscordChatOutput extends ChatOutput {

    /**
     * Changes the discord text channel to output to
     * @param channelId id of the channel to output to
     */
    void setChannel(String channelId);

    /**
     * @return the id of the channel to output to
     */
    String getChannelId();
}
