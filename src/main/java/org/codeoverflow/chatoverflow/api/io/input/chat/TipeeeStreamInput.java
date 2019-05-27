package org.codeoverflow.chatoverflow.api.io.input.chat;

import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamDonation;
import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamFollow;
import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamSubscription;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.function.Consumer;

public interface TipeeeStreamInput extends Input {
    void registerSubscriptionHandler(Consumer<TipeeeStreamSubscription> handler);
    void registerDonationHandler(Consumer<TipeeeStreamDonation> handler);
    void registerFollowHandler(Consumer<TipeeeStreamFollow> handler);
}
