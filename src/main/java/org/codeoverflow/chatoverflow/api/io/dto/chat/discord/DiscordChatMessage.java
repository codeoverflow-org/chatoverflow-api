package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;
import org.codeoverflow.chatoverflow.api.io.dto.chat.ChatMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * A chat message that was send in a discord channel
 */
public class DiscordChatMessage extends ChatMessage<DiscordChatMessageAuthor, DiscordChannel, DiscordChatCustomEmoticon> implements Identifiable {

    private final String id;
    private final DiscordEmbed embed;
    private final List<String> attachmentUrls;
    private final List<DiscordReaction> reactions;

    public DiscordChatMessage(DiscordChatMessageAuthor author, String message, Long timestamp, DiscordChannel channel, String id) {
        super(author, message, timestamp, channel);
        this.id = id;
        this.embed = null;
        this.attachmentUrls = new ArrayList<>();
        reactions = new ArrayList<>();
    }

    public DiscordChatMessage(DiscordChatMessageAuthor author,
                              String message,
                              Long timestamp,
                              DiscordChannel channel,
                              List<DiscordChatCustomEmoticon> emoticons,
                              String id) {
        this(author, message, timestamp, channel, emoticons, null, new ArrayList<>(), new ArrayList<>(), id);
    }

    public DiscordChatMessage(DiscordChatMessageAuthor author,
                              String message,
                              Long timestamp,
                              DiscordChannel channel,
                              List<DiscordChatCustomEmoticon> emoticons,
                              DiscordEmbed embed,
                              List<String> attachmentUrls,
                              List<DiscordReaction> reactions,
                              String id) {
        super(author, message, timestamp, channel, emoticons);
        this.id = id;
        this.reactions = reactions;
        this.embed = embed;
        this.attachmentUrls = attachmentUrls;
    }

    /**
     * @return a unique id to identify the message
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * @return optional container with the embed displayed in this chat message or an empty optional if this is a message without an embed
     */
    public Optional<DiscordEmbed> getEmbed() {
        return Optional.ofNullable(embed);
    }

    /**
     * @return a list containing the urls of the files attached to this message or an empty list if the message doesn't has an attachment
     */
    public List<String> getAttachments() {
        return attachmentUrls;
    }

    /**
     * @return a list containing all reactions of this chat message (for new messages this will be empty as users need some time to react on the message)
     */
    public List<DiscordReaction> getReactions() {
        return reactions;
    }

    @Override
    public String toHTMLString() {
        StringBuilder htmlMessage = new StringBuilder(getMessage());
        for (int i = getEmoticons().size() - 1; i >= 0; i--) {
            DiscordChatCustomEmoticon emoticon = getEmoticons().get(i);
            String htmlImage = emoticon.toHTMLString();
            htmlMessage.replace(emoticon.getIndex(), emoticon.getIndex() + emoticon.getRaw().length(), htmlImage);
        }
        return "<span>" + getAuthor().toHTMLString() + ": " + htmlMessage + "</span>";
    }
}
