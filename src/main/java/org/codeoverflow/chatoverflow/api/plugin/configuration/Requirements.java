package org.codeoverflow.chatoverflow.api.plugin.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A requirements object is used to hold all needed parameters and connections of a plugin.
 * The specific values can be required in the input, output and parameter objects.
 */
public class Requirements {

    /**
     * Require a new input parameter.
     */
    public final Input input = new Input(this);

    /**
     * Require a new output parameter.
     */
    public final Output output = new Output(this);

    /**
     * Require a new parameter.
     */
    public final Parameter parameter = new Parameter(this);

    private Map<String, Requirement<?>> requirements = new HashMap<>();

    /**
     * This method is used by the plugin and the framework.
     * First, the plugin creates the requirement by requiring it.
     * Then, the framework reads the empty requirement and sets its value.
     *
     * @param uniqueRequirementId the plugin unique requirement id
     * @param name                the display name of the config option to show to the user
     * @param isOptional          true, if an requirement has no to be filled
     * @param targetType          the target type of the requirement content. Has to be the same like <T>
     * @param <T>                 the target type of the requirement content. Has to be the same like targetType
     * @return An empty requirement container OR the already created requirement
     */
    <T> Requirement<T> getOrAddAndReturn
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

    /**
     * Tests, if all non-optional requirements had been set (e.g. by the framework)
     *
     * @return true, if all needed requirements had been set
     */
    public Boolean allNeededRequirementsSet() {
        return requirements.values().stream().allMatch(req -> req.isSet() || req.isOptional());
    }

    /**
     * Returns a list of all optional and non-optional requirements which are not set.
     *
     * @return a list of unique requirement ids
     */
    public List<String> getMissingRequirementIds() {
        ArrayList<String> missingIds = new ArrayList<>();

        requirements.forEach((key, value) -> {
            if (!value.isSet()) {
                missingIds.add(key);
            }
        });

        return missingIds;
    }

    /**
     * Returns all requirements.
     *
     * @return A map with unique requirement ids and their requirements.
     */
    public Map<String, Requirement<?>> getAllRequirements() {
        return requirements;
    }

}