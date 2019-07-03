package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;
import org.codeoverflow.chatoverflow.api.io.dto.User;

/**
 * The author of a chat message
 */
public class ChatMessageAuthor extends User implements Formatable {

    private final String color;

    public ChatMessageAuthor(String identifier, String name, String color) {
        super(identifier, name);
        this.color = color;
    }

    public ChatMessageAuthor(String identifier, String name) {
        this(identifier, name, "#000000");
    }

    public ChatMessageAuthor(String displayName) {
        super(displayName);
        this.color = "#000000";
    }

    /**
     * @return the color of the author as hex value (including #)
     */
    public String getColor() {
        return color;
    }

    /**
     * @return The display name as raw string
     */
    public String toString() {
        return getDisplayName();
    }

    /**
     * @return The display name in bold, formatted using HTML
     */
    @Override
    public String toHTMLString() {
        return "<span color=\"" + color + "\"><b>" + getDisplayName() + "</b></span>";
    }

    /**
     * @return The display name in bold, formatted using markdown
     */
    @Override
    public String toMarkdownString() {
        return "**" + getDisplayName() + "**";
    }
}
