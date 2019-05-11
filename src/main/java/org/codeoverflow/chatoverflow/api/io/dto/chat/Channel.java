package org.codeoverflow.chatoverflow.api.io.dto.chat;

public class Channel {
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
