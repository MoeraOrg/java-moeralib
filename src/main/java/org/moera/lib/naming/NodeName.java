package org.moera.lib.naming;

/**
 * Represents a node name that consists of a name and its generation. This
 * class provides utility methods for parsing, shortening, and expanding node names.
 */
public class NodeName {

    private String name;
    private int generation;

    /**
     * Default constructor for the {@code NodeName} class.
     */
    public NodeName() {
    }

    /**
     * Parses the provided node name string into a {@code NodeName} object.
     * The input node name is expected to follow the format {@code "<name>_<generation>"}.
     * If the input is {@code null} or empty, an empty {@code NodeName} object is returned.
     *
     * @param nodeName the string representation of the node name to be parsed, in the format
     *                 {@code "<name>_<generation>"}.
     *                 The {@code generation} part is optional and defaults to 0 if not present.
     * @return a {@code NodeName} object
     * @throws NodeNameParsingException if the generation part of the node name is not a valid integer
     */
    public static NodeName parse(String nodeName) {
        NodeName result = new NodeName();
        if (nodeName == null || nodeName.isEmpty()) {
            return result;
        }
        String[] parts = nodeName.split("_");
        result.setName(parts[0]);
        if (parts.length > 1) {
            try {
                result.setGeneration(Integer.parseInt(parts[1]));
            } catch (NumberFormatException e) {
                throw new NodeNameParsingException("Invalid value for generation: " + parts[1]);
            }
        }
        return result;
    }

    /**
     * Shortens the given node name by removing its generation if it is zero,
     * retaining only the main name component.
     *
     * @param nodeName the node name in the format {@code "<name>_<generation>"};
     *                 can be {@code null} or empty
     * @return a shortened version of the node name, or the original input if the node name is {@code null} or empty.
     */
    public static String shorten(String nodeName) {
        if (nodeName == null || nodeName.isEmpty()) {
            return nodeName;
        }
        return parse(nodeName).toShortString();
    }

    /**
     * Expands the provided node name into its full representation.
     *
     * @param nodeName the node name to be expanded in the format {@code "<name>_<generation>"},
     *                where {@code generation} part is optional
     * @return the expanded full representation of the node name, or the original
     *         input if it is {@code null} or empty.
     */
    public static String expand(String nodeName) {
        if (nodeName == null || nodeName.isEmpty()) {
            return nodeName;
        }
        return parse(nodeName).toString();
    }

    /**
     * Retrieves the name part of the node name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name part of the node name.
     *
     * @param name the name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the generation part of the node name.
     *
     * @return the generation
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Sets the generation part of the node name.
     *
     * @param generation the generation to be set
     */
    public void setGeneration(int generation) {
        this.generation = generation;
    }

    /**
     * Generates a string representation of this {@code NodeName} object by
     * combining the name and generation in the format {@code "<name>_<generation>"}.
     *
     * @return a string representation of this {@code NodeName}, or {@code null}
     *         if the {@code name} is {@code null}.
     */
    @Override
    public String toString() {
        return toString(name, generation);
    }

    /**
     * Converts the current {@code NodeName} instance to a shortened string representation.
     * If the {@code generation} is non-zero, the result will be the full string representation
     * (e.g., {@code "<name>_<generation>"}). Otherwise, it will return only the {@code name}.
     *
     * @return a shortened string representation of the node name
     */
    public String toShortString() {
        return generation != 0 ? toString() : name;
    }

    /**
     * Generates a string representation of a name and its generation in the format {@code "<name>_<generation>"}.
     * If the name is {@code null}, the method returns {@code null}.
     *
     * @param name the name to be included in the string representation; may be {@code null}
     * @param generation the generation to be included in the string representation
     * @return a formatted string combining the name and generation, or {@code null} if the input name is {@code null}
     */
    public static String toString(String name, int generation) {
        return name != null ? "%s_%d".formatted(name, generation) : null;
    }

}
