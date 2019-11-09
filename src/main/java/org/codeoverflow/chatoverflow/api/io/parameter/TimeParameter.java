package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.time.LocalTime;

/**
 * A {@link Parameter} that is a time
 */
@IsRequirement
public interface TimeParameter extends Parameter<LocalTime> {
}
