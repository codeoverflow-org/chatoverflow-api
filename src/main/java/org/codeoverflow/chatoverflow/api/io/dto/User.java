package org.codeoverflow.chatoverflow.api.io.dto;

/**
 * A basic user where we only know a unique identifier and a displayed name
 */
public class User implements Identifiable {
    private final String identifier;
    private final String name;

    public User(String name) {
        this(name, name);
    }

    public User(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    /**
     *  A unique user identifier:<br>
     *  An id or the unique login name. May be the same as the users display name
     *
     * @return the unique identifier of the user
     */
    public String getId() {
        return identifier;
    }

    /**
     * @return users display name
     */
    public String getDisplayName() {
        return name;
    }
}
