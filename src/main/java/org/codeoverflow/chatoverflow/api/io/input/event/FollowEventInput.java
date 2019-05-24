package org.codeoverflow.chatoverflow.api.io.input.event;

import org.codeoverflow.chatoverflow.api.io.dto.event.tipeeestream.TipeeeStreamFollow;

import java.util.function.Consumer;

public interface FollowEventInput<T extends TipeeeStreamFollow> extends EventInput {

    void registerFollowHandler(Consumer<T> handler);
}
