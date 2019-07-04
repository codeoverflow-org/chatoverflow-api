package org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Donation;

import java.time.OffsetDateTime;
import java.util.Currency;

public class TipeeestreamDonation extends Donation<User> {

    private final String donationMessage;

    public TipeeestreamDonation(User donor, float amount, Currency currency, OffsetDateTime time, String donationMessage) {
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
