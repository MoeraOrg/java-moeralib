package org.moera.lib.naming.types;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents the information about a signing key.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SigningKeyInfo {

    private byte[] key;
    private Long validFrom;

    /**
     * Retrieves the signing key.
     *
     * @return the key
     */
    public byte[] getKey() {
        return key;
    }

    /**
     * Sets the signing key.
     *
     * @param key the key to set
     */
    public void setKey(byte[] key) {
        this.key = key;
    }

    /**
     * Retrieves the signing key activation time.
     *
     * @return the signing key activation timestamp (in epoch seconds)
     */
    public Long getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the signing key activation time.
     *
     * @param validFrom the signing key activation timestamp (in epoch seconds) to be set
     */
    public void setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
    }

}
