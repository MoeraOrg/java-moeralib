package org.moera.lib.crypto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Represents a fingerprint object.
 * The fingerprint typically includes a version and arbitrary fields.
 */
public class Fingerprint {

    private final Map<String, Object> fields = new HashMap<>();

    /**
     * Creates a {@code Fingerprint} instance and sets the version field.
     *
     * @param version the version number to be set for the fingerprint
     */
    public Fingerprint(int version) {
        put("version", version);
    }

    /**
     * Returns the version associated with the fingerprint.
     *
     * @return the version
     */
    public int getVersion() {
        return (Integer) get("version");
    }

    /**
     * Retrieves the value associated with the specified field name.
     *
     * @param name the name of the field whose value is to be retrieved
     * @return the value associated with the specified field name, or {@code null} if the field does not exist
     */
    public Object get(String name) {
        return fields.get(name);
    }

    /**
     * Associates the specified value with the specified field name.
     * If the fingerprint previously contained a mapping for the name, the old value is replaced.
     *
     * @param name the name with which the specified value is to be associated
     * @param value the value to be associated with the specified name
     * @return the previous value associated with the name, or {@code null} if there was no mapping for the name
     */
    public Object put(String name, Object value) {
        return fields.put(name, value);
    }

    /**
     * Checks if a field with the specified name exists in the fingerprint.
     *
     * @param name the name of the field to check
     * @return true if the field exists, false otherwise
     */
    public boolean containsField(String name) {
        return fields.containsKey(name);
    }

    /**
     * Retrieves the set of field names stored in this object.
     *
     * @return a set of strings representing the names of the fields
     */
    public Set<String> fieldSet() {
        return fields.keySet();
    }

    /**
     * Returns a set view of the name-value pairs contained in this fingerprint.
     * Each entry in the set represents a mapping between a field name and its value.
     *
     * @return a set of mappings from field names to their associated values
     */
    public Set<Map.Entry<String, Object>> entrySet() {
        return fields.entrySet();
    }

    /**
     * Retrieves the value associated with the specified name.
     * If the name does not exist in the fingerprint, the specified default value is returned.
     *
     * @param name the name to look for
     * @param defaultValue the value to return if the name is not found
     * @return the value associated with the specified name, or the default value if the name is not found
     */
    public Object getOrDefault(String name, Object defaultValue) {
        return fields.getOrDefault(name, defaultValue);
    }

    /**
     * Performs the given action for each field.
     *
     * @param action the action to be performed.
     *               It accepts a field name of type {@code String} and its corresponding value of type {@code Object}.
     *               The action must not be {@code null}.
     */
    public void forEach(BiConsumer<? super String, ? super Object> action) {
        fields.forEach(action);
    }

}
