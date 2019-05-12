package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessageAuthor;

/**
 * A discord user that did send a chat message
 */
public class DiscordChatMessageAuthor extends ChatMessageAuthor implements Identifiable {

    private String id;

    public DiscordChatMessageAuthor(String displayName, String id) {
        super(displayName);
        this.id = id;
    }

    public DiscordChatMessageAuthor(String displayName, String id, String color) {
        super(displayName, color);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return a unique id to identify the user
     */
    @Override
    public String getId() {
        return id;
    }
}
