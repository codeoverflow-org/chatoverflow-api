package org.codeoverflow.chatoverflow.api.plugin.configuration;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

import org.codeoverflow.chatoverflow.api.io.output.FileOutput;
import org.codeoverflow.chatoverflow.api.io.output.SerialOutput;
import org.codeoverflow.chatoverflow.api.io.output.chat.DiscordChatOutput;
import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;

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
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, FileOutput.class);
    }

    /**
     * Requires a file system access which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<FileOutput> file(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "File", false, FileOutput.class);
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
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, SerialOutput.class);
    }

    /**
     * Requires a connection with a device connected to a serial port (an Arduino for example) which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SerialOutput> serial(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Serial", false, SerialOutput.class);
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
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, DiscordChatOutput.class);
    }

    /**
     * Requires a discord chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DiscordChatOutput> discordChat(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Discord Chat", false, DiscordChatOutput.class);
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
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchChatOutput.class);
    }

    /**
     * Requires a TwitchChatOutput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Twitch Chat", false, TwitchChatOutput.class);
    }


}
