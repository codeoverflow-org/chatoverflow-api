package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.SampleInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.MockUpChatInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;
import org.codeoverflow.chatoverflow.api.io.input.stat.TwitchStatInput;

/**
 * Syntactic sugar for the plugin developer that provides all input requirements for him
 */
public class Input {

    private final Requirements requirements;

    Input(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     *  Requires a twitch chat login that has to be created by the framework user.
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName Is displayed to the framework user to tell him what to enter
     * @param isOptional true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchChatInput.class);
    }

    /**
     * Requires a login for the twitch stats api that has to be created by the framework user.
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName         Is displayed to the framework user to tell him what to enter
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<TwitchStatInput> twitchStats(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchStatInput.class);
    }

    /**
     * Requires a connected mockup chat that has to be submitted by the user.
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName Is displayed to the framework user and to tell him what to enter
     * @param isOptional true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<MockUpChatInput> mockupChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, MockUpChatInput.class);
    }

    /**
     * Demonstration requirement for the sample input, to get a idea how requirements work
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName Is displayed to the framework user and to tell him what to enter
     * @param isOptional true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<SampleInput> sampelInput(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, SampleInput.class);
    }

    // Add more inputs here

}
