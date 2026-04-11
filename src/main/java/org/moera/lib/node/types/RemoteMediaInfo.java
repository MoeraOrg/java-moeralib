package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteMediaInfo extends Structure implements Cloneable {

    private String id;
    private String hash;
    private String digest;
    private String mimeType;
    private Boolean attachment;

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
     * Retrieves MIME type of the media.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the media.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Retrieves <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAttachment() {
        return attachment;
    }

    /**
     * Sets <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @param attachment the value to be set
     */
    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    /**
     * Creates and returns a copy of this {@code RemoteMediaInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemoteMediaInfo clone() {
        try {
            return (RemoteMediaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
