package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;
import org.codeoverflow.chatoverflow.api.io.dto.chat.TextChannel;

/**
 * A discord text channel where messages are exchanged
 */
public class DiscordTextChannel extends TextChannel implements Identifiable {

    private final String id;

    private final String topic;

    public DiscordTextChannel(String name, String id, String topic) {
        super(name);
        this.id = id;
        this.topic = topic;
    }

    public DiscordTextChannel(String name, String id) {
        super(name);
        this.id = id;
        this.topic = "";
    }

    /**
     * @return the topic of this text channel
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @return a unique id to identify the channel
     */
    @Override
    public String getId() {
        return id;
    }
}
