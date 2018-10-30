package org.codeoverflow.chatoverflow.api.io.input.stat;

import org.codeoverflow.chatoverflow.api.io.input.Input;
import org.codeoverflow.chatoverflow.api.io.input.chat.User;

import java.util.List;

public interface StatInput extends Input {
    User getUser(String userName);

    String getSubscribers(String userName);

    List<User> getFollowers(String userID);
}
