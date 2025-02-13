package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingFeatures implements Cloneable {

    private Boolean post;
    private boolean subjectPresent;
    private List<SourceFormat> sourceFormats;
    private int mediaMaxSize;
    private int imageRecommendedSize;
    private int imageRecommendedPixels;
    private List<String> imageFormats;

    public Boolean getPost() {
        return post;
    }

    public void setPost(Boolean post) {
        this.post = post;
    }

    public boolean getSubjectPresent() {
        return subjectPresent;
    }

    public void setSubjectPresent(boolean subjectPresent) {
        this.subjectPresent = subjectPresent;
    }

    public List<SourceFormat> getSourceFormats() {
        return sourceFormats;
    }

    public void setSourceFormats(List<SourceFormat> sourceFormats) {
        this.sourceFormats = sourceFormats;
    }

    public int getMediaMaxSize() {
        return mediaMaxSize;
    }

    public void setMediaMaxSize(int mediaMaxSize) {
        this.mediaMaxSize = mediaMaxSize;
    }

    public int getImageRecommendedSize() {
        return imageRecommendedSize;
    }

    public void setImageRecommendedSize(int imageRecommendedSize) {
        this.imageRecommendedSize = imageRecommendedSize;
    }

    public int getImageRecommendedPixels() {
        return imageRecommendedPixels;
    }

    public void setImageRecommendedPixels(int imageRecommendedPixels) {
        this.imageRecommendedPixels = imageRecommendedPixels;
    }

    public List<String> getImageFormats() {
        return imageFormats;
    }

    public void setImageFormats(List<String> imageFormats) {
        this.imageFormats = imageFormats;
    }

    @Override
    public PostingFeatures clone() {
        try {
            return (PostingFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
