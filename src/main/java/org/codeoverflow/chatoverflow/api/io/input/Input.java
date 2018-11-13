package org.codeoverflow.chatoverflow.api.io.input;

public interface Input {
    void init();

    String serialize();

    void deserialize(String value);
}
