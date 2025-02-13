package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarAttributes implements Cloneable {

    private String mediaId;
    private int clipX;
    private int clipY;
    private int clipSize;
    private int avatarSize;
    private float rotate;
    private String shape;
    private Integer ordinal;

    @JsonIgnore
    private Object extra;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public int getClipX() {
        return clipX;
    }

    public void setClipX(int clipX) {
        this.clipX = clipX;
    }

    public int getClipY() {
        return clipY;
    }

    public void setClipY(int clipY) {
        this.clipY = clipY;
    }

    public int getClipSize() {
        return clipSize;
    }

    public void setClipSize(int clipSize) {
        this.clipSize = clipSize;
    }

    public int getAvatarSize() {
        return avatarSize;
    }

    public void setAvatarSize(int avatarSize) {
        this.avatarSize = avatarSize;
    }

    public float getRotate() {
        return rotate;
    }

    public void setRotate(float rotate) {
        this.rotate = rotate;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public AvatarAttributes clone() {
        try {
            return (AvatarAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
