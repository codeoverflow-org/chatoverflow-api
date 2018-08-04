package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;

public class Input {

    private final Requirements requirements;

    Input(Requirements requirements) {
        this.requirements = requirements;
    }

    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId, String name, boolean isOptional) {
        return requirements.getOraddAndReturn(uniqueRequirementId, name, isOptional, TwitchChatInput.class);
    }

    // Add more inputs here

}
