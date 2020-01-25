package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.util.Map;

/**
 * A {@link Parameter} that is a Map&lt;String, String&gt;
 */
@IsRequirement
public interface MapParameter extends Parameter<Map<String, String>> {
}
