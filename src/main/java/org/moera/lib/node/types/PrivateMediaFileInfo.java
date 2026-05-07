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
    private Long directPathExpiresAt;
    private String mimeType;
    private Integer width;
    private Integer height;
    private Short orientation;
    private long size;
    private String title;
    private String textContent;
    private List<MediaFilePreviewInfo> previews;
    private Boolean attachment;
    private Boolean malware;
    private String grant;
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
     * directly from a filesystem or CDN
     * .
     *
     * @return the value
     */
    public String getDirectPath() {
        return directPath;
    }

    /**
     * Sets location of the media file, relative to the <code>/media</code>; points to a static image served directly
     * from a filesystem or CDN
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
     * Retrieves title of the media file, may be used as an alternative to the file name.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of the media file, may be used as an alternative to the file name.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the text contained in the image, if any.
     *
     * @return the value
     */
    public String getTextContent() {
        return textContent;
    }

    /**
     * Sets the text contained in the image, if any.
     *
     * @param textContent the value to be set
     */
    public void setTextContent(String textContent) {
        this.textContent = textContent;
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
     * Retrieves <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAttachment() {
        return attachment;
    }

    /**
     * Sets <code>true</code> if the media cannot be displayed as an image or video and should be displayed as an
     * attachment instead, <code>false</code> (default) otherwise
     * .
     *
     * @param attachment the value to be set
     */
    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    /**
     * Retrieves <code>true</code> if the media file is considered to be malware, <code>false</code> (default)
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getMalware() {
        return malware;
    }

    /**
     * Sets <code>true</code> if the media file is considered to be malware, <code>false</code> (default) otherwise
     * .
     *
     * @param malware the value to be set
     */
    public void setMalware(Boolean malware) {
        this.malware = malware;
    }

    /**
     * Retrieves media grant allowing access to the media.
     *
     * @return the value
     */
    public String getGrant() {
        return grant;
    }

    /**
     * Sets media grant allowing access to the media.
     *
     * @param grant the value to be set
     */
    public void setGrant(String grant) {
        this.grant = grant;
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
