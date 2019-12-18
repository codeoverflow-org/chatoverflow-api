package org.codeoverflow.chatoverflow.api.io.output.twitter;


import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.output.Output;

import java.awt.image.BufferedImage;

/**
 * The TwitterTweetOutput allows you to send tweets with or without image
 */

@IsRequirement(requires = "twitter chat bot")
public interface TwitterTweetOutput extends Output {


    /**
     * Sends a plaintext tweet
     *
     * @param status Text that should be tweeted
     */
    boolean sendTweet(String status);

    /**
     * Sends a tweet with an image
     *
     * @param status Text that should be tweeted
     * @param image  BufferedImage that should be tweeted
     */
    boolean sendImageTweet(String status, BufferedImage image);

}
