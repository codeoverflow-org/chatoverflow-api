package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

public class TwitchChatEmoticon extends ChatEmoticon implements Identifiable {

    private String id;

    public TwitchChatEmoticon(String regex, String id, int index) {
        super(regex, "https://static-cdn.jtvnw.net/emoticons/v1/" + id + "/1.0", index);
        this.id = id;
    }

    @Override
    public String getId() {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }
}
