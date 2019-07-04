package org.codeoverflow.chatoverflow.api.io.dto.stat.stream;

import org.codeoverflow.chatoverflow.api.io.dto.User;

import java.time.OffsetDateTime;
import java.util.Currency;

/**
 * A user donated some money for your stream
 */
public class Donation<T extends User> {
    private final T donor;
    private final float amount;
    private final Currency currency;
    private final OffsetDateTime time;

    public Donation(T donor, float amount, Currency currency, OffsetDateTime time) {
        this.donor = donor;
        this.amount = amount;
        this.currency = currency;
        this.time = time;
    }

    /**
     * Get the user object of the person that donated
     *
     * @return the donor
     */
    public T getDonor() {
        return donor;
    }

    /**
     * Get how much the user donated
     *
     * @return amount of donated money
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Get the currency used for this transaction
     *
     * @return currency object
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Get a formatted string how much the user donated.
     * <br>
     * <b>Example:</b>  {@code € 70.02}
     *
     * @return formatted donation amount
     */
    public String getFormattedAmount() {
        return String.format("%s %,.2f", currency.getSymbol(), amount);
    }

    /**
     * Get the time when the donation was made
     *
     * @return donation time
     */
    public OffsetDateTime getTime() {
        return time;
    }
}
