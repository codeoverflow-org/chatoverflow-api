package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.time.LocalDate;

/**
 * A {@link Parameter} that is a date
 */
@IsRequirement
public interface DateParameter extends Parameter<LocalDate> {
}
