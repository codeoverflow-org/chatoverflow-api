package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamDonation;

import java.util.function.Consumer;

//fixme extend generic donation
public interface DonationEventInput<T extends TipeeeStreamDonation> extends EventInput {

    void registerDonationHandler(Consumer<T> handler);
}
