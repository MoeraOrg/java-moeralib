package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.body.Body;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaCaption extends Structure implements Cloneable {

    private String mediaId;
    private Body captionSrc;
    private SourceFormat captionSrcFormat;

    /**
     * Retrieves ID of the media file the caption belongs to.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media file the caption belongs to.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves caption source text, a string representation of a JSON structure.
     *
     * @return the value
     */
    public Body getCaptionSrc() {
        return captionSrc;
    }

    /**
     * Sets caption source text, a string representation of a JSON structure.
     *
     * @param captionSrc the value to be set
     */
    public void setCaptionSrc(Body captionSrc) {
        this.captionSrc = captionSrc;
    }

    /**
     * Retrieves format of the caption source text.
     *
     * @return the value
     */
    public SourceFormat getCaptionSrcFormat() {
        return captionSrcFormat;
    }

    /**
     * Sets format of the caption source text.
     *
     * @param captionSrcFormat the value to be set
     */
    public void setCaptionSrcFormat(SourceFormat captionSrcFormat) {
        this.captionSrcFormat = captionSrcFormat;
    }

    /**
     * Creates and returns a copy of this {@code MediaCaption} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaCaption clone() {
        try {
            return (MediaCaption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
