package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.io.Serializable;

/**
 * A output connects to a service by using a connector to send data
 */
public interface Output extends Serializable {
    boolean init();
}
