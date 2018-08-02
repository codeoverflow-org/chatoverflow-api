package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class SourceRequirement<T> implements Requirement {

    private T source = null;
    private String name;

    public SourceRequirement(String name) {
        this.name = name;
    }

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
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
