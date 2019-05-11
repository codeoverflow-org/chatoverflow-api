package org.codeoverflow.chatoverflow.api.io.input.chat;


import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.input.chat.ChatInput;

public interface TwitchChatInput extends ChatInput<TwitchChatMessage> {

    // To be consistent with other inputs, there is currently only one input channel allowed
    void setChannel(String channel);

}
