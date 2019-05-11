package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

/**
 * Generic emoticons that are displayed in the message
 */
public class ChatEmoticon implements Comparable<ChatEmoticon>, Formatable {
    private String asString;
    private String imageURL;
    private int index;

    public ChatEmoticon(String asString, String imageURL, int index) {
        this.asString = asString;
        this.imageURL = imageURL;
        this.index = index;
    }

    /**
     * @return the string that is used as placeholder for the emoticon
     */
    public String getAsString() {
        return asString;
    }

    /**
     * @return a url pointing to the image file that is displayed as emoji
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Returns the index in the original messages raw string where the asString placeholder for the emoji starts.
     * <p>
     * This can be used to replace the asString placeholder with the HTML string to display the correct image
     *
     * @return the index
     */
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

    /**
     * Tests equality by checking if the image urls are identical
     *
     * @param other the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ChatEmoticon)) return false;

        ChatEmoticon emoticon = (ChatEmoticon) other;
        return emoticon.imageURL.equals(this.imageURL);
    }

    /**
     * @return the raw string placeholder
     */
    @Override
    public String toString() {
        return asString;
    }

    /**
     * @return a html tag that displays the image for the emoji
     */
    @Override
    public String toHTMLString() {
        return "<img src=\"" + imageURL + "\"/>";
    }

    /**
     * @return in this case the same as the toString as most chats that use markdown don't support inline images
     */
    @Override
    public String toMarkdownString() {
        return asString;
    }
}
