package org.codeoverflow.chatoverflow.api.io.output;

public interface Output {
    void init();

    String serialize();

    void deserialize(String value);
}
