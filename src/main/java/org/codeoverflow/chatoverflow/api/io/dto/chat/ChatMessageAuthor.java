package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

public class ChatMessageAuthor implements Formatable {

    private String displayName;

    public ChatMessageAuthor(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String toString() {
        return displayName;
    }

    @Override
    public String toHTMLString() {
        return "<span><b>" + displayName + "</b></span>";
    }

    @Override
    public String toMarkdownString() {
        return "**" + displayName + "**";
    }
}
