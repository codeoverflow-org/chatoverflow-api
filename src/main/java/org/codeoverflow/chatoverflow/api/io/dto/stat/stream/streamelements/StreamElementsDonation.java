package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Donation;

import java.time.OffsetDateTime;
import java.util.Currency;

/**
 * A donation for the streamer at StreamElements
 */
public class StreamElementsDonation extends Donation<User> {
    private final String donationMessage;

    public StreamElementsDonation(User donor, float amount, Currency currency, OffsetDateTime time, String donationMessage) {
        super(donor, amount, currency, time);
        this.donationMessage = donationMessage;
    }

    /**
     * Get the message that a user included in his donation
     *
     * @return the donation message
     */
    public String getDonationMessage() {
        return donationMessage;
    }
}
