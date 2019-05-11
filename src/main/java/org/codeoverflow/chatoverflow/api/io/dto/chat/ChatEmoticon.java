package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

public class ChatEmoticon implements Comparable<ChatEmoticon>, Formatable {
    private String asString;
    private String imageURL;
    private int index;

    public ChatEmoticon(String regex, String imageURL, int index) {
        this.asString = regex;
        this.imageURL = imageURL;
        this.index = index;
    }

    public String getAsString() {
        return asString;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getIndex() {
        return index;
    }

    public void setAsString(String asString) {
        this.asString = asString;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int compareTo(ChatEmoticon other) {
        return Integer.compare(this.index, other.index);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ChatEmoticon)) return false;

        ChatEmoticon emoticon = (ChatEmoticon) other;
        return emoticon.imageURL.equals(this.imageURL);
    }

    @Override
    public String toString() {
        return asString;
    }

    @Override
    public String toHTMLString() {
        return "<img src=\"" + imageURL + "\"/>";
    }

    @Override
    public String toMarkdownString() {
        return asString;
    }
}
