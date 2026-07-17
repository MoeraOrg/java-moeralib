package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaUploadAttributes extends Structure implements Cloneable {

    private String mimeType;
    private String title;
    private int fileSize;
    private Integer chunkSize;

    /**
     * Retrieves MIME type of the media source file.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets MIME type of the media source file.
     *
     * @param mimeType the value to be set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
     * Retrieves full file size in bytes.
     *
     * @return the value
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets full file size in bytes.
     *
     * @param fileSize the value to be set
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * Retrieves client-proposed chunk size in bytes.
     *
     * @return the value
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets client-proposed chunk size in bytes.
     *
     * @param chunkSize the value to be set
     */
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(mimeType, "media.mime-type.blank");
        ValidationUtil.maxSize(title, 255, "media.title.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code MediaUploadAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public MediaUploadAttributes clone() {
        try {
            return (MediaUploadAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
