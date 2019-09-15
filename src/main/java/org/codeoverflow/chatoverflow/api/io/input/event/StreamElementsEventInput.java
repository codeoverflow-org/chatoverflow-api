package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.event.stream.streamelements.StreamElementsDonationEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.streamelements.StreamElementsEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.streamelements.StreamElementsFollowEvent;
import org.codeoverflow.chatoverflow.api.io.event.stream.streamelements.StreamElementsSubscriptionEvent;

import java.util.function.Consumer;

/**
 * A Input which allows you to add event handlers for various StreamElements related events like donations.
 */
@IsRequirement(requires = "access to the StreamElements api", methodName = "streamElements")
public interface StreamElementsEventInput extends EventInput<StreamElementsEvent> {

    /**
     * Register an event handler that listens to all {@link StreamElementsSubscriptionEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerSubscriptionEventHandler(Consumer<StreamElementsSubscriptionEvent> eventHandler) {
        registerEventHandler(eventHandler, StreamElementsSubscriptionEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link StreamElementsFollowEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerFollowEventHandler(Consumer<StreamElementsFollowEvent> eventHandler) {
        registerEventHandler(eventHandler, StreamElementsFollowEvent.class);
    }

    /**
     * Register an event handler that listens to all {@link StreamElementsDonationEvent}
     *
     * @param eventHandler consumer that receives the Events
     */
    default void registerDonationEventHandler(Consumer<StreamElementsDonationEvent> eventHandler) {
        registerEventHandler(eventHandler, StreamElementsDonationEvent.class);
    }
}
