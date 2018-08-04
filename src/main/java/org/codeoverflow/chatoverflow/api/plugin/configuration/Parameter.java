package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class Parameter {

    private final Requirements requirements;

    Parameter(Requirements requirements) {
        this.requirements = requirements;
    }

    public Requirement<String> string(String uniqueRequirementId, String name, boolean isOptional) {
        return requirements.getOraddAndReturn(uniqueRequirementId, name, isOptional, String.class);
    }

    // Add more parameters here

}
