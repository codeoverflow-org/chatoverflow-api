package org.codeoverflow.chatoverflow.api.io.event.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered when a user sends a message in a twitch channel
 */
public class TwitchChatMessageSendEvent extends ChatMessageSendEvent<TwitchChatMessage> implements TwitchEvent {

    public TwitchChatMessageSendEvent(TwitchChatMessage message) {
        super(message);
    }
}
