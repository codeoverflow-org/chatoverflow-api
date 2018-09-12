package org.codeoverflow.chatoverflow.api.io.input.chat;

public class TwitchChatEmoticon extends ChatEmoticon {
    public TwitchChatEmoticon(String regex, String id, int index) {
        super(regex, id, "https://static-cdn.jtvnw.net/emoticons/v1/" + id + "/1.0", index);
    }
}
