package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A generic message that is send in a chat
 */
public class ChatMessage implements Formatable {
    private final String message;
    private final ChatMessageAuthor author;
    private final Long timestamp;
    private final Channel channel;
    private final List<ChatEmoticon> emoticons;
    private final String color;

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
