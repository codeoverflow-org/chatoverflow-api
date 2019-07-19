package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.awt.image.BufferedImage;
import java.util.Optional;

@IsRequirement(requires = "file system access")
public interface FileInput extends Input {

    Optional<String> getFile(String pathInResources);

    Optional<BufferedImage> getImage(String pathInResources);

    Optional<byte[]> getBinaryFile(String pathInResources);

}