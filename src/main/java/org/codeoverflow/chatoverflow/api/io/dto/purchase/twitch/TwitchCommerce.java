package org.codeoverflow.chatoverflow.api.io.dto.purchase.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;

public class TwitchCommerce {
    private final User user;
    private final String channelID;
    private final String channelName;
    private final Long timestamp;
    private final String imageURL;
    private final String description;
    private final boolean supportsChannel;
    private final TwitchChatMessage purchaseMessage;

    public TwitchCommerce(User user, String channelID, String channelName, Long timestamp, String imageURL,
                          String description, boolean supportsChannel, TwitchChatMessage purchaseMessage) {
        this.user = user;
        this.channelID = channelID;
        this.channelName = channelName;
        this.timestamp = timestamp;
        this.imageURL = imageURL;
        this.description = description;
        this.supportsChannel = supportsChannel;
        this.purchaseMessage = purchaseMessage;
    }

    /**
     * @return user who did the purchase
     */
    public User getUser() {
        return user;
    }

    /**
     * @return id of the channel the purchase was done
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * @return name of the channel the purchase was done
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return timestamp of the purchase
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @return if the purchase supports this channel or not
     */
    public boolean isSupportsChannel() {
        return supportsChannel;
    }

    /**
     * @return (Optional) chat message during purchase
     */
    public TwitchChatMessage getPurchaseMessage() {
        return purchaseMessage;
    }
}
