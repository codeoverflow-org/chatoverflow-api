package org.codeoverflow.chatoverflow.api.io.input.chat;

public interface DiscordChatInput extends ChatInput<DiscordChatMessage> {

    // To be consistent with other inputs, there is currently only one input channel allowed
    void setChannel(long channelId);
}
