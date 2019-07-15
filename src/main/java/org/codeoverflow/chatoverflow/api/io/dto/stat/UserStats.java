package org.codeoverflow.chatoverflow.api.io.dto.stat;

import org.codeoverflow.chatoverflow.api.io.dto.User;

/**
 * The statistics of a user
 */
public abstract class UserStats extends User {

    public UserStats(String name) {
        super(name);
    }

    public UserStats(String identifier, String name) {
        super(identifier, name);
    }
}
