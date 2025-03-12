package org.moera.lib.node.types.notifications;

/**
 * Represents a notification's parameter for logging purposes.
 *
 * @param name  the name of the parameter
 * @param value the value of the parameter
 */
public record LogPair(String name, String value) {

    /**
     * Creates a new {@code LogPair} instance with the given name and value.
     *
     * @param name  the name of the log parameter
     * @param value the value of the log parameter
     * @return a new {@code LogPair} instance containing the specified name and value
     */
    public static LogPair of(String name, String value) {
        return new LogPair(name, value);
    }

}
