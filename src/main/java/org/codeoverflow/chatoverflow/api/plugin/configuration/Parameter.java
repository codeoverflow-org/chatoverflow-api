package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.parameter.StringParameter;

public class Parameter {

    private final Requirements requirements;

    Parameter(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a new string that has to be specified by the user.
     */
    public Requirement<StringParameter> string(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, StringParameter.class);
    }

    // Add more parameters here

}
