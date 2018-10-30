package org.codeoverflow.chatoverflow.api.io.input.chat;

public class User {
    private String id;
    private String name;
    private String description;
    private String image;
    private int viewcount;

    public User(String id, String name, String description, String image, int viewcount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.viewcount = viewcount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getViewCount() {
        return viewcount;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", description: " + description;
    }
}
