package org.codeoverflow.chatoverflow.api.io.event.stream.streamelements;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.streamelements.StreamElementsDonation;
import org.codeoverflow.chatoverflow.api.io.event.stream.DonationEvent;

/**
 * A event that is triggered if a user donates on StreamElements.
 */
public class StreamElementsDonationEvent extends DonationEvent<StreamElementsDonation> implements StreamElementsEvent {
    public StreamElementsDonationEvent(StreamElementsDonation donationInfo) {
        super(donationInfo);
    }
}
