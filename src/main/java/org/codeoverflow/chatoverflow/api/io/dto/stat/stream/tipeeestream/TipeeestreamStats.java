package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.UserStats;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * A stat object that provides all information about the connected Tipeeestream account
 */
public class TipeeestreamStats extends UserStats {

    private final String avatar;
    private final OffsetDateTime creationTime;
    private final int subscribers;
    private final int followers;
    private final int donations;
    private final List<TipeeestreamProviderDetails> details;

    public TipeeestreamStats(String identifier, String name, String avatar, OffsetDateTime creationTime, int subscribers, int followers, int donations, List<TipeeestreamProviderDetails> details) {
        super(identifier, name);
        this.avatar = avatar;
        this.creationTime = creationTime;
        this.subscribers = subscribers;
        this.followers = followers;
        this.donations = donations;
        this.details = details;
    }

    /**
     * Get the url of the users avatar that is displayed on the donation page
     *
     * @return the avatar url
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Get the time when this Tipeeestream account was created
     *
     * @return the creation time
     */
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * The total amount of all subscribers from all connected providers
     *
     * @return total subscribers
     */
    public int getSubscribers() {
        return subscribers;
    }

    /**
     * The total amount of all followers from all connected providers
     *
     * @return total followers
     */
    public int getFollowers() {
        return followers;
    }

    /**
     * The total amount of donations
     *
     * @return total donations
     */
    public int getDonations() {
        return donations;
    }

    /**
     * A list with more detailed information for all streaming services that provide data to Tipeeestream
     *
     * @return provider details
     */
    public List<TipeeestreamProviderDetails> getDetails() {
        return details;
    }
}
