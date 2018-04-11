package org.codeoverflow.chatoverflow.api.plugin;

/**
 * Plugins do the work of a chat overflow plugin project. They are highly api-version depended. Always check pluggable first!
 */
public interface Plugin {

    // TODO: Proper interface
    void start();

    // TODO: Dependencies of a plugin (and the full hierachy) might change. Implemented in the plugin, not the pluggable.
    String[] getDependenciesOrWhatEver();

}
