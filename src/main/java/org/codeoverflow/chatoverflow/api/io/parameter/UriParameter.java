package org.codeoverflow.chatoverflow.api.io.parameter;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.net.URI;

/**
 * A {@link Parameter} that is a URI
 */
@IsRequirement
public interface UriParameter extends Parameter<URI> {
}
