package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateMediaFileInfo extends Structure implements Cloneable {

    private String id;
    private String hash;
    private String path;
    private String directPath;
    private String mimeType;
    private Integer width;
    private Integer height;
    private Short orientation;
    private long size;
    private String postingId;
    private List<MediaFilePreviewInfo> previews;
    private PrivateMediaFileOperations operations;

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
     * Retrieves SHA-1 hash of the media file.
     *
     * @return the value
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets SHA-1 hash of the media file.
     *
     * @param hash the value to be set
     */
    public void setHash(String hash) {
        this.hash = hash;
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
     * Retrieves MIME type of the media.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the media.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
     * Retrieves ID of the posting linked to the media.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting linked to the media.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves list of media previews - downscaled versions of the media.
     *
     * @return the value
     */
    public List<MediaFilePreviewInfo> getPreviews() {
        return previews;
    }

    /**
     * Sets list of media previews - downscaled versions of the media.
     *
     * @param previews the value to be set
     */
    public void setPreviews(List<MediaFilePreviewInfo> previews) {
        this.previews = previews;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public PrivateMediaFileOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(PrivateMediaFileOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code PrivateMediaFileInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PrivateMediaFileInfo clone() {
        try {
            return (PrivateMediaFileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
