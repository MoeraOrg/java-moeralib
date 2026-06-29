package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaToAttach extends Structure implements Cloneable {

    private String localMediaId;
    private String localMediaLeaseId;
    private RemoteMedia remoteMedia;

    /**
     * Retrieves ID of the local media to attach.
     *
     * @return the value
     */
    public String getLocalMediaId() {
        return localMediaId;
    }

    /**
     * Sets ID of the local media to attach.
     *
     * @param localMediaId the value to be set
     */
    public void setLocalMediaId(String localMediaId) {
        this.localMediaId = localMediaId;
    }

    /**
     * Retrieves (drafts only) ID of the lease of the local media to the target node.
     *
     * @return the value
     */
    public String getLocalMediaLeaseId() {
        return localMediaLeaseId;
    }

    /**
     * Sets (drafts only) ID of the lease of the local media to the target node.
     *
     * @param localMediaLeaseId the value to be set
     */
    public void setLocalMediaLeaseId(String localMediaLeaseId) {
        this.localMediaLeaseId = localMediaLeaseId;
    }

    /**
     * Retrieves remote media to attach.
     *
     * @return the value
     */
    public RemoteMedia getRemoteMedia() {
        return remoteMedia;
    }

    /**
     * Sets remote media to attach.
     *
     * @param remoteMedia the value to be set
     */
    public void setRemoteMedia(RemoteMedia remoteMedia) {
        this.remoteMedia = remoteMedia;
    }

    /**
     * Creates and returns a copy of this {@code MediaToAttach} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaToAttach clone() {
        try {
            return (MediaToAttach) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
