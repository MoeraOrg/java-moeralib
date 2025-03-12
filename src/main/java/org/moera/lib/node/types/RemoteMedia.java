package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteMedia extends Structure implements Cloneable {

    private String id;
    private String hash;
    private String digest;

    /**
     * Retrieves ID of the media file.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the media file.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves SHA-1 hash of the media file.
     *
     * @return the value
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets SHA-1 hash of the media file.
     *
     * @param hash the value to be set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Retrieves cryptographic digest of the media file.
     *
     * @return the value
     */
    public String getDigest() {
        return digest;
    }

    /**
     * Sets cryptographic digest of the media file.
     *
     * @param digest the value to be set
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * Creates and returns a copy of this {@code RemoteMedia} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemoteMedia clone() {
        try {
            return (RemoteMedia) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
