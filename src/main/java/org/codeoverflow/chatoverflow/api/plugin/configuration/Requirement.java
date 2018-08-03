package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class Requirement<T> {

    private T value;
    private String name;
    private boolean isOptional;
    private Class targetType;

    Requirement(String name, Class targetType, boolean isOptional) {
        this.name = name;
        this.isOptional = isOptional;
        this.targetType = targetType;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSet() {
        return value != null;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    public Class getTargetType() {
        return targetType;
    }
}
