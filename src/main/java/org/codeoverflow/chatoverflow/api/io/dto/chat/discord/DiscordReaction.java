package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * A unicode or custom emoji with which users reacted
 */
public class DiscordReaction {

    private final String id;
    private final String asString;
    private final String imageUrl;
    private final int amount;
    private final boolean animated;


    public DiscordReaction(String asString, int amount)  throws IllegalArgumentException {
        this.asString = asString;
        this.amount = amount;
        this.id = null;
        this.animated = false;
        this.imageUrl = unicodeImageUrl();
    }

    public DiscordReaction(String id, String asString, int amount, boolean animated) {
        this.id = id;
        this.asString = asString;
        this.amount = amount;
        this.animated = animated;
        this.imageUrl = "https://cdn.discordapp.com/emojis/" + id + (animated ? ".gif" : ".png");
    }

    /**
     * @return a optional container with the unique id to identify the custom emoji or an empty optional if its a unicode emoji
     */
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    /**
     * @return the string that is used as placeholder for the emoticon used for this reaction (see: {@link DiscordChatCustomEmoticon#getAsString()}
     */
    public String getAsString() {
        return asString;
    }

    /**
     * @return a raw emoji string as used in the original message (see: {@link DiscordChatCustomEmoticon#getRaw()})
     */
    public String getRaw() {
        return isCustom() ? "<" + asString + id + ">" : asString;
    }

    /**
     * @return a url pointing to the image file that is displayed as emoji
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @return how often the reaction was added to a chat message
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return true if this is a custom, animated emoji, false otherwise
     */
    public boolean isAnimated() {
        return animated;
    }

    /**
     * @return true if this is a custom emoji, false if it is a unicode emoji
     */
    public boolean isCustom() {
        return (id != null);
    }

    private String unicodeImageUrl() throws IllegalArgumentException {
        List<Integer> codePoints = new ArrayList<>();
        for (int i = 0; i < asString.length();) {
            int codePoint = Character.codePointAt(asString, i);
            codePoints.add(codePoint);
            if (codePoints.size() > 2)
                throw new IllegalArgumentException(asString + " is not a supported twemoji (see: https://twemoji.twitter.com/)");
            i += Character.charCount(codePoint);
        }
        if (codePoints.size() == 2) {
            return "https://raw.githubusercontent.com/twitter/twemoji/gh-pages/36x36/"
                    + Integer.toHexString(codePoints.get(0)) + "-" + Integer.toHexString(codePoints.get(1)) + ".png";
        } else {
            return "https://raw.githubusercontent.com/twitter/twemoji/gh-pages/36x36/"
                    + Integer.toHexString(codePoints.get(0)) + ".png";
        }
    }

    @Override
    public String toString() {
        return asString;
    }
}
