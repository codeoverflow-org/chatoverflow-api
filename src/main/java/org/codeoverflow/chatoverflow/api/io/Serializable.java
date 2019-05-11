package org.codeoverflow.chatoverflow.api.io;

/**
 * Allows serializing a object to a string, useful for saving to config
 */
public interface Serializable {
    String serialize();

    void deserialize(String value);
}
