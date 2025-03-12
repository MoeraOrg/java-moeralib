package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarInfo extends Structure implements Cloneable {

    private String id;
    private String mediaId;
    private String path;
    private Integer width;
    private Integer height;
    private String shape;
    private int ordinal;

    /**
     * Retrieves ID of the avatar.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the avatar.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves ID of the media file.
     *
     * @return the value
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * Sets ID of the media file.
     *
     * @param mediaId the value to be set
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Retrieves virtual location of the media file, relative to the <code>/media</code> <a
     * href="virtual-pages.html">virtual page</a>
     * .
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets virtual location of the media file, relative to the <code>/media</code> <a
     * href="virtual-pages.html">virtual page</a>
     * .
     *
     * @param path the value to be set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Retrieves width of the media in pixels (<code>null</code>, if the media file is not an image/video).
     *
     * @return the value
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets width of the media in pixels (<code>null</code>, if the media file is not an image/video).
     *
     * @param width the value to be set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Retrieves height of the media in pixels (<code>null</code>, if the media file is not an image/video).
     *
     * @return the value
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets height of the media in pixels (<code>null</code>, if the media file is not an image/video).
     *
     * @param height the value to be set
     */
    public void setHeight(Integer height) {
        this.height = height;
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
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets ordinal of the avatar.
     *
     * @param ordinal the value to be set
     */
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * Creates and returns a copy of this {@code AvatarInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarInfo clone() {
        try {
            return (AvatarInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
