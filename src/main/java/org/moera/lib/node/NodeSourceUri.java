package org.moera.lib.node;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.moera.lib.util.PercentEncoding;

/**
 * A node source URI with an ordered set of percent-encoded parameters.
 */
public class NodeSourceUri {

    /**
     * A service identified from a node source URI.
     */
    public enum Service {

        /**
         * Telegram.
         */
        TELEGRAM

    }

    /**
     * The value of this parameter is the contact e-mail address of the importing service that delivers content for
     * this node.
     */
    public static final String VIA_EMAIL = "via_email";

    private String uri = "";
    private final Map<String, String> parameters = new LinkedHashMap<>();
    private final Map<String, String> parametersView = Collections.unmodifiableMap(parameters);

    /**
     * Constructs an empty node source URI.
     */
    public NodeSourceUri() {
    }

    /**
     * Parses a node source URI and its parameters.
     *
     * @param sourceUri the serialized node source URI
     * @return the parsed node source URI
     */
    public static NodeSourceUri parse(String sourceUri) {
        Objects.requireNonNull(sourceUri, "sourceUri");

        String[] parts = sourceUri.split(";", -1);
        NodeSourceUri result = new NodeSourceUri();
        result.setUri(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            int equals = parts[i].indexOf('=');
            String name = PercentEncoding.decode(equals >= 0 ? parts[i].substring(0, equals) : parts[i]);
            String value = PercentEncoding.decode(equals >= 0 ? parts[i].substring(equals + 1) : "");
            result.setParameter(name, value);
        }
        return result;
    }

    /**
     * Gets the URI part.
     *
     * @return the URI part
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the URI part.
     *
     * @param uri the URI part
     * @throws IllegalArgumentException if the URI contains a semicolon
     */
    public void setUri(String uri) {
        Objects.requireNonNull(uri, "uri");
        if (uri.indexOf(';') >= 0) {
            throw new IllegalArgumentException("Node source URI must not contain a semicolon");
        }
        this.uri = uri;
    }

    /**
     * Gets a read-only live view of the parameters.
     *
     * @return the parameters in insertion order
     */
    public Map<String, String> getParameters() {
        return parametersView;
    }

    /**
     * Replaces all parameters with a copy of the supplied parameters. Empty names are ignored.
     *
     * @param parameters the new parameters
     */
    public void setParameters(Map<String, String> parameters) {
        Objects.requireNonNull(parameters, "parameters");
        Map<String, String> copy = new LinkedHashMap<>();
        for (var entry : parameters.entrySet()) {
            String name = Objects.requireNonNull(entry.getKey(), "parameter name");
            String value = Objects.requireNonNull(entry.getValue(), "parameter value");
            if (!name.isEmpty()) {
                copy.put(name, value);
            }
        }
        this.parameters.clear();
        this.parameters.putAll(copy);
    }

    /**
     * Checks whether a parameter exists.
     *
     * @param name the parameter name
     * @return {@code true} if the parameter exists
     */
    public boolean hasParameter(String name) {
        return parameters.containsKey(Objects.requireNonNull(name, "name"));
    }

    /**
     * Gets a parameter value.
     *
     * @param name the parameter name
     * @return the parameter value, or {@code null} if it does not exist
     */
    public String getParameter(String name) {
        return parameters.get(Objects.requireNonNull(name, "name"));
    }

    /**
     * Sets a parameter. An empty name is ignored.
     *
     * @param name the parameter name
     * @param value the parameter value
     */
    public void setParameter(String name, String value) {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(value, "value");
        if (!name.isEmpty()) {
            parameters.put(name, value);
        }
    }

    /**
     * Gets the service identified by the URI.
     *
     * @return the service, or {@code null} if the URI does not identify a supported service
     */
    public Service getService() {
        if (uri.startsWith("https://t.me/")) {
            return Service.TELEGRAM;
        }
        return null;
    }

    /**
     * Serializes this node source URI.
     *
     * @return the URI and encoded parameters
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(uri);
        parameters.forEach((name, value) -> result
            .append(';')
            .append(PercentEncoding.encode(name))
            .append('=')
            .append(PercentEncoding.encode(value))
        );
        return result.toString();
    }

}
