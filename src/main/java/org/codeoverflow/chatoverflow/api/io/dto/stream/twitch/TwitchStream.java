package org.codeoverflow.chatoverflow.api.io.dto.stream.twitch;

import org.codeoverflow.chatoverflow.api.io.dto.User;

public class TwitchStream {
    private final String id;
    private final User user;
    private String gameID;
    private String title;
    private int viewerCount;
    private final Long startedAt;
    private String language;
    private String thumbnailURL;

    public TwitchStream(String id, User user, String gameID, String title, int viewerCount, Long startedAt,
                        String language, String thumbnailURL) {
        this.id = id;
        this.user = user;
        this.gameID = gameID;
        this.title = title;
        this.viewerCount = viewerCount;
        this.startedAt = startedAt;
        this.language = language;
        this.thumbnailURL = thumbnailURL;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getGameID() {
        return gameID;
    }

    public String getTitle() {
        return title;
    }

    public int getViewerCount() {
        return viewerCount;
    }

    public Long getStartedAt() {
        return startedAt;
    }

    public String getLanguage() {
        return language;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }
}
