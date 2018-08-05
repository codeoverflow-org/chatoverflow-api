package org.codeoverflow.chatoverflow.api.plugin.configuration;

import java.util.HashMap;
import java.util.Map;

public class Requirements {

    public final Input input = new Input(this);
    public final Output output = new Output(this);
    public final Parameter parameter = new Parameter(this);

    private Map<String, Requirement<?>> requirements = new HashMap<>();

    <T> Requirement<T> getOraddAndReturn
            (String uniqueRequirementId, String name, boolean isOptional, Class targetType) {

        if (requirements.containsKey(uniqueRequirementId)) {
            try {
                //noinspection unchecked
                return (Requirement<T>) requirements.get(uniqueRequirementId);
            } catch (Exception e) {
                System.out.println("API Error. Unable to cast Requirement. " + e.toString());
                return null;
            }
        } else {
            Requirement<T> requirement = new Requirement<>(name, targetType, isOptional);
            this.requirements.put(uniqueRequirementId, requirement);
            return requirement;
        }
    }

    public Boolean allNeededRequirementsSet() {
        return requirements.values().stream().allMatch(req -> req.isSet() || req.isOptional());
    }

    public Map<String, Requirement<?>> getAllRequirements() {
        return requirements;
    }

}