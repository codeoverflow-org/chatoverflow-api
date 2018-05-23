package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.Input;
import org.codeoverflow.chatoverflow.api.io.output.Output;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    Map<String, SourceRequirement<? extends Input>> inputs = new HashMap<>();
    Map<String, SourceRequirement<? extends Output>> outputs = new HashMap<>();
    Map<String, ParameterRequirement<String>> parameters = new HashMap<>();

}