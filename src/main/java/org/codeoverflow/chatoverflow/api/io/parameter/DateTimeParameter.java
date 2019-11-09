package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.time.LocalDateTime;

/**
 * A {@link Parameter} that is a time at a specific date
 */
@IsRequirement
public interface DateTimeParameter extends Parameter<LocalDateTime> {
}
