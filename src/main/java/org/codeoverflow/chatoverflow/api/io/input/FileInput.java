package org.codeoverflow.chatoverflow.api.io.input;

import java.awt.image.BufferedImage;
import java.util.Optional;

public interface FileInput extends Input {

    Optional<String> getFile(String pathInResources);

    Optional<BufferedImage> getImage(String pathInResources);

    Optional<byte[]> getBinaryFile(String pathInResources);

}