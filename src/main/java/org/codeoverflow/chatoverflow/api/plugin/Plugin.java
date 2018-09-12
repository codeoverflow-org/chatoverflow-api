package org.codeoverflow.chatoverflow.api.plugin;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirements;

/**
 * Plugins do the work of a chat overflow plugin project. They are highly api-version depended. Always check pluggable first!
 */
public interface Plugin {

    void setup();

    void loop();

    void shutdown();

    int getLoopInterval();

    Requirements getRequirements();

}
