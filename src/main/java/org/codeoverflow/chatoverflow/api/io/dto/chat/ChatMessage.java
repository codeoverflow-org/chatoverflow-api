package org.codeoverflow.chatoverflow.api.io.dto.chat;

import org.codeoverflow.chatoverflow.api.io.dto.Formatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public String getMessage() {
        return message;
    }

    public ChatMessageAuthor getAuthor() {
        return author;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Channel getChannel() {
        return channel;
    }

    public List<ChatEmoticon> getEmoticons() {
        return emoticons;
    }

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

    public String toString() {
        return author.toString() + ": " + message;
    }

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

    @Override
    public String toMarkdownString() {
        return author.toMarkdownString() + ":" + message;
    }
}
