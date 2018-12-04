package org.codeoverflow.chatoverflow.api.io;

public interface Serializable {
    String serialize();

    void deserialize(String value);
}
