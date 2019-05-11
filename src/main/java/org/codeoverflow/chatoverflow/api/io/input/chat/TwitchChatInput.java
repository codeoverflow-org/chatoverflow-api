package org.codeoverflow.chatoverflow.api.io.input.chat;


import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.input.chat.ChatInput;

/**
 * Input connecting to the Twitch Internet Relay Chat, allows public and private channels
 * <p>
 * <b>Note:</b><br>
 * To be consistent with other inputs, there is currently only one input channel allowed<br>
 * For changing the twitch channel see {@link #setChannel(String)}
 */
public interface TwitchChatInput extends ChatInput<TwitchChatMessage>, PrivateChatInput<TwitchChatMessage> {

    /**
     * Changes the twitch channel to input from
     * @param channel name of the channel
     */
    void setChannel(String channel);

}
