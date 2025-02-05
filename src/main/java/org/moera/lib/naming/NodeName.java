package org.moera.lib.naming;

public class NodeName {

    private String name;
    private int generation;

    public NodeName() {
    }

    public static NodeName parse(String registeredName) {
        NodeName result = new NodeName();
        if (registeredName == null || registeredName.isEmpty()) {
            return result;
        }
        String[] parts = registeredName.split("_");
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

    public static String shorten(String registeredName) {
        if (registeredName == null || registeredName.isEmpty()) {
            return registeredName;
        }
        return parse(registeredName).toShortString();
    }

    public static String expand(String registeredName) {
        if (registeredName == null || registeredName.isEmpty()) {
            return registeredName;
        }
        return parse(registeredName).toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return toString(name, generation);
    }

    public String toShortString() {
        return generation != 0 ? toString() : name;
    }

    public static String toString(String name, int generation) {
        return name != null ? String.format("%s_%d", name, generation) : null;
    }

}
