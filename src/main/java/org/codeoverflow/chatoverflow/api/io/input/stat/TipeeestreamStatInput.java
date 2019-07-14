package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamDonation;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamFollow;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamStats;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamSubscription;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * An input that allows you to get all your stats from tipeeestream
 */
public interface TipeeestreamStatInput extends StatInput<TipeeestreamStats> {

    /**
     * Get all recent follows
     * @param start time after which the follows were made
     * @return a list with all follows
     */
    List<TipeeestreamFollow> getLastFollows(OffsetDateTime start);

    /**
     * Get all recent
     * @param start time after which the subscriptions were made
     * @return a list with all subscriptions
     */
    List<TipeeestreamSubscription> getLastSubscriptions(OffsetDateTime start);

    /**
     *Get all recent donations
     * @param start time after which the donations were made
     * @return a list with all donations
     */
    List<TipeeestreamDonation> getLastDonations(OffsetDateTime start);
}
