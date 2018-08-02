package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.Input;
import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;
import org.codeoverflow.chatoverflow.api.io.output.Output;

import java.util.HashMap;
import java.util.Map;

public class Requirements {

    // TODO: Updated class to one single hash map when the type erasure thing is solved
    // TODO: Add check to test, if all requirements are resolved
    // TODO: Kick different requirement types

    private Map<String, SourceRequirement<? extends Input>> inputs = new HashMap<>();
    private Map<String, SourceRequirement<? extends Output>> outputs = new HashMap<>();
    private Map<String, ParameterRequirement<String>> parameters = new HashMap<>();

    public SourceRequirement<TwitchChatInput> requireTwitchChatInput(String uniqueRequirementId, String name) {
        return addAndReturn(uniqueRequirementId, name, TwitchChatInput.class);
    }

    private <T extends Input> SourceRequirement<T> addAndReturn(String id, String name, Class sourceClass) {
        SourceRequirement<T> input = new SourceRequirement<>(name);
        this.inputs.put(id, input);
        return input;
    }

    public <T extends Input> SourceRequirement<T> require(Class requirementType, String uniqueRequirementId, String name) {
        SourceRequirement<T> input = new SourceRequirement<>(name);
        this.inputs.put(uniqueRequirementId, input);
        return input;
    }

    public void addInputRequirement(String uniqueRequirementId, SourceRequirement<? extends Input> requirement) {
        this.inputs.put(uniqueRequirementId, requirement);
    }

    public void addOutputRequirement(String uniqueRequirementId, SourceRequirement<? extends Output> requirement) {
        this.outputs.put(uniqueRequirementId, requirement);
    }

    public void addParameterRequirement(String uniqueRequirementId, ParameterRequirement<String> requirement) {
        this.parameters.put(uniqueRequirementId, requirement);
    }

    public Map<String, SourceRequirement<? extends Input>> getAllInputRequirements() {
        return inputs;
    }

    public Map<String, SourceRequirement<? extends Output>> getAllOutputRequirements() {
        return outputs;
    }

    public Map<String, ParameterRequirement<String>> getAllParameterRequirements() {
        return parameters;
    }

    public SourceRequirement<? extends Input> getInputRequirement(String requirementId) {
        return inputs.get(requirementId);
    }

    public SourceRequirement<? extends Output> getOutputRequirement(String requirementId) {
        return outputs.get(requirementId);
    }

    public ParameterRequirement<String> getParameterRequirement(String requirementId) {
        return parameters.get(requirementId);
    }

}