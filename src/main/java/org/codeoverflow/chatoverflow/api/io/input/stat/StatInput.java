package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.input.Input;

import java.util.List;

public interface StatInput extends Input {
    User getUser(String userName);

    String getSubscribers(String userName);

    List<User> getFollowers(String userID);
}
