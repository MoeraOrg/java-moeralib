package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaAttachment implements Cloneable {

    private PrivateMediaFileInfo media;
    private RemoteMediaInfo remoteMedia;
    private boolean embedded;

    public PrivateMediaFileInfo getMedia() {
        return media;
    }

    public void setMedia(PrivateMediaFileInfo media) {
        this.media = media;
    }

    public RemoteMediaInfo getRemoteMedia() {
        return remoteMedia;
    }

    public void setRemoteMedia(RemoteMediaInfo remoteMedia) {
        this.remoteMedia = remoteMedia;
    }

    public boolean getEmbedded() {
        return embedded;
    }

    public void setEmbedded(boolean embedded) {
        this.embedded = embedded;
    }

    @Override
    public MediaAttachment clone() {
        try {
            return (MediaAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
