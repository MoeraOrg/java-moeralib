package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaLeaseInfo extends Structure implements Cloneable {

    private String id;
    private PrivateMediaFileInfo media;

    /**
     * Retrieves ID of the lease.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the lease.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves details of the media.
     *
     * @return the value
     */
    public PrivateMediaFileInfo getMedia() {
        return media;
    }

    /**
     * Sets details of the media.
     *
     * @param media the value to be set
     */
    public void setMedia(PrivateMediaFileInfo media) {
        this.media = media;
    }

    /**
     * Creates and returns a copy of this {@code MediaLeaseInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaLeaseInfo clone() {
        try {
            return (MediaLeaseInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
