package org.codeoverflow.chatoverflow.api.io.parameter;

public interface Parameter<T> {
    String serialize();

    void deserialize(String value);

    T get();

    void set(T value);

    Class<T> getType();
}
