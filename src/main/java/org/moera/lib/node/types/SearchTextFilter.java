package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchTextFilter extends Structure implements Cloneable {

    private SearchEntryType entryType;
    private String text;
    private List<String> hashtags;
    private String publisherName;
    private Boolean inNewsfeed;
    private List<String> owners;
    private List<String> repliedTo;
    private Integer minImageCount;
    private Integer maxImageCount;
    private Boolean videoPresent;
    private Long createdAfter;
    private Long createdBefore;
    private String sheriffName;
    private Integer page;
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
     * Retrieves the text to be searched for.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text to be searched for.
     *
     * @param text the value to be set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Retrieves at least one of these hashtags should be present in the entry returned.
     *
     * @return the value
     */
    public List<String> getHashtags() {
        return hashtags;
    }

    /**
     * Sets at least one of these hashtags should be present in the entry returned.
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
     * Retrieves return only the comments that are replies to comments owned (authored) by one of these nodes.
     *
     * @return the value
     */
    public List<String> getRepliedTo() {
        return repliedTo;
    }

    /**
     * Sets return only the comments that are replies to comments owned (authored) by one of these nodes.
     *
     * @param repliedTo the value to be set
     */
    public void setRepliedTo(List<String> repliedTo) {
        this.repliedTo = repliedTo;
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
     * Retrieves return entries created at or after this timestamp.
     *
     * @return the value
     */
    public Long getCreatedAfter() {
        return createdAfter;
    }

    /**
     * Sets return entries created at or after this timestamp.
     *
     * @param createdAfter the value to be set
     */
    public void setCreatedAfter(Long createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * Retrieves return entries created at or before this timestamp.
     *
     * @return the value
     */
    public Long getCreatedBefore() {
        return createdBefore;
    }

    /**
     * Sets return entries created at or before this timestamp.
     *
     * @param createdBefore the value to be set
     */
    public void setCreatedBefore(Long createdBefore) {
        this.createdBefore = createdBefore;
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
     * Retrieves page number, 0 by default.
     *
     * @return the value
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page number, 0 by default.
     *
     * @param page the value to be set
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Retrieves page size (maximum number of entries returned), the default is set by the search engine.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets page size (maximum number of entries returned), the default is set by the search engine.
     *
     * @param limit the value to be set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(text, "search.text.blank");
        ValidationUtil.maxItems(hashtags, 16, "search.hashtags.too-many");
        ValidationUtil.maxItems(owners, 16, "search.owners.too-many");
        ValidationUtil.maxItems(repliedTo, 16, "search.replied-to.too-many");
        ValidationUtil.minValue(minImageCount, 0, "search.min-image-count.invalid");
        ValidationUtil.minValue(maxImageCount, 0, "search.max-image-count.invalid");
        ValidationUtil.minValue(page, 0, "page.invalid");
        ValidationUtil.minValue(limit, 0, "limit.invalid");
    }

    /**
     * Creates and returns a copy of this {@code SearchTextFilter} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchTextFilter clone() {
        try {
            return (SearchTextFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
