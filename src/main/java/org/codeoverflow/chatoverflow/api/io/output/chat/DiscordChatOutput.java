package org.codeoverflow.chatoverflow.api.io.output.chat;

import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.dto.chat.discord.DiscordEmbed;

/**
 * Output to send messages in a discord chat
 */
@IsRequirement(requires = "discord chat bot")
public interface DiscordChatOutput extends ChatOutput {

    /**
     * Changes the discord text channel to output to
     *
     * @param channelId id of the channel to output to
     * @throws IllegalArgumentException if the id is invalid
     */
    void setChannel(String channelId) throws IllegalArgumentException;

    /**
     * @return the id of the channel to output to
     */
    String getChannelId();

    /**
     * Send a message containing an embed<br>
     * For creating embeds try the {@link DiscordEmbed#Builder()}
     *
     * @param embed the embed
     */
    void sendChatMessage(DiscordEmbed embed);

    /**
     * Sends a file<br>
     *
     * @param file the file that should be send
     * @throws SecurityException if you try to access a file outside chatoverflows resource folder
     */
    void sendFile(String file) throws SecurityException;


    /**
     * Sends a file and a message<br>
     *
     * @param file the file that should be send
     * @param message a message that should be displayed above the file
     * @throws SecurityException if you try to access a file outside chatoverflows resource folder
     */
    void sendFile(String file, String message) throws SecurityException;
}
