package org.codeoverflow.chatoverflow.api.plugin.configuration;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

import org.codeoverflow.chatoverflow.api.io.parameter.StringParameter;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

/**
 * Select a Parameter Requirement to get access to the desired platform or values.
 */
public class Parameter {

    private final Requirements requirements;

    Parameter(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a StringParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StringParameter> string(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, StringParameter.class);
    }

    /**
     * Requires a StringParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StringParameter> string(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "String", false, StringParameter.class);
    }


}
