package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;

/**
 * Syntactic sugar for the plugin developer that provides all output requirements for him
 */
public class Output {

    private final Requirements requirements;

    Output(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a twitch chat login that has to be created by the user.
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName Is displayed to the framework user and to tell him what to enter
     * @param isOptional true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, TwitchChatOutput.class);
    }

    // Add more outputs here

}
