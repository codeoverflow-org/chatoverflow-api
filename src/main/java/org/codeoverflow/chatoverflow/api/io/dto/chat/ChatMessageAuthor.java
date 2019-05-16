package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

/**
 * The author of a chat message
 */
public class ChatMessageAuthor implements Formatable {

    private final String displayName;
    private final String color;

    public ChatMessageAuthor(String displayName) {
        this(displayName, "#000000");
    }

    public ChatMessageAuthor(String displayName, String color) {
        this.displayName = displayName;
        this.color = color;
    }

    /**
     * @return the name of the author that is displayed in chat
     */
    public String getDisplayName() {
        return displayName;
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
        return displayName;
    }

    /**
     * @return The display name in bold, formatted using HTML
     */
    @Override
    public String toHTMLString() {
        return "<span color=\"" + color + "\"><b>" + displayName + "</b></span>";
    }

    /**
     * @return The display name in bold, formatted using markdown
     */
    @Override
    public String toMarkdownString() {
        return "**" + displayName + "**";
    }
}
