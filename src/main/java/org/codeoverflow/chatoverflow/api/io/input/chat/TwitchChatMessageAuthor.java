package org.codeoverflow.chatoverflow.api.io.input.chat;

public class TwitchChatMessageAuthor extends ChatMessageAuthor {

    private boolean premium;

    public TwitchChatMessageAuthor(String displayName) {
        super(displayName);
        this.premium = false;
    }

    public TwitchChatMessageAuthor(String displayName, boolean broadcaster, boolean moderator, boolean subscriber, boolean premium) {
        super(displayName, broadcaster, moderator, subscriber);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}
