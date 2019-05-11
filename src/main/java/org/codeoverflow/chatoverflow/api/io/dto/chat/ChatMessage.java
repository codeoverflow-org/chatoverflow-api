package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A generic message that is send in a chat
 */
public class ChatMessage implements Formatable {
    private String message;
    private ChatMessageAuthor author;
    private Long timestamp;
    private Channel channel;
    private List<ChatEmoticon> emoticons;
    private String color;

    public ChatMessage(ChatMessageAuthor author, String message, Long timestamp, Channel channel) {
        this(author, message, timestamp, channel, new ArrayList<>(), "#000000");
    }

    public ChatMessage(ChatMessageAuthor author, String message, Long timestamp, Channel channel, List<ChatEmoticon> emoticons) {
        this(author, message, timestamp, channel, emoticons, "#000000");
    }

    public ChatMessage(ChatMessageAuthor author, String message, Long timestamp, Channel channel, List<ChatEmoticon> emoticons, String color) {
        Collections.sort(emoticons);
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
        this.channel = channel;
        this.emoticons = emoticons;
        this.color = color;
    }

    /**
     * @return the raw message that was send
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the author that send the message
     */
    public ChatMessageAuthor getAuthor() {
        return author;
    }

    /**
     * @return timestamp when the message was created (value in epoch millis)
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * @return channel where the message was send
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * <i><b>Note:</b> Not all chat inputs support emoticons. If not supported this list will always be empty</i>
     *
     * @return a list of all emoticons that were send in the message, empty if no emoticons were send
     */
    public List<ChatEmoticon> getEmoticons() {
        return emoticons;
    }

    /**
     * @return color of the message as hex code (with leading #), default is black
     */
    public String getColor() {
        return color;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthor(ChatMessageAuthor author) {
        this.author = author;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setEmoticons(List<ChatEmoticon> emoticons) {
        this.emoticons = emoticons;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return Author: Message - A raw string without formatting.
     */
    public String toString() {
        return author.toString() + ": " + message;
    }

    /**
     * @return The author and the message formatted with html, including emojis
     */
    @Override
    public String toHTMLString() {
        StringBuilder htmlMessage = new StringBuilder(message);
        for (int i = emoticons.size() - 1; i >= 0; i--) {
            ChatEmoticon emoticon = emoticons.get(i);
            String htmlImage = emoticon.toHTMLString();
            htmlMessage.replace(emoticon.getIndex(), emoticon.getIndex() + emoticon.getAsString().length(), htmlImage);
        }
        return "<span color=\"" + color + "\">" + author.toHTMLString() + ": " + htmlMessage + "</span>";
    }

    /**
     * @return The author and the message formatted with markdown, but emjois in their raw string representation
     */
    @Override
    public String toMarkdownString() {
        return author.toMarkdownString() + ":" + message;
    }
}
