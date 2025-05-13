package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchHashtagFilter extends Structure implements Cloneable {

    private SearchEntryType entryType;
    private List<String> hashtags;
    private String publisherName;
    private Boolean inNewsfeed;
    private List<String> owners;
    private Integer minImageCount;
    private Integer maxImageCount;
    private Boolean videoPresent;
    private String sheriffName;
    private Long after;
    private Long before;
    private Integer limit;

    /**
     * Retrieves type of entries to be searched for; if omitted, all types of entries are returned.
     *
     * @return the value
     */
    public SearchEntryType getEntryType() {
        return entryType;
    }

    /**
     * Sets type of entries to be searched for; if omitted, all types of entries are returned.
     *
     * @param entryType the value to be set
     */
    public void setEntryType(SearchEntryType entryType) {
        this.entryType = entryType;
    }

    /**
     * Retrieves hashtags to be searched for; at least one of these hashtags should be present in the entry returned
     * .
     *
     * @return the value
     */
    public List<String> getHashtags() {
        return hashtags;
    }

    /**
     * Sets hashtags to be searched for; at least one of these hashtags should be present in the entry returned
     * .
     *
     * @param hashtags the value to be set
     */
    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * Retrieves name of the node where the entries are published.
     *
     * @return the value
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets name of the node where the entries are published.
     *
     * @param publisherName the value to be set
     */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    /**
     * Retrieves if <code>true</code>, return the entries appearing in the Newsfeed of the <code>publisherName</code>
     * node
     * .
     *
     * @return the value
     */
    public Boolean getInNewsfeed() {
        return inNewsfeed;
    }

    /**
     * Sets if <code>true</code>, return the entries appearing in the Newsfeed of the <code>publisherName</code> node
     * .
     *
     * @param inNewsfeed the value to be set
     */
    public void setInNewsfeed(Boolean inNewsfeed) {
        this.inNewsfeed = inNewsfeed;
    }

    /**
     * Retrieves return only the entries owned (authored) by one of these nodes.
     *
     * @return the value
     */
    public List<String> getOwners() {
        return owners;
    }

    /**
     * Sets return only the entries owned (authored) by one of these nodes.
     *
     * @param owners the value to be set
     */
    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    /**
     * Retrieves return only the entries containing at least the given number of images.
     *
     * @return the value
     */
    public Integer getMinImageCount() {
        return minImageCount;
    }

    /**
     * Sets return only the entries containing at least the given number of images.
     *
     * @param minImageCount the value to be set
     */
    public void setMinImageCount(Integer minImageCount) {
        this.minImageCount = minImageCount;
    }

    /**
     * Retrieves return only the entries containing not more than the given number of images.
     *
     * @return the value
     */
    public Integer getMaxImageCount() {
        return maxImageCount;
    }

    /**
     * Sets return only the entries containing not more than the given number of images.
     *
     * @param maxImageCount the value to be set
     */
    public void setMaxImageCount(Integer maxImageCount) {
        this.maxImageCount = maxImageCount;
    }

    /**
     * Retrieves if <code>true</code>, return only the entries containing a video, if <code>false</code>, return only
     * the entries that do not contain a video
     * .
     *
     * @return the value
     */
    public Boolean getVideoPresent() {
        return videoPresent;
    }

    /**
     * Sets if <code>true</code>, return only the entries containing a video, if <code>false</code>, return only the
     * entries that do not contain a video
     * .
     *
     * @param videoPresent the value to be set
     */
    public void setVideoPresent(Boolean videoPresent) {
        this.videoPresent = videoPresent;
    }

    /**
     * Retrieves filter out entries prohibited by the given sheriff.
     *
     * @return the value
     */
    public String getSheriffName() {
        return sheriffName;
    }

    /**
     * Sets filter out entries prohibited by the given sheriff.
     *
     * @param sheriffName the value to be set
     */
    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    /**
     * Retrieves return entries created strongly after this moment.
     *
     * @return the value
     */
    public Long getAfter() {
        return after;
    }

    /**
     * Sets return entries created strongly after this moment.
     *
     * @param after the value to be set
     */
    public void setAfter(Long after) {
        this.after = after;
    }

    /**
     * Retrieves return entries created at or before this moment.
     *
     * @return the value
     */
    public Long getBefore() {
        return before;
    }

    /**
     * Sets return entries created at or before this moment.
     *
     * @param before the value to be set
     */
    public void setBefore(Long before) {
        this.before = before;
    }

    /**
     * Retrieves maximum number of entries returned.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets maximum number of entries returned.
     *
     * @param limit the value to be set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(hashtags, "search.hashtags.missing");
        ValidationUtil.minItems(hashtags, 1, "search.hashtags.missing");
        ValidationUtil.maxItems(hashtags, 16, "search.hashtags.too-many");
        ValidationUtil.maxItems(owners, 16, "search.owners.too-many");
        ValidationUtil.minValue(minImageCount, 0, "search.min-image-count.invalid");
        ValidationUtil.minValue(maxImageCount, 0, "search.max-image-count.invalid");
        ValidationUtil.minValue(limit, 0, "limit.invalid");
    }

    /**
     * Creates and returns a copy of this {@code SearchHashtagFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchHashtagFilter clone() {
        try {
            return (SearchHashtagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
