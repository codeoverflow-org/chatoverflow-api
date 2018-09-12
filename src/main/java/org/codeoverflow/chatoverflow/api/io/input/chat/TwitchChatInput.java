package org.codeoverflow.chatoverflow.api.io.input.chat;

import java.util.function.Consumer;

public interface TwitchChatInput extends ChatInput<TwitchChatMessage> {

    // To be consistent with other inputs, there is currently only one input channel allowed
    void setChannel(String channel);

}
