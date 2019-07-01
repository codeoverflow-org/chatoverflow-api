package org.codeoverflow.chatoverflow.api.io.dto.stat.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.User;

public class TwitchUserStats extends User {

    private final String description;
    private final String profile_image_url;
    private final int view_count;

    public TwitchUserStats(String identifier, String name, String description, String profile_image_url, int view_count) {
        super(identifier, name);
        this.description = description;
        this.profile_image_url = profile_image_url;
        this.view_count = view_count;
    }

    public String getDescription() {
        return description;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public int getView_count() {
        return view_count;
    }
}
