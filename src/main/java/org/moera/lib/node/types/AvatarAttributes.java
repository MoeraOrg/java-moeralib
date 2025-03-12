package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarAttributes extends Structure implements Cloneable {

    private String mediaId;
    private int clipX;
    private int clipY;
    private int clipSize;
    private int avatarSize;
    private float rotate;
    private String shape;
    private Integer ordinal;

    /**
     * Retrieves ID of the public media file used as a source image.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the public media file used as a source image.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves x coordinate of the top-left corner of the clipping square.
     *
     * @return the value
     */
    public int getClipX() {
        return clipX;
    }

    /**
     * Sets x coordinate of the top-left corner of the clipping square.
     *
     * @param clipX the value to be set
     */
    public void setClipX(int clipX) {
        this.clipX = clipX;
    }

    /**
     * Retrieves y coordinate of the top-left corner of the clipping square.
     *
     * @return the value
     */
    public int getClipY() {
        return clipY;
    }

    /**
     * Sets y coordinate of the top-left corner of the clipping square.
     *
     * @param clipY the value to be set
     */
    public void setClipY(int clipY) {
        this.clipY = clipY;
    }

    /**
     * Retrieves size of the clipping square.
     *
     * @return the value
     */
    public int getClipSize() {
        return clipSize;
    }

    /**
     * Sets size of the clipping square.
     *
     * @param clipSize the value to be set
     */
    public void setClipSize(int clipSize) {
        this.clipSize = clipSize;
    }

    /**
     * Retrieves size of the avatar to be created.
     *
     * @return the value
     */
    public int getAvatarSize() {
        return avatarSize;
    }

    /**
     * Sets size of the avatar to be created.
     *
     * @param avatarSize the value to be set
     */
    public void setAvatarSize(int avatarSize) {
        this.avatarSize = avatarSize;
    }

    /**
     * Retrieves rotation angle of the source image.
     *
     * @return the value
     */
    public float getRotate() {
        return rotate;
    }

    /**
     * Sets rotation angle of the source image.
     *
     * @param rotate the value to be set
     */
    public void setRotate(float rotate) {
        this.rotate = rotate;
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
     * Retrieves ordinal of the avatar.
     *
     * @return the value
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets ordinal of the avatar.
     *
     * @param ordinal the value to be set
     */
    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(mediaId, "avatar.media-id.blank");
        ValidationUtil.minValue(clipSize, 100, "avatar.clip-size.out-of-range");
        ValidationUtil.minValue(avatarSize, 200, "avatar.avatar-size.out-of-range");
    }

    /**
     * Creates and returns a copy of this {@code AvatarAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarAttributes clone() {
        try {
            return (AvatarAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
