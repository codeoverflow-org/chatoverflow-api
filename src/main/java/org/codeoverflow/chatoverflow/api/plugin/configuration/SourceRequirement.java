package org.codeoverflow.chatoverflow.api.plugin.configuration;

public class SourceRequirement<T> {

    private T source = null;

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }
}
