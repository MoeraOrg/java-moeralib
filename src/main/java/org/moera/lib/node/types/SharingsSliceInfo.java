package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharingsSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private int total;
    private List<SharingInfo> sharings;

    /**
     * Retrieves the slice contains all sharings before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all sharings before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all sharings after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all sharings after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves total number of sharings in the whole list; zero when viewing the counter is not permitted.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of sharings in the whole list; zero when viewing the counter is not permitted.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves the sharings.
     *
     * @return the value
     */
    public List<SharingInfo> getSharings() {
        return sharings;
    }

    /**
     * Sets the sharings.
     *
     * @param sharings the value to be set
     */
    public void setSharings(List<SharingInfo> sharings) {
        this.sharings = sharings;
    }

    /**
     * Creates and returns a copy of this {@code SharingsSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SharingsSliceInfo clone() {
        try {
            return (SharingsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
