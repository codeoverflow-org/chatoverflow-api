package org.codeoverflow.chatoverflow.api.plugin.configuration;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

import org.codeoverflow.chatoverflow.api.io.output.FileOutput;
import org.codeoverflow.chatoverflow.api.io.output.RconOutput;
import org.codeoverflow.chatoverflow.api.io.output.SerialOutput;
import org.codeoverflow.chatoverflow.api.io.output.chat.DiscordChatOutput;
import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;
import org.codeoverflow.chatoverflow.api.io.output.twitter.TwitterTweetOutput;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

/**
 * Select a Output Requirement to get access to the desired platform or values.
 */
public class Output {

    private final Requirements requirements;

    Output(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a file system access which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<FileOutput> file(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, FileOutput.class);
    }

    /**
     * Requires a file system access which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<FileOutput> file(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "File", false, FileOutput.class);
    }

    /**
     * Requires a remote control for game servers using RCON protocol which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<RconOutput> rcon(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, RconOutput.class);
    }

    /**
     * Requires a remote control for game servers using RCON protocol which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<RconOutput> rcon(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "Rcon", false, RconOutput.class);
    }

    /**
     * Requires a connection with a device connected to a serial port (an Arduino for example) which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SerialOutput> serial(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, SerialOutput.class);
    }

    /**
     * Requires a connection with a device connected to a serial port (an Arduino for example) which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SerialOutput> serial(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "Serial", false, SerialOutput.class);
    }

    /**
     * Requires a discord chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DiscordChatOutput> discordChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, DiscordChatOutput.class);
    }

    /**
     * Requires a discord chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DiscordChatOutput> discordChat(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "Discord Chat", false, DiscordChatOutput.class);
    }

    /**
     * Requires a TwitchChatOutput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, TwitchChatOutput.class);
    }

    /**
     * Requires a TwitchChatOutput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "Twitch Chat", false, TwitchChatOutput.class);
    }

    /**
     * Requires a twitter chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitterTweetOutput> twitterTweet(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireOutput(uniqueRequirementId, displayName, isOptional, TwitterTweetOutput.class);
    }

    /**
     * Requires a twitter chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitterTweetOutput> twitterTweet(String uniqueRequirementId) {
        return requirements.requireOutput(uniqueRequirementId, "Twitter Tweet", false, TwitterTweetOutput.class);
    }


}
