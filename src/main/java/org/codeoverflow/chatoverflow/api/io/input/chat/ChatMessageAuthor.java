package org.codeoverflow.chatoverflow.api.io.input.chat;

public class ChatMessageAuthor {

    private String displayName;
    private boolean broadcaster;
    private boolean moderator;
    private boolean subscriber;

    public ChatMessageAuthor(String displayName) {
        this(displayName,false,false,false);
    }

    public ChatMessageAuthor(String displayName, boolean broadcaster, boolean moderator, boolean subscriber) {
        this.displayName = displayName;
        this.broadcaster = broadcaster;
        this.moderator = moderator;
        this.subscriber = subscriber;
    }

    public String getDisplayName() {
        return displayName;
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

    public String toString() {
        return displayName;
    }

    public String toHTMLString() {
        return "<span><b>" + displayName + "</b></span>";
    }
}
