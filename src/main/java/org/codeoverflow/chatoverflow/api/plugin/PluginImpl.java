package org.codeoverflow.chatoverflow.api.plugin;

import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirements;

public abstract class PluginImpl implements Plugin {

    protected int loopInterval = 1000;
    protected Requirements require = new Requirements();

    @Override
    public int getLoopInterval() {
        return loopInterval;
    }

    @Override
    public Requirements getRequirements() {
        return require;
    }
}
