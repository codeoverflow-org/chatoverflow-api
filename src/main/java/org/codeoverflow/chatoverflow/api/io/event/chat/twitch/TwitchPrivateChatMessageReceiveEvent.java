package org.codeoverflow.chatoverflow.api.io.event.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageReceiveEvent;

/**
 * Event that is triggered when a user sends a private message to the user with twitch
 */
public class TwitchPrivateChatMessageReceiveEvent extends ChatMessageReceiveEvent<TwitchChatMessage> implements TwitchEvent {
    public TwitchPrivateChatMessageReceiveEvent(TwitchChatMessage message) {
        super(message);
    }
}
