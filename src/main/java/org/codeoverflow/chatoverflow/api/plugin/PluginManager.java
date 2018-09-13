package org.codeoverflow.chatoverflow.api.plugin;

import java.util.List;

/**
 * The Plugin Manager contains entry points for plugin projects to the chat overflow framework.
 */
public interface PluginManager {

    /**
     * Prints a log message on the console and saves the message for later inspection.
     *
     * @param message the message to show
     */
    void log(String message);

    /**
     * Returns a list of already posted log messages.
     *
     * @return a list of log messages
     */
    List<String> getLogMessages();

}
