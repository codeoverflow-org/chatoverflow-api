package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamSubscription;

import java.util.function.Consumer;

//Fixme extend generic subscription
public interface SubscriptionEventInput<T extends TipeeeStreamSubscription> extends EventInput {
    /**
     * Let's you register a simple handler immediately react on new subscriptions
     *
     * @param handler the consumer t ehandle incoming messages
     */
    void registerSubscriptionHandler(Consumer<T> handler);
}
