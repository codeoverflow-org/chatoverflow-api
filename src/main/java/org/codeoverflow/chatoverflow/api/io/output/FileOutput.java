package org.codeoverflow.chatoverflow.api.io.output;

import java.awt.image.BufferedImage;

public interface FileOutput extends Output {

    boolean saveImage(BufferedImage image, String format, String pathInResources);

    boolean saveBinaryFile(byte[] bytes, String pathInResources);

    boolean saveFile(String content, String pathInResources);

    boolean createDirectory(String folderName);

    boolean exists(String pathInResources);

    boolean delete(String pathInResources);

}
