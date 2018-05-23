package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class ParameterRequirement<T> {

    private T parameter;

    public ParameterRequirement(T defaultParameter) {
        this.parameter = defaultParameter;
    }

    public ParameterRequirement() {
        this(null);
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }

}