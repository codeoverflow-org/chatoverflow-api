package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.parameter.StringParameter;

/**
 * Syntactic sugar for the plugin developer that provides all parameter requirements for him
 */
public class Parameter {

    private final Requirements requirements;

    Parameter(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a new string that has to be specified by the user.
     *
     * @param uniqueRequirementId any unique id by which your plugin can identify the requirement
     * @param displayName         Is displayed to the framework user and to tell him what to enter
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object
     */
    public Requirement<StringParameter> string(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, StringParameter.class);
    }

    // Add more parameters here

}
