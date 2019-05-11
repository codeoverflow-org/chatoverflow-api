package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

/**
 * The author of a chat message
 */
public class ChatMessageAuthor implements Formatable {

    private String displayName;

    public ChatMessageAuthor(String displayName) {
        this.displayName = displayName;
    }


    /**
     * @return the name of the author that is displayed in chat
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
        return "<span><b>" + displayName + "</b></span>";
    }

    /**
     * @return The display name in bold, formatted using markdown
     */
    @Override
    public String toMarkdownString() {
        return "**" + displayName + "**";
    }
}
