package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarDescription extends Structure implements Cloneable {

    private String mediaId;
    private String shape;
    private Boolean optional;

    /**
     * Retrieves ID of the public media file used as an avatar image.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the public media file used as an avatar image.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves shape of the avatar.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * Sets shape of the avatar.
     *
     * @param shape the value to be set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Retrieves if set to <code>true</code>, the node will ignore the absence of the media file referenced in
     * <code>mediaId</code> field (empty avatar will be used in this case); if set to <code>false</code> or absent, the
     * node will return an error, if the media file referenced in <code>mediaId</code> field is absent
     * .
     *
     * @return the value
     */
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Sets if set to <code>true</code>, the node will ignore the absence of the media file referenced in
     * <code>mediaId</code> field (empty avatar will be used in this case); if set to <code>false</code> or absent, the
     * node will return an error, if the media file referenced in <code>mediaId</code> field is absent
     * .
     *
     * @param optional the value to be set
     */
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * Creates and returns a copy of this {@code AvatarDescription} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarDescription clone() {
        try {
            return (AvatarDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
