package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.io.event.Event;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.function.Consumer;

/**
 * An input that allows listening for events from the connected service
 */
public interface EventInput<T extends Event> extends Input {

    /**
     * Register a new event handler that listens for a specific event
     * <p>
     * The eventClass can be get by using {@code Event.class} (in java) or {@code classOf[Event]} (in scala)
     * <p>
     * <b>There are more specific methods for each Event that don't require you to provide the eventCLass!</b>
     *
     * @param eventHandler consumer for which `accept()` is called if the event is fired
     * @param eventClass class of the events for which this listener should listen
     */
    <S extends T> void registerEventHandler(Consumer<S> eventHandler, Class<S> eventClass);

}
