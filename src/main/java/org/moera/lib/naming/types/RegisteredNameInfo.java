package org.moera.lib.naming.types;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents the information associated with a registered name.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisteredNameInfo {

    private String name;
    private int generation;
    private byte[] updatingKey;
    private String nodeUri;
    private long created;
    private byte[] signingKey;
    private Long validFrom;
    private byte[] digest;

    /**
     * Retrieves the node name.
     *
     * @return the name as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the node name.
     *
     * @param name the node name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the generation of the node name.
     *
     * @return the generation value
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Sets the generation of the node name.
     *
     * @param generation the generation value to set
     */
    public void setGeneration(int generation) {
        this.generation = generation;
    }

    /**
     * Retrieves the updating key associated with the node name.
     *
     * @return the updating key
     */
    public byte[] getUpdatingKey() {
        return updatingKey;
    }

    /**
     * Sets the updating key for the node name.
     *
     * @param updatingKey the updating key to be set
     */
    public void setUpdatingKey(byte[] updatingKey) {
        this.updatingKey = updatingKey;
    }

    /**
     * Retrieves the URI of the node.
     *
     * @return the node URI as a string, or {@code null} if no URI is associated with the node name
     */
    public String getNodeUri() {
        return nodeUri;
    }

    /**
     * Sets the URI of the node.
     *
     * @param nodeUri the URI of the node to set
     */
    public void setNodeUri(String nodeUri) {
        this.nodeUri = nodeUri;
    }

    /**
     * Retrieves the creation timestamp of the name.
     *
     * @return the creation timestamp (in epoch seconds)
     */
    public long getCreated() {
        return created;
    }

    /**
     * Sets the creation timestamp of the name.
     *
     * @param created the creation timestamp (in epoch seconds) to be set
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     * Retrieves current the signing key associated with the name.
     *
     * @return the signing key
     */
    public byte[] getSigningKey() {
        return signingKey;
    }

    /**
     * Sets the signing key for the name.
     *
     * @param signingKey the signing key to be set
     */
    public void setSigningKey(byte[] signingKey) {
        this.signingKey = signingKey;
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

    /**
     * Retrieves the digest of the information associated with the name.
     *
     * @return the digest
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets the digest of the information associated with the name.
     *
     * @param digest the digest to be set
     */
    public void setDigest(byte[] digest) {
        this.digest = digest;
    }

}
