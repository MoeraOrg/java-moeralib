package org.moera.lib.node.types;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class FundraiserInfo extends Structure {

    private static final Logger log = LoggerFactory.getLogger(FundraiserInfo.class);

    private final Map<String, String> fields = new HashMap<>();

    /**
     * Serializes a collection of {@code FundraiserInfo} objects into a JSON string.
     *
     * @param fundraisers the collection of {@code FundraiserInfo} objects to be serialized;
     *                    may be {@code null} or empty
     * @return a JSON string representation of the collection if it is not {@code null} or empty;
     *         {@code null} if the input collection is {@code null};
     *         an empty string if the input collection is empty
     */
    public static String serializeValue(Collection<FundraiserInfo> fundraisers) {
        if (fundraisers == null) {
            return null;
        } else if (fundraisers.isEmpty()) {
            return "";
        } else {
            try {
                return new ObjectMapper().writeValueAsString(fundraisers);
            } catch (JacksonException e) {
                log.error("Error serializing FundraiserInfo[]", e);
                return null;
            }
        }
    }

    /**
     * Deserializes a JSON string into a list of {@code FundraiserInfo} objects.
     *
     * @param value the JSON string to be deserialized; may be {@code null} or empty
     * @return a list of {@code FundraiserInfo} objects if the JSON string is valid;
     *         {@code null} if the input string is {@code null} or empty
     * @throws IOException if an error occurs during the deserialization process
     */
    public static List<FundraiserInfo> deserializeValue(String value) throws IOException {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return Arrays.asList(new ObjectMapper().readValue(value, FundraiserInfo[].class));
    }

    /**
     * Retrieves a map of additional fields for the object.
     * The map contains key-value pairs where the keys represent field names
     * and the values represent their corresponding values.
     *
     * @return a map of additional fields associated with the object
     */
    @JsonAnyGetter
    public Map<String, String> getFields() {
        return fields;
    }

    /**
     * Sets a custom field in the object. This method allows adding additional fields
     * to the object dynamically using the provided field name and value.
     *
     * @param name the name of the field to be added or updated, cannot be {@code null}
     * @param value the value of the field to be added or updated, cannot be {@code null}
     */
    @JsonAnySetter
    public void setField(String name, String value) {
        fields.put(name, value);
    }

    /**
     * Converts the current object into its JSON string representation.
     *
     * @return a JSON string representation of the current object, or {@code null}
     *        if an error occurs during serialization
     */
    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JacksonException e) {
            return null;
        }
    }

}
