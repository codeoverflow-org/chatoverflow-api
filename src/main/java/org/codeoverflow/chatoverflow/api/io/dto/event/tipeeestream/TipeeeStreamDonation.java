package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import java.time.ZonedDateTime;

public class TipeeeStreamDonation implements TipeeeStreamEvent {
    private final ZonedDateTime createdAt;
    private final String donor;
    private final String message;
    private final Double amount;
    private final String currency;
    private final String formattedAmount;

    public TipeeeStreamDonation(ZonedDateTime createdAt, String donor, String message, Double amount, String currency, String formattedAmount) {
        this.createdAt = createdAt;
        this.donor = donor;
        this.message = message;
        this.amount = amount;
        this.currency = currency;
        this.formattedAmount = formattedAmount;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public String getDonor() {
        return donor;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String getType() {
        return "donation";
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFormattedAmount() {
        return formattedAmount;
    }
}
