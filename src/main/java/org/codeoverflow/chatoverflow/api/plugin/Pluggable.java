package org.codeoverflow.chatoverflow.api.plugin;

/**
 * Pluggable is the entry point for chat overflow plugins. Should never be changed!
 */
public interface Pluggable {

    /**
     * Returns the name of the plugin.
     *
     * @return the display name of the plugin
     */
    String getName();

    /**
     * Returns the author name of the plugin.
     *
     * @return the real name or a alias of the author
     */
    String getAuthor();

    /**
     * Returns a description of the plugin.
     *
     * @return a simple description of the service
     */
    String getDescription();

    /**
     * Returns the newest major version of the api, where the plugin was successfully tested!
     *
     * @return a version number
     */
    int getMajorAPIVersion();

    /**
     * Returns the newest minor version of the api, where the plugin was successfully tested!
     *
     * @return a version number
     */
    int getMinorAPIVersion();

    /**
     * Returns the real chat overflow plugin. Should only be used after testing the api version number!
     *
     * @return the plugin implementation of the plugin project
     */
    Plugin getPlugin();

    /**
     * Sets the plugin manager for communication. Should only be used after testing the api version number!
     *
     * @param manager the manager implementation of the framework
     */
    void setPluginManager(PluginManager manager);
}
