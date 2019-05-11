package org.codeoverflow.chatoverflow.api.io.dto.service;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

public class User implements Identifiable {
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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", description: " + description;
    }
}
