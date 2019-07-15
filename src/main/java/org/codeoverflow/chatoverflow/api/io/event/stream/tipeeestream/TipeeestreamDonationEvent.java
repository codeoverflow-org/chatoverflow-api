package org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.tipeeestream.TipeeestreamDonation;
import org.codeoverflow.chatoverflow.api.io.event.stream.DonationEvent;

/**
 * Event that is triggered if user donates on tipeeestream
 */
public class TipeeestreamDonationEvent extends DonationEvent<TipeeestreamDonation> implements TipeeestreamEvent {
    public TipeeestreamDonationEvent(TipeeestreamDonation donationInfo) {
        super(donationInfo);
    }
}
