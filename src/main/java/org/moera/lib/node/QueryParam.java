package org.moera.lib.node;

/**
 * Represents a query parameter with a name and associated value.
 */
public record QueryParam(String name, Object value) {

    /**
     * Creates a new instance of {@code QueryParam} using the specified name and value.
     *
     * @param name the name of the query parameter
     * @param value the value of the query parameter
     * @return a new {@code QueryParam} instance with the provided name and value
     */
    public static QueryParam of(String name, Object value) {
        return new QueryParam(name, value);
    }

}
