package org.codeoverflow.chatoverflow.api.plugin;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Configuration;

/**
 * Plugins do the work of a chat overflow plugin project. They are highly api-version depended. Always check pluggable first!
 */
public interface Plugin {

    // TODO: Proper interface
    void start();

    Configuration getRequirements();

}
