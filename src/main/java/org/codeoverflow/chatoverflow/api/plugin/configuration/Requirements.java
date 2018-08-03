package org.codeoverflow.chatoverflow.api.plugin.configuration;

import java.util.HashMap;
import java.util.Map;

public class Requirements {

    public final Input input = new Input(this);
    public final Output output = new Output(this);
    public final Parameter parameter = new Parameter(this);

    private Map<String, Requirement<?>> requirements = new HashMap<>();

    <T> Requirement<T> addAndReturn
            (String uniqueRequirementId, String name, boolean isOptional, Class targetType) {

        Requirement<T> requirement = new Requirement<>(name, targetType, isOptional);
        this.requirements.put(uniqueRequirementId, requirement);
        return requirement;
    }

    public Boolean allNeededRequirementsSet() {
        return requirements.values().stream().allMatch(req -> req.isSet() || req.isOptional());
    }

}