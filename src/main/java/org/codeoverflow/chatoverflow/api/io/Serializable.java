package org.codeoverflow.chatoverflow.api.io;

/**
 * Allows serializing a object to a string, useful for saving to config
 */
public interface Serializable {

    /**
     * Serializes this object into a string to save it to a config
     *
     * @return serialized data
     */
    String serialize();

    /**
     * Deserialize a string to apply provided config settings to this object
     * If the string can't be deserialized this method should thrown an exception
     *
     * @param value the string that should be deserialized
     */
    void deserialize(String value);
}
