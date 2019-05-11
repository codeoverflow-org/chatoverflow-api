package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.io.Serializable;

/**
 * A input connects to a service by using a connector to receive data
 */
public interface Input extends Serializable {
    boolean init();
}
