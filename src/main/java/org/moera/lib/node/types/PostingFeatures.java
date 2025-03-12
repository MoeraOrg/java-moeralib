package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingFeatures extends Structure implements Cloneable {

    private Boolean post;
    private boolean subjectPresent;
    private List<SourceFormat> sourceFormats;
    private int mediaMaxSize;
    private int imageRecommendedSize;
    private int imageRecommendedPixels;
    private List<String> imageFormats;

    /**
     * Retrieves <code>true</code> if the client is allowed to create postings, <code>false</code> otherwise.
     *
     * @return the value
     */
    public Boolean getPost() {
        return post;
    }

    /**
     * Sets <code>true</code> if the client is allowed to create postings, <code>false</code> otherwise.
     *
     * @param post the value to be set
     */
    public void setPost(Boolean post) {
        this.post = post;
    }

    /**
     * Retrieves <code>true</code> if new postings are recommended to have a subject, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isSubjectPresent() {
        return subjectPresent;
    }

    /**
     * Sets <code>true</code> if new postings are recommended to have a subject, <code>false</code> otherwise.
     *
     * @param subjectPresent the value to be set
     */
    public void setSubjectPresent(boolean subjectPresent) {
        this.subjectPresent = subjectPresent;
    }

    /**
     * Retrieves list of source text formats the node understands.
     *
     * @return the value
     */
    public List<SourceFormat> getSourceFormats() {
        return sourceFormats;
    }

    /**
     * Sets list of source text formats the node understands.
     *
     * @param sourceFormats the value to be set
     */
    public void setSourceFormats(List<SourceFormat> sourceFormats) {
        this.sourceFormats = sourceFormats;
    }

    /**
     * Retrieves maximal size of a media attachment in a post.
     *
     * @return the value
     */
    public int getMediaMaxSize() {
        return mediaMaxSize;
    }

    /**
     * Sets maximal size of a media attachment in a post.
     *
     * @param mediaMaxSize the value to be set
     */
    public void setMediaMaxSize(int mediaMaxSize) {
        this.mediaMaxSize = mediaMaxSize;
    }

    /**
     * Retrieves maximal size of a compressed image in a post.
     *
     * @return the value
     */
    public int getImageRecommendedSize() {
        return imageRecommendedSize;
    }

    /**
     * Sets maximal size of a compressed image in a post.
     *
     * @param imageRecommendedSize the value to be set
     */
    public void setImageRecommendedSize(int imageRecommendedSize) {
        this.imageRecommendedSize = imageRecommendedSize;
    }

    /**
     * Retrieves maximal resolution of a compressed image in a post (in pixels).
     *
     * @return the value
     */
    public int getImageRecommendedPixels() {
        return imageRecommendedPixels;
    }

    /**
     * Sets maximal resolution of a compressed image in a post (in pixels).
     *
     * @param imageRecommendedPixels the value to be set
     */
    public void setImageRecommendedPixels(int imageRecommendedPixels) {
        this.imageRecommendedPixels = imageRecommendedPixels;
    }

    /**
     * Retrieves list of image formats (in MIME type form) the node understands.
     *
     * @return the value
     */
    public List<String> getImageFormats() {
        return imageFormats;
    }

    /**
     * Sets list of image formats (in MIME type form) the node understands.
     *
     * @param imageFormats the value to be set
     */
    public void setImageFormats(List<String> imageFormats) {
        this.imageFormats = imageFormats;
    }

    /**
     * Creates and returns a copy of this {@code PostingFeatures} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingFeatures clone() {
        try {
            return (PostingFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
