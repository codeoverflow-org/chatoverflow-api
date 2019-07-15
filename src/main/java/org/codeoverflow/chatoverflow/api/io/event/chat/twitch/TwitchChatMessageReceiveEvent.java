package org.codeoverflow.chatoverflow.api.io.event.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageReceiveEvent;

/**
 * Event that is triggered when a user sends a message in a twitch channel
 */
public class TwitchChatMessageReceiveEvent extends ChatMessageReceiveEvent<TwitchChatMessage> implements TwitchEvent {

    public TwitchChatMessageReceiveEvent(TwitchChatMessage message) {
        super(message);
    }
}
