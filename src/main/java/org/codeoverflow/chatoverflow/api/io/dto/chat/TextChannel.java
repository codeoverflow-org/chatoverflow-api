package org.codeoverflow.chatoverflow.api.io.dto.chat;

/**
 * A generic channel in which messages are exchanged
 */
public class TextChannel {
    private final String name;

    public TextChannel(String name) {
        this.name = name;
    }

    /**
     * @return the name of the channel
     */
    public String getName() {
        return name;
    }
}
