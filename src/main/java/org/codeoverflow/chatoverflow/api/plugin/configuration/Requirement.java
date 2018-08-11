package org.codeoverflow.chatoverflow.api.plugin.configuration;

/**
 * A requirement holds a value of its type. This value can be set by the framework and used in the plugin.
 */
public class Requirement<T> {

    private T value;
    private String name;
    private boolean isOptional;
    private Class targetType;

    /**
     * Creates a new requirement with the given values.
     *
     * @param name       the name to display of the requirement
     * @param targetType the target type of the specific requirement (same as T)
     * @param isOptional true, if the requirement has not to be filled by any means
     */
    Requirement(String name, Class targetType, boolean isOptional) {
        this.name = name;
        this.isOptional = isOptional;
        this.targetType = targetType;
    }

    /**
     * Returns the requirement content. Make sure, it had been set first.
     *
     * @return The typed requirement content
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the requirement content.
     *
     * @param value the value of the requirement
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the display name of the requirement.
     *
     * @return a string to display to the user
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the display name of the requirement.
     *
     * @param name a string to display to the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns, if the requirement had been set
     *
     * @return true, if the value is not null
     */
    public boolean isSet() {
        return value != null;
    }

    /**
     * Returns if the requirement is optional
     *
     * @return true, if the requirement is optional
     */
    public boolean isOptional() {
        return isOptional;
    }

    /**
     * Sets, if the requirement should be optional
     *
     * @param optional true, if the requirement does not need to be set
     */
    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    /**
     * Returns the dynamic type of the requirement
     *
     * @return A class object holding the value set while creating the requirement object
     */
    public Class getTargetType() {
        return targetType;
    }
}
