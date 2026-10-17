package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryAttributes extends Structure implements Cloneable {

    private String feedName;
    private Long publishAt;
    private Boolean pinned;
    private Boolean viewed;
    private Boolean read;
    private Boolean satisfied;
    private List<String> externalSourceUri;

    /**
     * Retrieves name of the feed.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves story publication timestamp - the time the story must be published under in the feed.
     *
     * @return the value
     */
    public Long getPublishAt() {
        return publishAt;
    }

    /**
     * Sets story publication timestamp - the time the story must be published under in the feed.
     *
     * @param publishAt the value to be set
     */
    public void setPublishAt(Long publishAt) {
        this.publishAt = publishAt;
    }

    /**
     * Retrieves <code>true</code>, if the story is pinned (should appear before any non-pinned story in the feed),
     * <code>false</code> otherwise
     * .
     *
     * @return the value
     */
    public Boolean getPinned() {
        return pinned;
    }

    /**
     * Sets <code>true</code>, if the story is pinned (should appear before any non-pinned story in the feed),
     * <code>false</code> otherwise
     * .
     *
     * @param pinned the value to be set
     */
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * Retrieves value of the <code>viewed</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @return the value
     */
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * Sets value of the <code>viewed</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @param viewed the value to be set
     */
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * Retrieves value of the <code>read</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @return the value
     */
    public Boolean getRead() {
        return read;
    }

    /**
     * Sets value of the <code>read</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @param read the value to be set
     */
    public void setRead(Boolean read) {
        this.read = read;
    }

    /**
     * Retrieves value of the <code>satisfied</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @return the value
     */
    public Boolean getSatisfied() {
        return satisfied;
    }

    /**
     * Sets value of the <code>satisfied</code> flag (<code>null</code>, if the flag is not changed).
     *
     * @param satisfied the value to be set
     */
    public void setSatisfied(Boolean satisfied) {
        this.satisfied = satisfied;
    }

    /**
     * Retrieves URIs of the external sources the story was received from; used by software that automatically forwards
     * stories from other social networks
     * .
     *
     * @return the value
     */
    public List<String> getExternalSourceUri() {
        return externalSourceUri;
    }

    /**
     * Sets URIs of the external sources the story was received from; used by software that automatically forwards
     * stories from other social networks
     * .
     *
     * @param externalSourceUri the value to be set
     */
    public void setExternalSourceUri(List<String> externalSourceUri) {
        this.externalSourceUri = externalSourceUri;
    }

    @Override
    public void validate() {
        super.validate();
        if (externalSourceUri != null) {
            externalSourceUri.forEach(value ->
                ValidationUtil.maxSize(value, 1024, "story.external-source-uri.wrong-size")
            );
        }
    }

    /**
     * Creates and returns a copy of this {@code StoryAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StoryAttributes clone() {
        try {
            return (StoryAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
