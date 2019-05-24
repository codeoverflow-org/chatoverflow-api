package org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream;

import org.codeoverflow.chatoverflow.api.io.dto.event.Event;
import org.codeoverflow.chatoverflow.api.io.dto.stat.User;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class TipeeeStreamDonation implements Event {
    private final ZonedDateTime createdAt;
    private final User donor;
    private final String message;
    private final BigDecimal amount;
    private final String currency;
    private final String formattedAmount;

    public TipeeeStreamDonation(ZonedDateTime createdAt, User donor, String message, BigDecimal amount, String currency, String formattedAmount) {
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

    public User getDonor() {
        return donor;
    }

    public String getMessage() {
        return message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFormattedAmount() {
        return formattedAmount;
    }
}
