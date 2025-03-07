package org.moera.lib.node.types;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FundraiserInfo extends Structure {

    private static final Logger log = LoggerFactory.getLogger(FundraiserInfo.class);

    private final Map<String, String> fields = new HashMap<>();

    public static String serializeValue(Collection<FundraiserInfo> fundraisers) {
        if (fundraisers == null) {
            return null;
        } else if (fundraisers.isEmpty()) {
            return "";
        } else {
            try {
                return new ObjectMapper().writeValueAsString(fundraisers);
            } catch (JsonProcessingException e) {
                log.error("Error serializing FundraiserInfo[]", e);
                return null;
            }
        }
    }

    public static List<FundraiserInfo> deserializeValue(String value) throws IOException {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return Arrays.asList(new ObjectMapper().readValue(value, FundraiserInfo[].class));
    }

    @JsonAnyGetter
    public Map<String, String> getFields() {
        return fields;
    }

    @JsonAnySetter
    public void setField(String name, String value) {
        fields.put(name, value);
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

}
