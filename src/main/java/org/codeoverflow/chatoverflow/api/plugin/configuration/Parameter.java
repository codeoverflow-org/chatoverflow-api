package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class Parameter {

    private final Requirements requirements;

    Parameter(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a new string that has to be specified by the user.
     */
    public Requirement<String> string(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.getOrAddAndReturn(uniqueRequirementId, displayName, isOptional, String.class);
    }

    // Add more parameters here

}
