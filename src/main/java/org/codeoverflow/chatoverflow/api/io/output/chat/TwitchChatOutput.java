package org.codeoverflow.chatoverflow.api.io.output.chat;

/**
 * Output to send messages in the twitch chat
 * <p>
 * <b>Important notice:</b><br>
 * <b>Call {@link #setChannel(String)} to bind this input to a channel before performing any other action</b>}
 */
public interface TwitchChatOutput extends ChatOutput {

    /**
     * Changes the twitch channel to output to
     *
     * @param channel name of the channel
     */
    void setChannel(String channel);
}
