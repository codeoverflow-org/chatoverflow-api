package org.codeoverflow.chatoverflow.api.io.input.chat;


import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.twitch.TwitchEvent;
import org.codeoverflow.chatoverflow.api.io.input.chat.ChatInput;

/**
 * Input connecting to the Twitch Internet Relay Chat, allows public and private channels
 * <p>
 * <b>Important notice:</b><br>
 * <b>Call {@link #setChannel(String)} to bind this input to a channel before performing any other action</b>}
 */
public interface TwitchChatInput extends ChatInput<TwitchChatMessage, TwitchEvent>, PrivateChatInput<TwitchChatMessage, TwitchEvent> {

    /**
     * Changes the twitch channel to input from
     *
     * @param channel name of the channel
     */
    void setChannel(String channel);

}
