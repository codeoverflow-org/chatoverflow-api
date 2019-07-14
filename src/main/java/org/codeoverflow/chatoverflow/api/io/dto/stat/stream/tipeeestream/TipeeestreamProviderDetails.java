package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.UserStats;

import java.time.OffsetDateTime;

/**
 * A stat object that provides detailed information about a connected service
 */
public class TipeeestreamProviderDetails extends UserStats {

    private final TipeeestreamProvider type;
    private final int followers;
    private final int subscribers;
    private final String channelUrl;
    private final OffsetDateTime creationTime;

    public TipeeestreamProviderDetails(TipeeestreamProvider type, String identifier, String name, String channelUrl, OffsetDateTime creationTime, int followers, int subscribers) {
        super(identifier, name);
        this.type = type;
        this.channelUrl = channelUrl;
        this.creationTime = creationTime;
        this.followers = followers;
        this.subscribers = subscribers;
    }

    public TipeeestreamProviderDetails(TipeeestreamProvider type, String identifier, String name, String channelUrl, OffsetDateTime creationTime, int followers) {
        this(type, identifier, name, channelUrl, creationTime, followers, 0);
    }

    /**
     * Get which service provides that data to Tipeeestream (e.g. twitch, youtube,...)
     *
     * @return the type of this provider
     */
    public TipeeestreamProvider getType() {
        return type;
    }

    /**
     * Get the amount of followers provided by this service
     *
     * @return the amount of followers
     */
    public int getFollowers() {
        return followers;
    }

    /**
     * Get the amount of subscribers provided by this service
     *
     * @return the amount of subscribers
     */
    public int getSubscribers() {
        return subscribers;
    }

    /**
     * Get the url of the users channel on the service
     *
     * @return the channel url
     */
    public String getChannelUrl() {
        return channelUrl;
    }

    /**
     * Get the time when the services account was created
     *
     * @return the creation time
     */
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }
}
