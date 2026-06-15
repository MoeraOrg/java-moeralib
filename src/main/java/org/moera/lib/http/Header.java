package org.moera.lib.http;

/**
 * Represents an HTTP header parameter with a name and associated value.
 */
public record Header(String name, String value) {

    /**
     * Creates a new instance of {@code Header} using the specified name and value.
     *
     * @param name the name of the header
     * @param value the value of the header
     * @return a new {@code Header} instance with the provided name and value
     */
    public static Header of(String name, String value) {
        return new Header(name, value);
    }

}
