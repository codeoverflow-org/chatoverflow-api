package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

/**
 * An emoji that is displayed in twitch chat messages
 */
public class TwitchChatEmoticon extends ChatEmoticon implements Identifiable {

    private final String id;

    public TwitchChatEmoticon(String regex, String id, int index) {
        super(regex, "https://static-cdn.jtvnw.net/emoticons/v1/" + id + "/1.0", index);
        this.id = id;
    }


    /**
     * @return twitchs unique id to identify the emoji
     */
    @Override
    public String getId() {
        return null;
    }
}
