package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;

/**
 * A discord custom emoji
 * <p>
 * <b>Note:</b><br>
 * Discords default emoji are unicode emoji so they just be contained in the raw message
 */
public class DiscordChatCustomEmoticon extends ChatEmoticon implements Identifiable {
    private String id;
    private boolean isAnimated;

    public DiscordChatCustomEmoticon(String asString, int index, boolean animated, String id) {
        super(asString, "https://cdn.discordapp.com/emojis/" + id + (animated ? ".gif" : ".png"), index);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAnimated(boolean animated) {
        isAnimated = animated;
    }

    /**
     * @return a unique id to identify the emoji
     */
    @Override
    public String getId() {
        return id;
    }


    /**
     * @return a raw emoji string as used in the original message
     */
    public String getRaw() {
        return "<" + getAsString() + getId() + ">";
    }

    /**
     * @return true if the emoji is animated, false otherwise
     */
    public boolean isAnimated() {
        return isAnimated;
    }
}
