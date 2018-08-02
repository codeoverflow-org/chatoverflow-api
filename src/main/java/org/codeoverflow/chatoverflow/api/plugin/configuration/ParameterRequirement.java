package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class ParameterRequirement<T> implements Requirement {

    private T parameter;
    private String name;

    public ParameterRequirement(String name, T defaultParameter) {
        this.parameter = defaultParameter;
        this.name = name;
    }

    public ParameterRequirement(String name) {
        this(name, null);
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}