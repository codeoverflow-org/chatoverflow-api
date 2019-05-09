package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatMessage;

public interface TwitchStatInput extends StatInput {
    void init();

    java.util.List<TwitchChatMessage> getVideoComments(String videoID);
}
