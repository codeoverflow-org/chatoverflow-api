package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatEmoticon;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.util.List;

/**
 * A chat message that was send in a discord channel
 */
public class DiscordChatMessage extends ChatMessage<DiscordChatMessageAuthor, DiscordChannel, DiscordChatCustomEmoticon> implements Identifiable {

    private String id;

    public DiscordChatMessage(DiscordChatMessageAuthor author, String message, Long timestamp, DiscordChannel channel, String id) {
        super(author, message, timestamp, channel);
        this.id = id;
    }

    public DiscordChatMessage(DiscordChatMessageAuthor author, String message, Long timestamp, DiscordChannel channel, List<DiscordChatCustomEmoticon> emoticons, String id) {
        super(author, message, timestamp, channel, emoticons);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return a unique id to identify the message
     */
    @Override
    public String getId() {
        return id;
    }


    @Override
    public String toHTMLString() {
        StringBuilder htmlMessage = new StringBuilder(getMessage());
        for (int i = getEmoticons().size() - 1; i >= 0; i--) {
            DiscordChatCustomEmoticon emoticon = (DiscordChatCustomEmoticon) getEmoticons().get(i);
            String htmlImage = emoticon.toHTMLString();
            htmlMessage.replace(emoticon.getIndex(), emoticon.getIndex() + emoticon.getRaw().length(), htmlImage);
        }
        return "<span>" + getAuthor().toHTMLString() + ": " + htmlMessage + "</span>";
    }
}
