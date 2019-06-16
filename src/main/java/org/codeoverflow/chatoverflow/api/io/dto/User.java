package org.codeoverflow.chatoverflow.api.io.dto;

public class User implements Identifiable {
    private final String id;
    private final String name;
    private final String login;

    public User(String name) {
        this(name, name, "");
    }

    public User(String id, String name) {
        this(id, name, "");
    }

    public User(String id, String name, String login) {
        this.id = id;
        this.name = name;
        this.login = login;
    }

    /**
     * @return unique user id if available, otherwise same as user name
     */
    public String getId() {
        return id;
    }

    /**
     * @return user display name
     */
    public String getName() {
        return name;
    }

    /**
     * @return unique user login name
     */
    public String getLogin() {
        return login;
    }
}
