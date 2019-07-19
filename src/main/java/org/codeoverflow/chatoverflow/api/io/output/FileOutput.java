package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.awt.image.BufferedImage;

@IsRequirement(requires = "file system access")
public interface FileOutput extends Output {

    boolean saveImage(BufferedImage image, String format, String pathInResources);

    boolean saveBinaryFile(byte[] bytes, String pathInResources);

    boolean saveFile(String content, String pathInResources);

    boolean createDirectory(String folderName);

    boolean exists(String pathInResources);

    boolean delete(String pathInResources);

}
