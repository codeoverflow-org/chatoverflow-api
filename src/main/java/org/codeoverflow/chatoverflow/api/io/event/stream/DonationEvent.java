package org.codeoverflow.chatoverflow.api.io.event.stream;

import org.codeoverflow.chatoverflow.api.io.dto.stat.stream.Donation;

/**
 * Generic event for donations
 */
public abstract class DonationEvent<T extends Donation> {

    private final T info;

    protected DonationEvent(T donationInfo) {
        this.info = donationInfo;
    }

    /**
     * Get the Donation object that contains all information about that donation
     *
     * @return all info about that donation
     */
    public T getInfo() {
        return info;
    }
}
