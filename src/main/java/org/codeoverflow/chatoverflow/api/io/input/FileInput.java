package org.codeoverflow.chatoverflow.api.io.input;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import java.awt.image.BufferedImage;
import java.util.Optional;

/**
 * Input that allows you to perform file operations that would otherwise be prohibited by the sandbox security manager.<br>
 * It features easy ways to read different types of files
 */
@IsRequirement(requires = "file system access")
public interface FileInput extends Input {

    /**
     * Load a text file and return the content as string
     * @param pathInResources the relative path to the file in the data folder
     * @return the content of the file or an empty optional if the operation failed
     */
    Optional<String> getFile(String pathInResources);

    /**
     * Load an image from a file and return it as BufferedImage
     * @param pathInResources the relative path to the file in the data folder
     * @return the image or an empty optional if the operation failed
     */
    Optional<BufferedImage> getImage(String pathInResources);

    /**
     * Load any file into a byte array
     * @param pathInResources the relative path to the file in the data folder
     * @return a byte array that contains all data from the file or an empty optional if the operation failed
     */
    Optional<byte[]> getBinaryFile(String pathInResources);

}