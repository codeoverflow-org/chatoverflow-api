package org.codeoverflow.chatoverflow.api.plugin;

import java.time.LocalDateTime;

/**
 * A plugin log message is an log entry from a plugin, used to store e.g. message and time of occurrence.
 */
public class PluginLogMessage {

    private String message;
    private LocalDateTime timestamp;

    /**
     * Creates a new plugin log message by setting the given message and the timestamp to now.
     *
     * @param message the message to set for the logging entry
     */
    public PluginLogMessage(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Returns the message of the log entry.
     *
     * @return plain string containing the log message
     */
    public String getMessage() {
        return message;
    }

    /**
     * The timestamp of the occurrence of the logging call.
     *
     * @return a localized date time object
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
