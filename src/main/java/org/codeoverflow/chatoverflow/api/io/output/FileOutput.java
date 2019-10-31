package org.codeoverflow.chatoverflow.api.io.output;

import org.codeoverflow.chatoverflow.api.IsRequirement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Output that allows you to perform file operations that would otherwise be prohibited by the sandbox security manager.<br>
 * It features easy ways to save all kinds of files, creat or delete directories or check if a file exists.
 */
@IsRequirement(requires = "file system access")
public interface FileOutput extends Output {

    /**
     * Save a BufferedImage to a file
     * @param image the image that should be saved
     * @param format a string containing the informal name of the format (e.g. PNG / JPG / GIF / BMP)<br>
     *               use {@link ImageIO#getWriterFormatNames()} to list all valid ones
     * @param pathInResources the relative path to the file in the data folder
     * @return if the operation was successful
     */
    boolean saveImage(BufferedImage image, String format, String pathInResources);

    /**
     * Save any byte array to a file.
     * @param bytes raw content that should be saved to the file
     * @param pathInResources the relative path to the file in the data folder
     * @return if the operation was successful
     */
    boolean saveBinaryFile(byte[] bytes, String pathInResources);

    /**
     * Save a String to a text file
     * @param content the text that should be saved
     * @param pathInResources the relative path to the file in the data folder
     * @return if the operation was successful
     */
    boolean saveFile(String content, String pathInResources);

    /**
     * Create a new folder inside the data folder
     * @param folderName the relative path to the folder in the data folder
     * @return if the operation was successful
     */
    boolean createDirectory(String folderName);

    /**
     * Check if a file or folder does exist
     * @param pathInResources the relative path to the file in the data folder
     * @return if the file does exist
     */
    boolean exists(String pathInResources);

    /**
     * Delete a file or a folder
     * @param pathInResources the relative path to the file in the data folder
     * @return if the operation was successful
     */
    boolean delete(String pathInResources);

}
