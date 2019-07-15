package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream.TipeeestramFollowEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream.TipeeestreamDonationEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream.TipeeestreamEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream.TipeeestreamSubscriptionEvent;

import java.util.function.Consumer;

public interface TipeeestreamEventInput extends EventInput<TipeeestreamEvent> {

    /**
     * Register an event handler that listens to all {@link TipeeestreamSubscriptionEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerSubscriptionEventHandler(Consumer<TipeeestreamSubscriptionEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamSubscriptionEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TipeeestramFollowEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerFollowEventHandler(Consumer<TipeeestramFollowEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestramFollowEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TipeeestreamDonationEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerDonationEventHandler(Consumer<TipeeestreamDonationEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamDonationEvent.class);
    }
}
