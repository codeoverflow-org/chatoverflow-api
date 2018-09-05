package org.codeoverflow.chatoverflow.api.io.output.chat;

import org.codeoverflow.chatoverflow.api.io.output.Output;

public interface ChatOutput extends Output {
    void sendChatMessage(String message);

    void init();
}
