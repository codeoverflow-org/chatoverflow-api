package org.codeoverflow.chatoverflow.api.io.dto.chat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.chat.Channel;
import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

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

    public String getId() {
        return id;
    }

    public int getFollower() {
        return follower;
    }

    public int getViews() {
        return views;
    }

    public String getTitle() {
        return title;
    }

    public String getGame() {
        return game;
    }

    public Boolean getPartner() {
        return partner;
    }

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
