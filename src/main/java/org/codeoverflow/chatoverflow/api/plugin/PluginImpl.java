package org.codeoverflow.chatoverflow.api.plugin;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirements;

/**
 * The abstract plugin implementation does already implement a basic set of plugin functionality.
 * It is recommended to extend this class instead of implementing the plugin instance yourself.
 */
public abstract class PluginImpl implements Plugin {

    protected int loopInterval = 1000;
    protected Requirements require = new Requirements();
    private PluginManager manager;

    public PluginImpl(PluginManager manager) {
        this.manager = manager;
    }

    @Override
    public int getLoopInterval() {
        return loopInterval;
    }

    @Override
    public Requirements getRequirements() {
        return require;
    }

    /**
     * Prints a log message on the console and saves the message for later inspection.
     *
     * @param message the message to show
     */
    protected void log(String message) {
        manager.log(message);
    }

    @Override
    public PluginManager getManager() {
        return manager;
    }
}
