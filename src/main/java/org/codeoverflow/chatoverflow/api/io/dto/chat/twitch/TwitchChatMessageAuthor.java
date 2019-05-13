package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;

/**
 * The twitch user that did send a message in twitch chat
 */
public class TwitchChatMessageAuthor extends ChatMessageAuthor {

    private final boolean premium;
    private final boolean broadcaster;
    private final boolean moderator;
    private final boolean subscriber;

    public TwitchChatMessageAuthor(String displayName) {
        super(displayName);
        this.premium = false;
        broadcaster = false;
        moderator = false;
        subscriber = false;
    }

    public TwitchChatMessageAuthor(String displayName, boolean broadcaster, boolean moderator, boolean subscriber, boolean premium) {
        super(displayName);
        this.premium = premium;
        this.broadcaster = broadcaster;
        this.moderator  = moderator;
        this.subscriber = subscriber;
    }

    /**
     * TODO Remove
     */
    @Deprecated
    public boolean isPremium() {
        return premium;
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
}
