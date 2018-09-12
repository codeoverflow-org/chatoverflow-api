package org.codeoverflow.chatoverflow.api.io.input.chat;

public class ChatEmoticon implements Comparable<ChatEmoticon> {
    private String regex;
    private String id;
    private String imageURL;
    private int index;

    public ChatEmoticon(String regex, String id, String imageURL, int index) {
        this.regex = regex;
        this.id = id;
        this.imageURL = imageURL;
        this.index = index;
    }

    public String getRegex() {
        return regex;
    }

    public String getId() {
        return id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getIndex() {
        return index;
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
        return regex;
    }

    public String toHTMLString() {
        return "<img src=\"" + imageURL + "\"/>";
    }
}
