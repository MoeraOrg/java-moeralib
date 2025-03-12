package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublicMediaFileInfo extends Structure implements Cloneable {

    private String id;
    private String path;
    private Integer width;
    private Integer height;
    private Short orientation;
    private long size;

    /**
     * Retrieves ID of the media file.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the media file.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
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
     * Retrieves width of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @return the value
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets width of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @param width the value to be set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Retrieves height of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @return the value
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets height of the media in pixels (<code>null</code>, if the media file is not an image or video).
     *
     * @param height the value to be set
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Retrieves media orientation, the value should be interpreted like <a
     * href="https://jdhao.github.io/2019/07/31/image_rotation_exif_info/">the orientation value present in JPEG EXIF
     * data</a> (<code>null</code>, if the media file is not an image or video)
     * .
     *
     * @return the value
     */
    public Short getOrientation() {
        return orientation;
    }

    /**
     * Sets media orientation, the value should be interpreted like <a
     * href="https://jdhao.github.io/2019/07/31/image_rotation_exif_info/">the orientation value present in JPEG EXIF
     * data</a> (<code>null</code>, if the media file is not an image or video)
     * .
     *
     * @param orientation the value to be set
     */
    public void setOrientation(Short orientation) {
        this.orientation = orientation;
    }

    /**
     * Retrieves size of the media file in bytes.
     *
     * @return the value
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets size of the media file in bytes.
     *
     * @param size the value to be set
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * Creates and returns a copy of this {@code PublicMediaFileInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PublicMediaFileInfo clone() {
        try {
            return (PublicMediaFileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
