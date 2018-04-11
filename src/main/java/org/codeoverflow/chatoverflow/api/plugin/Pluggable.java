package org.codeoverflow.chatoverflow.api.plugin;

/**
 * Pluggable is the entry point for chat overflow plugins. Should NEVER be changed!
 * DO NOT UPDATE, REMOVE OR ADD ANYTHING TO THIS INTERFACE WITHOUT KNOWING WHAT YOU DOING!
 * This interface is only there to provide some information about your plugin (most important: the api version).
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
     * If the plugin is not up-to-date, it might not be loaded due to possible reflection errors. Please
     * do only use the Plugin class to define your own chat overflow plugin logic!
     *
     * @param manager the manager implementation of the framework
     * @return the plugin implementation of the plugin project, ready to get started!
     */
    Plugin getPlugin(PluginManager manager);

}
