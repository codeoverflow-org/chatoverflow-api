package org.codeoverflow.chatoverflow.api.plugin;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirements;

/**
 * Plugins do the work of a chat overflow plugin project. They are highly api-version depended. Always check pluggable first!
 */
public interface Plugin {

    /**
     * The setup method is executed one, when the plugin is started. Do NOT define your requirements in here!
     */
    void setup();

    /**
     * The loop method is executed in loop with a specified interval until the shutdown method is called.
     * The loop method is NOT executed if a negative loop interval is set.
     */
    void loop();

    /**
     * The shutdown method should contain logic to close everything.
     */
    void shutdown();

    /**
     * Returns the loop interval, specified by the plugin.
     * A negative interval means, that the loop method is not in use.
     *
     * @return the loop interval in milliseconds
     */
    int getLoopInterval();

    /**
     * Returns the plugin manager, previously created and set by the framework.
     *
     * @return a instance specific plugin manager object
     */
    PluginManager getManager();

    /**
     * Returns the requirements of a plugin. These might not be already fulfilled.
     *
     * @return a requirements container, containing requirements :)
     */
    Requirements getRequirements();

}
