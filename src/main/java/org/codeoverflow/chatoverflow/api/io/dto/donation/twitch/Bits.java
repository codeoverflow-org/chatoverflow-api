package org.codeoverflow.chatoverflow.api.io.dto.donation.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;

public class Bits {
    private final int amount;
    private final int totalAmount;
    private final String channelID;
    private final String channelName;
    private final String chatMessage;
    private final String context;
    private final BitsBadge newBadge;
    private final User user;
    private final OffsetDateTime time;

    public Bits(int amount, int totalAmount, String channelID, String channelName, String chatMessage, String context,
                String userID, String userName, OffsetDateTime time) {
        this(amount, totalAmount, channelID, channelName, chatMessage, context, null,
                new User(userID, userName), time);
    }

    public Bits(int amount, int totalAmount, String channelID, String channelName, String chatMessage, String context,
                int newBadgeTier, String userID, String userName, OffsetDateTime time) {
        this(amount, totalAmount, channelID, channelName, chatMessage, context, new BitsBadge(channelID, channelName,
                chatMessage, new User(userID, userName), newBadgeTier, time), new User(userID, userName), time);
    }

    public Bits(int amount, int totalAmount, String channelID, String channelName, String chatMessage, String context,
                BitsBadge newBadge, User user, OffsetDateTime time) {
        this.amount = amount;
        this.totalAmount = totalAmount;
        this.channelID = channelID;
        this.channelName = channelName;
        this.chatMessage = chatMessage;
        this.context = context;
        this.newBadge = newBadge;
        this.user = user;
        this.time = time;
    }

    /**
     * @return number of bits used
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return all-time total number of Bits used on this channel by the specified user
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * @return userID of the channel
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * @return name of channel
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return (Optional) chat message sent with Bits
     */
    public String getChatMessage() {
        return chatMessage;
    }

    /**
     * @return event type associated with this use of Bits
     */
    public String getContext() {
        return context;
    }

    /**
     * @return user's new badge tier, if the user reached a new badge level with this cheer, otherwise null
     */
    public BitsBadge getNewBadge() {
        return newBadge;
    }

    /**
     * @return person who donated the Bits
     */
    public User getUser() {
        return user;
    }

    /**
     * @return time when the Bits were donated
     */
    public OffsetDateTime getTime() {
        return time;
    }
}