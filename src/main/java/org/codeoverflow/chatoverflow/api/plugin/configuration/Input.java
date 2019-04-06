package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;
import org.codeoverflow.chatoverflow.api.io.input.stat.TwitchStatInput;

public class Input {

    private final Requirements requirements;

    Input(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a twitch chat login that has to be created by the user.
     */
    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchChatInput.class);
    }

    public Requirement<TwitchStatInput> twitchStats(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchStatInput.class);
    }

    // Add more inputs here

}
