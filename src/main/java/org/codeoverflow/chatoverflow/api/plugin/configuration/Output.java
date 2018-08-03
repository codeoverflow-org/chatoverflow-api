package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;

public class Output {

    private final Requirements requirements;

    Output(Requirements requirements) {
        this.requirements = requirements;
    }

    public Requirement<TwitchChatOutput> requireTwitchChatOutput(String uniqueRequirementId, String name, boolean isOptional) {
        return requirements.addAndReturn(uniqueRequirementId, name, isOptional, TwitchChatOutput.class);
    }

    // Add more outputs here

}
