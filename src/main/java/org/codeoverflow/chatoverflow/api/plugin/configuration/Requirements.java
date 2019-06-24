package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.Serializable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    private Map<String, Requirement<? extends Serializable>> inputRequirements = new HashMap<>();
    private Map<String, Requirement<? extends Serializable>> outputRequirements = new HashMap<>();
    private Map<String, Requirement<? extends Serializable>> parameterRequirements = new HashMap<>();

    <T extends Serializable> Requirement<T> requireInput(String uniqueRequirementId, String name, boolean isOptional, Class targetType) {
        return addRequirement(inputRequirements, uniqueRequirementId, name, isOptional, targetType);
    }

    <T extends Serializable> Requirement<T> requireOutput(String uniqueRequirementId, String name, boolean isOptional, Class targetType) {
        return addRequirement(outputRequirements, uniqueRequirementId, name, isOptional, targetType);
    }

    <T extends Serializable> Requirement<T> requireParameter(String uniqueRequirementId, String name, boolean isOptional, Class targetType) {
        return addRequirement(parameterRequirements, uniqueRequirementId, name, isOptional, targetType);
    }

    /**
     * This method is used by the plugin to tell the framework its requirements.
     *
     * @param map                 the target map to save the requirement
     * @param uniqueRequirementId the plugin unique requirement id
     * @param name                the display name of the config option to show to the user
     * @param isOptional          true, if an requirement has no to be filled
     * @param targetType          the target type of the requirement content. Has to be the same like <T>
     * @param <T>                 the target type of the requirement content. Has to be the same like targetType
     * @return An empty requirement container
     */
    private <T extends Serializable> Requirement<T> addRequirement(Map<String, Requirement<?>> map, String uniqueRequirementId, String name,
                                                                   boolean isOptional, Class targetType) {
        if (getAllEntries()
                .anyMatch(entry -> entry.getKey().equals(uniqueRequirementId))) {
            throw new IllegalArgumentException("Requirement Id " + uniqueRequirementId + " is already in use.");
        }
        Requirement<T> requirement = new Requirement<>(name, targetType, isOptional);
        map.put(uniqueRequirementId, requirement);
        return requirement;
    }

    /**
     * Returns a requirement of any type (input / output / parameter) with the given unique id.
     *
     * @param uniqueRequirementId the plugin unique requirement id
     * @return an optional encapsulating the requirement or none
     */
    public Optional<? extends Requirement<? extends Serializable>> getRequirementById(String uniqueRequirementId) {
        return getAllEntries()
                .filter(entry -> entry.getKey().equals(uniqueRequirementId))
                .map(Map.Entry::getValue).findFirst();
    }

    /**
     * Unsets the value of a requirement specified by the unique id.
     *
     * @param uniqueRequirementId the plugin unique requirement id
     * @return true, if a requirement with the given id exists
     */
    public boolean unsetRequirementById(String uniqueRequirementId) {
        Optional<? extends Requirement<? extends Serializable>> requirement =
                getAllEntries().filter(entry -> entry.getKey().equals(uniqueRequirementId))
                        .map(Map.Entry::getValue).findFirst();

        requirement.ifPresent(Requirement::unsetValue);
        return requirement.isPresent();
    }

    /**
     * Tests, if all non-optional requirements had been set (e.g. by the framework)
     *
     * @return true, if all needed requirements had been set
     */
    public Boolean isComplete() {
        return getAllEntries()
                .map(Map.Entry::getValue)
                .allMatch(req -> req.isSet() || req.isOptional());
    }

    /**
     * Returns a list of all optional and non-optional requirements which are not set.
     *
     * @return a list of unique requirement ids
     */
    public List<Requirement<? extends Serializable>> getMissingRequirements() {
        return getAllEntries()
                .filter(entry -> !entry.getValue().isSet())
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    private Stream<Map.Entry<String, Requirement<? extends Serializable>>> getAllEntries() {
        return Stream.of(inputRequirements.entrySet().stream(),
                outputRequirements.entrySet().stream(),
                parameterRequirements.entrySet().stream()).reduce(Stream::concat).get();
    }

    public Map<String, Requirement<? extends Serializable>> getRequirementMap() {
        return getAllEntries().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Collection<Requirement<? extends Serializable>> getInputRequirements() {
        return inputRequirements.values();
    }

    public Collection<Requirement<? extends Serializable>> getOutputRequirements() {
        return outputRequirements.values();
    }

    public Collection<Requirement<? extends Serializable>> getParameterRequirements() {
        return parameterRequirements.values();
    }
}