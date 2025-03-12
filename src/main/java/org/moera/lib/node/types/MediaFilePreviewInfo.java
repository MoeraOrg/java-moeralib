package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaFilePreviewInfo extends Structure implements Cloneable {

    private int targetWidth;
    private String directPath;
    private int width;
    private int height;
    private Boolean original;

    /**
     * Retrieves the width the preview was prepared for viewing at.
     *
     * @return the value
     */
    public int getTargetWidth() {
        return targetWidth;
    }

    /**
     * Sets the width the preview was prepared for viewing at.
     *
     * @param targetWidth the value to be set
     */
    public void setTargetWidth(int targetWidth) {
        this.targetWidth = targetWidth;
    }

    /**
     * Retrieves location of the media file, relative to the <code>/media</code>; points to a static image served
     * directly from a filesystem; static images do not accept any query parameters including authentication parameters
     * .
     *
     * @return the value
     */
    public String getDirectPath() {
        return directPath;
    }

    /**
     * Sets location of the media file, relative to the <code>/media</code>; points to a static image served directly
     * from a filesystem; static images do not accept any query parameters including authentication parameters
     * .
     *
     * @param directPath the value to be set
     */
    public void setDirectPath(String directPath) {
        this.directPath = directPath;
    }

    /**
     * Retrieves actual width of the preview in pixels.
     *
     * @return the value
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets actual width of the preview in pixels.
     *
     * @param width the value to be set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Retrieves actual height of the preview in pixels.
     *
     * @return the value
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets actual height of the preview in pixels.
     *
     * @param height the value to be set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Retrieves <code>true</code> if the preview is identical to the original media, <code>false</code> otherwise.
     *
     * @return the value
     */
    public Boolean getOriginal() {
        return original;
    }

    /**
     * Sets <code>true</code> if the preview is identical to the original media, <code>false</code> otherwise.
     *
     * @param original the value to be set
     */
    public void setOriginal(Boolean original) {
        this.original = original;
    }

    /**
     * Creates and returns a copy of this {@code MediaFilePreviewInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaFilePreviewInfo clone() {
        try {
            return (MediaFilePreviewInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
