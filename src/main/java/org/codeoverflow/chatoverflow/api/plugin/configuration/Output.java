package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;
import org.codeoverflow.chatoverflow.api.io.output.file.TwitchChatFileOutput;

public class Output {

    private final Requirements requirements;

    Output(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a twitch chat login that has to be created by the user.
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, TwitchChatOutput.class);
    }

    public Requirement<TwitchChatFileOutput> twitchChatFileOutput(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, TwitchChatFileOutput.class);
    }

    // Add more outputs here

}
