package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.Channel;
import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

/**
 * TODO Find out for what this is used skateKappa
 * The representation of channel of a twitch streamer
 */
public class TwitchChannel extends Channel implements Identifiable {
    private String id;
    private int follower;
    private int views;
    private String title;
    private String game;
    private Boolean partner;
    private String created_at;

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
     * TODO Is this a timestamp or a formatted string?
     *
     * @return when the stream was created
     */
    public String getCreated_at() {
        return created_at;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setPartner(Boolean partner) {
        this.partner = partner;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
