package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A generic message that is send in a chat
 */
public class ChatMessage<T extends ChatMessageAuthor, U extends Channel, V extends ChatEmoticon>  implements Formatable {
    private final String message;
    private final T author;
    private final Long timestamp;
    private final U channel;
    private final List<V> emoticons;

    public ChatMessage(T author, String message, Long timestamp, U channel) {
        this(author, message, timestamp, channel, new ArrayList<>());
    }

    public ChatMessage(T author, String message, Long timestamp, U channel, List<V> emoticons) {
        Collections.sort(emoticons);
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
        this.channel = channel;
        this.emoticons = emoticons;
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
    public T getAuthor() {
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
    public U getChannel() {
        return channel;
    }

    /**
     * <i><b>Note:</b> Not all chat inputs support emoticons. If not supported this list will always be empty</i>
     *
     * @return a list of all emoticons that were send in the message, empty if no emoticons were send
     */
    public List<V> getEmoticons() {
        return emoticons;
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
        return "<span>" + author.toHTMLString() + ": " + htmlMessage + "</span>";
    }

    /**
     * @return The author and the message formatted with markdown, but emjois in their raw string representation
     */
    @Override
    public String toMarkdownString() {
        return author.toMarkdownString() + ":" + message;
    }
}
