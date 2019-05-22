package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.io.dto.ImageFormat;

import java.awt.image.BufferedImage;

public interface FileInput extends Input {

    String getFile(String pathInResources);

    BufferedImage getImage(String pathInResources, ImageFormat format);

    byte[] getBinaryFile(String pathInResources);

}