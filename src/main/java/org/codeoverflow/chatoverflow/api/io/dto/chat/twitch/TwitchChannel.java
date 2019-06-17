package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.Channel;
import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

/**
 * The representation of channel of a twitch streamer
 */
public class TwitchChannel extends Channel implements Identifiable {
    private final String id;
    private final int follower;
    private final int views;
    private final String title;
    private final String game;
    private final Boolean partner;
    private final String created_at;

    public TwitchChannel(String name, String id, int follower, int views, String title, String game, Boolean partner, String created_at) {
        super(name);
        this.id = id;
        this.follower = follower;
        this.views = views;
        this.title = title;
        this.game = game;
        this.partner = partner;
        this.created_at = created_at;
    }

    /**
     * @return a unique id to identify the channel
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * @return how many followers the streamer has
     */
    public int getFollower() {
        return follower;
    }

    /**
     * @return how many views the streamer currently has
     */
    public int getViews() {
        return views;
    }


    /**
     * @return the current title of the stream
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the game that is currently played
     */
    public String getGame() {
        return game;
    }

    /**
     * @return if the streamer is a twitch partner
     */
    public Boolean getPartner() {
        return partner;
    }

    /**
     *
     * @return when the stream was created
     */
    public String getCreated_at() {
        return created_at;
    }
}
