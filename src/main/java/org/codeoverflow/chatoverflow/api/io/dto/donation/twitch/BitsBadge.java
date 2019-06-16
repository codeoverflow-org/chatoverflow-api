package org.codeoverflow.chatoverflow.api.io.dto.donation.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.User;

public class BitsBadge {
    private final String channelID;
    private final String channelName;
    private final String chatMessage;
    private final User user;
    private final int tier;
    private final Long timestamp;

    public BitsBadge(String channelID, String channelName, String chatMessage, User user, int tier, Long timestamp) {
        this.channelID = channelID;
        this.channelName = channelName;
        this.chatMessage = chatMessage;
        this.user = user;
        this.tier = tier;
        this.timestamp = timestamp;
    }

    /**
     * @return ID of the channel where user earned new Bits badge
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * @return name of the channel where user earned new Bits badge
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return (Optional) custom message included with share
     */
    public String getChatMessage() {
        return chatMessage;
    }

    /**
     * @return user who earned new Bits badge
     */
    public User getUser() {
        return user;
    }

    /**
     * @return value of bits badge that was earned
     */
    public int getTier() {
        return tier;
    }

    /**
     * @return time when the bits badge was earned
     */
    public Long getTimestamp() {
        return timestamp;
    }
}
