package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.io.File;

@IsRequirement(requires = "directory to host custom content using the framework web server")
public interface HostingOutput extends Output {

    boolean host(File file);

    boolean host(File file, String endpoint);

}
