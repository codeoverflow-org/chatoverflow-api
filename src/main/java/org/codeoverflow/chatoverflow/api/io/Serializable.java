package org.codeoverflow.chatoverflow.api.io;

/**
 * Allows serializing a object to a string, useful for saving to config
 */
public interface Serializable {

    /**
     * Serializes this object into a string to save it to a config
     *
     * @return serialized
     */
    String serialize();

    /**
     * Deserialize a string to apply provided config settings to this object
     *
     * @param value should be serialized
     */
    void deserialize(String value);
}
