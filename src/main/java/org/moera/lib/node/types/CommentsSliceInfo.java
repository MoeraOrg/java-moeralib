package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentsSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private List<CommentInfo> comments;
    private int total;
    private int totalInPast;
    private int totalInFuture;

    /**
     * Retrieves the slice contains all comments before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all comments before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all comments after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all comments after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves the comments.
     *
     * @return the value
     */
    public List<CommentInfo> getComments() {
        return comments;
    }

    /**
     * Sets the comments.
     *
     * @param comments the value to be set
     */
    public void setComments(List<CommentInfo> comments) {
        this.comments = comments;
    }

    /**
     * Retrieves total number of comments.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of comments.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves number of comments before this slice till the far past.
     *
     * @return the value
     */
    public int getTotalInPast() {
        return totalInPast;
    }

    /**
     * Sets number of comments before this slice till the far past.
     *
     * @param totalInPast the value to be set
     */
    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    /**
     * Retrieves number of comments after this slice till the far future.
     *
     * @return the value
     */
    public int getTotalInFuture() {
        return totalInFuture;
    }

    /**
     * Sets number of comments after this slice till the far future.
     *
     * @param totalInFuture the value to be set
     */
    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    @Override
    public void validate() {
        super.validate();
        if (comments != null) {
            comments.forEach(CommentInfo::validate);
        }
    }

    /**
     * Creates and returns a copy of this {@code CommentsSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public CommentsSliceInfo clone() {
        try {
            return (CommentsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
