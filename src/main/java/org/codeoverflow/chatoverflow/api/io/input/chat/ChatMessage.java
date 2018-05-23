package org.codeoverflow.chatoverflow.api.io.input.chat;

public class ChatMessage {
    private String message;
    private String userName;
    private Long timestamp;
    private Boolean isPremium;
    private String color;

    public ChatMessage(String message, String userName, Long timestamp) {
        this(message, userName, timestamp, false, "");
    }

    public ChatMessage(String message, String userName, Long timestamp, Boolean isPremium) {
        this(message, userName, timestamp, isPremium, "");
    }

    public ChatMessage(String message, String userName, Long timestamp, Boolean isPremium, String color) {
        this.message = message;
        this.userName = userName;
        this.timestamp = timestamp;
        this.isPremium = isPremium;
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public String getUserName() {
        return userName;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Boolean getPremium() {
        return isPremium;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return userName + ": " + message;
    }
}
