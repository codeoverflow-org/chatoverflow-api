package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.io.dto.ImageFormat;

import java.awt.image.BufferedImage;

public interface FileOutput extends Output {

    boolean saveImage(BufferedImage image, ImageFormat format, String pathInResources);

    boolean saveBinaryFile(byte[] bytes, String pathInResources);

    boolean saveFile(String content, String pathInResources);

}
