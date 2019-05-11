package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;

public class TwitchChatMessageAuthor extends ChatMessageAuthor {

    private boolean premium;
    private boolean broadcaster;
    private boolean moderator;
    private boolean subscriber;

    public TwitchChatMessageAuthor(String displayName) {
        super(displayName);
        this.premium = false;
    }

    public TwitchChatMessageAuthor(String displayName, boolean broadcaster, boolean moderator, boolean subscriber, boolean premium) {
        super(displayName);
        this.premium = premium;
        this.broadcaster = broadcaster;
        this.moderator  = moderator;
        this.subscriber = subscriber;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isBroadcaster() {
        return broadcaster;
    }

    public boolean isModerator() {
        return moderator;
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setBroadcaster(boolean broadcaster) {
        this.broadcaster = broadcaster;
    }

    public void setModerator(boolean moderator) {
        this.moderator = moderator;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }
}
