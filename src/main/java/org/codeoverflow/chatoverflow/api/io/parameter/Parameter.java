package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirement;
import org.codeoverflow.chatoverflow.api.io.Serializable;

/**
 * A parameter for a {@link Requirement}
 *
 * @param <T> type of the parameter
 */
public interface Parameter<T> extends Serializable {

    /**
     * @return the value of this parameter
     */
    T get();

    /**
     * Set this parameter to a new value
     *
     * @param value the new value of the parameter
     */
    void set(T value);

    /**
      * @return the type of this parameter
     */
    Class<T> getType();
}
