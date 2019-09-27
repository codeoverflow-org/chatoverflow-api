package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.event.stream.tipeeestream.*;

import java.util.function.Consumer;

@IsRequirement(requires = "login for the TipeeeStream api", methodName = "tipeeeStream")
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
     * Register an event handler that listens to all {@link TipeeestreamFollowEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerFollowEventHandler(Consumer<TipeeestreamFollowEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamFollowEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TipeeestreamDonationEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerDonationEventHandler(Consumer<TipeeestreamDonationEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamDonationEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TipeeestreamCheerEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerCheerEventHandler(Consumer<TipeeestreamCheerEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamCheerEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link TipeeestreamRaidEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerRaidEventHandler(Consumer<TipeeestreamRaidEvent> eventHandler) {
        registerEventHandler(eventHandler, TipeeestreamRaidEvent.class);
    }
}
