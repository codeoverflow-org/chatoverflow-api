package org.codeoverflow.chatoverflow.api.io.input.chat;

public interface TwitchChatInput extends ChatInput {

    // To be consistent with other inputs, there is currently only one input channel allowed
    void setChannel(String channel);
}
