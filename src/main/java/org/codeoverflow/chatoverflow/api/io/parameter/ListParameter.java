package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.util.List;

/**
 * A {@link Parameter} that is a List&lt;String&gt;
 */
@IsRequirement
public interface ListParameter extends Parameter<List<String>>{
}
