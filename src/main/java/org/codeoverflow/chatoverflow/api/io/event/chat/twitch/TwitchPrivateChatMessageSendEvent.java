package org.codeoverflow.chatoverflow.api.io.event.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;
import org.codeoverflow.chatoverflow.api.io.event.chat.ChatMessageSendEvent;

/**
 * Event that is triggered when a user sends a private message to the user with twitch
 */
public class TwitchPrivateChatMessageSendEvent extends ChatMessageSendEvent<TwitchChatMessage> implements TwitchEvent {
    public TwitchPrivateChatMessageSendEvent(TwitchChatMessage message) {
        super(message);
    }
}
