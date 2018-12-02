package org.codeoverflow.chatoverflow.api.io.input.chat;

public class TwitchChatMessageAuthor extends ChatMessageAuthor {

    private boolean premium;
    private boolean vip;

    public TwitchChatMessageAuthor(String displayName) {
        super(displayName);
        this.premium = false;
    }

    public TwitchChatMessageAuthor(String displayName, boolean broadcaster, boolean moderator, boolean subscriber, boolean premium, boolean vip) {
        super(displayName, broadcaster, moderator, subscriber);
        this.premium = premium;
        this.vip = vip;
    }

    public boolean isPremium() {
        return premium;
    }
    
    public boolean isVIP() {
        return vip;
    }
}
