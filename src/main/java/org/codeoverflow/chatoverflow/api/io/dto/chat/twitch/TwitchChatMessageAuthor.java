package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;

/**
 * The twitch user that did send a message in twitch chat
 */
public class TwitchChatMessageAuthor extends ChatMessageAuthor {

    private final boolean turbo;
    private final boolean broadcaster;
    private final boolean moderator;
    private final boolean subscriber;
    private final boolean vip;

    public TwitchChatMessageAuthor(String displayName) {
        super(displayName);
        this.turbo = false;
        this.broadcaster = false;
        this.moderator  = false;
        this.subscriber = false;
        this.vip = false;
    }

    public TwitchChatMessageAuthor(String displayName, String color) {
        this(displayName, color, false, false, false, false, false);
    }

    public TwitchChatMessageAuthor(String displayName, String color, boolean broadcaster, boolean moderator, boolean subscriber, boolean turbo, boolean vip) {
        super(displayName, displayName, color);
        this.turbo = turbo;
        this.broadcaster = broadcaster;
        this.moderator  = moderator;
        this.subscriber = subscriber;
        this.vip = vip;
    }

    /**
     * @return true if the user has twitch turbo, false otherwise
     */
    public boolean isTurbo() {
        return turbo;
    }

    /**
     * @return true if the user is a broadcaster, false otherwise
     */
    public boolean isBroadcaster() {
        return broadcaster;
    }

    /**
     * @return true if the user is a moderator of the channel, false otherwise
     */
    public boolean isModerator() {
        return moderator;
    }

    /**
     * @return true if the user has subscribed to the channel, false otherwise
     */
    public boolean isSubscriber() {
        return subscriber;
    }

    /**
     * @return true if the user is a vip of the channel, false otherwise
     */
    public boolean isVIP() {
        return vip;
    }
}
