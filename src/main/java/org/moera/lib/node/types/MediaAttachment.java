package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaAttachment extends Structure implements Cloneable {

    private PrivateMediaFileInfo media;
    private RemoteMediaInfo remoteMedia;
    private boolean embedded;

    /**
     * Retrieves details of the attached media, may be absent if the media is not located on the node.
     *
     * @return the value
     */
    public PrivateMediaFileInfo getMedia() {
        return media;
    }

    /**
     * Sets details of the attached media, may be absent if the media is not located on the node.
     *
     * @param media the value to be set
     */
    public void setMedia(PrivateMediaFileInfo media) {
        this.media = media;
    }

    /**
     * Retrieves details of the media, if it is located on another node.
     *
     * @return the value
     */
    public RemoteMediaInfo getRemoteMedia() {
        return remoteMedia;
    }

    /**
     * Sets details of the media, if it is located on another node.
     *
     * @param remoteMedia the value to be set
     */
    public void setRemoteMedia(RemoteMediaInfo remoteMedia) {
        this.remoteMedia = remoteMedia;
    }

    /**
     * Retrieves <code>true</code> if the media is used in the body of the posting/comment, <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public boolean isEmbedded() {
        return embedded;
    }

    /**
     * Sets <code>true</code> if the media is used in the body of the posting/comment, <code>false</code> otherwise
     * .
     *
     * @param embedded the value to be set
     */
    public void setEmbedded(boolean embedded) {
        this.embedded = embedded;
    }

    /**
     * Creates and returns a copy of this {@code MediaAttachment} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaAttachment clone() {
        try {
            return (MediaAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
