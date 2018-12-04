package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.io.Serializable;

public interface Parameter<T> extends Serializable {
    T get();

    void set(T value);

    Class<T> getType();
}
