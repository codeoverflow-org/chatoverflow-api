package org.codeoverflow.chatoverflow.api.io.dto.stat;

import org.codeoverflow.chatoverflow.api.io.dto.Identifiable;

/**
 * Containing the statistics of a services user
 */
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

    /**
     * @return The unique id of a user
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * @return description of the user
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the profile picture of the user
     */
    public String getImage() {
        return image;
    }

    /**
     * @return how many views the user currently has
     */
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

    /**
     * @return A String that contains the name and the description of the user
     */
    @Override
    public String toString() {
        return "Name: " + name + ", description: " + description;
    }
}
