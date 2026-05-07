package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaFilePreviewInfo extends Structure implements Cloneable {

    private int targetWidth;
    private String hash;
    private String path;
    private String directPath;
    private Long directPathExpiresAt;
    private String mimeType;
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
     * Retrieves SHA-1 hash of the preview.
     *
     * @return the value
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets SHA-1 hash of the preview.
     *
     * @param hash the value to be set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Retrieves virtual location of the preview, relative to the <code>/media</code> <a
     * href="virtual-pages.html">virtual page</a>
     * .
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets virtual location of the preview, relative to the <code>/media</code> <a href="virtual-pages.html">virtual
     * page</a>
     * .
     *
     * @param path the value to be set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Retrieves location of the preview, relative to the <code>/media</code>; points to a static image served directly
     * from a filesystem or CDN
     * .
     *
     * @return the value
     */
    public String getDirectPath() {
        return directPath;
    }

    /**
     * Sets location of the preview, relative to the <code>/media</code>; points to a static image served directly from
     * a filesystem or CDN
     * .
     *
     * @param directPath the value to be set
     */
    public void setDirectPath(String directPath) {
        this.directPath = directPath;
    }

    /**
     * Retrieves direct path expiration timestamp - the real time when the direct path will not be valid anymore.
     *
     * @return the value
     */
    public Long getDirectPathExpiresAt() {
        return directPathExpiresAt;
    }

    /**
     * Sets direct path expiration timestamp - the real time when the direct path will not be valid anymore.
     *
     * @param directPathExpiresAt the value to be set
     */
    public void setDirectPathExpiresAt(Long directPathExpiresAt) {
        this.directPathExpiresAt = directPathExpiresAt;
    }

    /**
     * Retrieves MIME type of the preview.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the preview.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
