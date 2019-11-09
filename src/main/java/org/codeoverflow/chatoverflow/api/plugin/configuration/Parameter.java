package org.codeoverflow.chatoverflow.api.plugin.configuration;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

import org.codeoverflow.chatoverflow.api.io.parameter.BooleanParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.ColorParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.DoubleParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.IntegerParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.ListParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.MapParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.StringParameter;
import org.codeoverflow.chatoverflow.api.io.parameter.UriParameter;

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
     * Requires a BooleanParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<BooleanParameter> booleanParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, BooleanParameter.class);
    }

    /**
     * Requires a BooleanParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<BooleanParameter> booleanParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Boolean Parameter", false, BooleanParameter.class);
    }

    /**
     * Requires a ColorParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<ColorParameter> colorParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, ColorParameter.class);
    }

    /**
     * Requires a ColorParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<ColorParameter> colorParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Color Parameter", false, ColorParameter.class);
    }

    /**
     * Requires a DoubleParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DoubleParameter> doubleParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, DoubleParameter.class);
    }

    /**
     * Requires a DoubleParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DoubleParameter> doubleParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Double Parameter", false, DoubleParameter.class);
    }

    /**
     * Requires a IntegerParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<IntegerParameter> integerParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, IntegerParameter.class);
    }

    /**
     * Requires a IntegerParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<IntegerParameter> integerParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Integer Parameter", false, IntegerParameter.class);
    }

    /**
     * Requires a ListParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<ListParameter> listParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, ListParameter.class);
    }

    /**
     * Requires a ListParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<ListParameter> listParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "List Parameter", false, ListParameter.class);
    }

    /**
     * Requires a MapParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<MapParameter> mapParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, MapParameter.class);
    }

    /**
     * Requires a MapParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<MapParameter> mapParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Map Parameter", false, MapParameter.class);
    }

    /**
     * Requires a StringParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StringParameter> stringParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, StringParameter.class);
    }

    /**
     * Requires a StringParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StringParameter> stringParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "String Parameter", false, StringParameter.class);
    }

    /**
     * Requires a UriParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<UriParameter> uriParameter(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireParameter(uniqueRequirementId, displayName, isOptional, UriParameter.class);
    }

    /**
     * Requires a UriParameter which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<UriParameter> uriParameter(String uniqueRequirementId) {
        return requirements.requireParameter(uniqueRequirementId, "Uri Parameter", false, UriParameter.class);
    }


}
