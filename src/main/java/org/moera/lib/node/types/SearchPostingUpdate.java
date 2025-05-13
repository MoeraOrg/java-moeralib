package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchPostingUpdate extends Structure implements Cloneable {

    private String feedName;
    private String storyId;
    private long publishedAt;
    private String nodeName;
    private String postingId;

    /**
     * Retrieves name of the feed where the posting is published.
     *
     * @return the value
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets name of the feed where the posting is published.
     *
     * @param feedName the value to be set
     */
    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    /**
     * Retrieves ID of the story where the posting is published.
     *
     * @return the value
     */
    public String getStoryId() {
        return storyId;
    }

    /**
     * Sets ID of the story where the posting is published.
     *
     * @param storyId the value to be set
     */
    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    /**
     * Retrieves story publication timestamp - the time the story is published under in the feed.
     *
     * @return the value
     */
    public long getPublishedAt() {
        return publishedAt;
    }

    /**
     * Sets story publication timestamp - the time the story is published under in the feed.
     *
     * @param publishedAt the value to be set
     */
    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Retrieves name of the node where the posting is originated from.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node where the posting is originated from.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves ID of the posting on the original node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the original node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(feedName, 63, "search.feed-name.wrong-size");
        ValidationUtil.maxSize(storyId, 40, "search.story-id.wrong-size");
        ValidationUtil.maxSize(nodeName, 63, "search.node-name.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "search.posting-id.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SearchPostingUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchPostingUpdate clone() {
        try {
            return (SearchPostingUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
