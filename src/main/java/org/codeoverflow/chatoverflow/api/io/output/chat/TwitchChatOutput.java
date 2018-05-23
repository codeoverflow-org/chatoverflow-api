package org.codeoverflow.chatoverflow.api.io.output.chat;

public interface TwitchChatOutput extends ChatOutput {
    void sendChatMessage(String message);
}
