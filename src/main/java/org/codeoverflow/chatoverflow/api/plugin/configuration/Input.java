package org.codeoverflow.chatoverflow.api.plugin.configuration;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

import org.codeoverflow.chatoverflow.api.io.input.FileInput;
import org.codeoverflow.chatoverflow.api.io.input.SampleInput;
import org.codeoverflow.chatoverflow.api.io.input.SerialInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.DiscordChatInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;
import org.codeoverflow.chatoverflow.api.io.input.event.StreamElementsEventInput;
import org.codeoverflow.chatoverflow.api.io.input.event.TipeeestreamEventInput;

// THIS FILE IS GENERATED WHILE COMPILING. DO NOT CHANGE ANYTHING HERE!

/**
 * Select a Input Requirement to get access to the desired platform or values.
 */
public class Input {

    private final Requirements requirements;

    Input(Requirements requirements) {
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
    public Requirement<FileInput> file(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, FileInput.class);
    }

    /**
     * Requires a file system access which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<FileInput> file(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "File", false, FileInput.class);
    }

    /**
     * Requires a SampleInput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SampleInput> sample(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, SampleInput.class);
    }

    /**
     * Requires a SampleInput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SampleInput> sample(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Sample", false, SampleInput.class);
    }

    /**
     * Requires a connection with a device connected to a serial port (an Arduino for example) which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SerialInput> serial(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, SerialInput.class);
    }

    /**
     * Requires a connection with a device connected to a serial port (an Arduino for example) which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<SerialInput> serial(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Serial", false, SerialInput.class);
    }

    /**
     * Requires a discord chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DiscordChatInput> discordChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, DiscordChatInput.class);
    }

    /**
     * Requires a discord chat bot which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<DiscordChatInput> discordChat(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Discord Chat", false, DiscordChatInput.class);
    }

    /**
     * Requires a TwitchChatInput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchChatInput.class);
    }

    /**
     * Requires a TwitchChatInput which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Twitch Chat", false, TwitchChatInput.class);
    }

    /**
     * Requires a access to the StreamElements api which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StreamElementsEventInput> streamElements(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, StreamElementsEventInput.class);
    }

    /**
     * Requires a access to the StreamElements api which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<StreamElementsEventInput> streamElements(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Stream Elements Event", false, StreamElementsEventInput.class);
    }

    /**
     * Requires a login for the TipeeeStream api which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @param displayName         a string to display to the user while setting your requirement
     * @param isOptional          true if this requirement is optional, false if mandatory
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TipeeestreamEventInput> tipeeeStream(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TipeeestreamEventInput.class);
    }

    /**
     * Requires a login for the TipeeeStream api which has to be specified by the user.
     *
     * @param uniqueRequirementId a plugin unique identifier which is stored for your plugin
     * @return the requirement object. Use the get() method only at runtime!
     */
    public Requirement<TipeeestreamEventInput> tipeeeStream(String uniqueRequirementId) {
        return requirements.requireInput(uniqueRequirementId, "Tipeeestream Event", false, TipeeestreamEventInput.class);
    }


}
