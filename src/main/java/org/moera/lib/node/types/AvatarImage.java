package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvatarImage extends Structure implements Cloneable {

    private String mediaId;
    private String path;
    private Integer width;
    private Integer height;
    private String shape;

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
     * Creates and returns a copy of this {@code AvatarImage} object.
     *
     * @return a clone of this instance
     */
    @Override
    public AvatarImage clone() {
        try {
            return (AvatarImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
