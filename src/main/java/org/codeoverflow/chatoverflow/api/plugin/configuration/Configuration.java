package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.Input;
import org.codeoverflow.chatoverflow.api.io.output.Output;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private Map<String, SourceRequirement<? extends Input>> inputs = new HashMap<>();
    private Map<String, SourceRequirement<? extends Output>> outputs = new HashMap<>();
    private Map<String, ParameterRequirement<String>> parameters = new HashMap<>();

    public void addInputRequirement(String name, SourceRequirement<? extends Input> requirement) {
        this.inputs.put(name, requirement);
    }

    public void addOutputRequirement(String name, SourceRequirement<? extends Output> requirement) {
        this.outputs.put(name, requirement);
    }

    public void addParameterRequirement(String name, ParameterRequirement<String> requirement) {
        this.parameters.put(name, requirement);
    }

    public Map<String, SourceRequirement<? extends Input>> getInputs() {
        return inputs;
    }

    public Map<String, SourceRequirement<? extends Output>> getOutputs() {
        return outputs;
    }

    public Map<String, ParameterRequirement<String>> getParameters() {
        return parameters;
    }
}