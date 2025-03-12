package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintGroupsSliceInfo extends Structure implements Cloneable {

    private long before;
    private long after;
    private List<SheriffComplaintGroupInfo> groups;
    private int total;
    private int totalInPast;
    private int totalInFuture;

    /**
     * Retrieves the slice contains all groups before this moment, inclusive. May be the far future.
     *
     * @return the value
     */
    public long getBefore() {
        return before;
    }

    /**
     * Sets the slice contains all groups before this moment, inclusive. May be the far future.
     *
     * @param before the value to be set
     */
    public void setBefore(long before) {
        this.before = before;
    }

    /**
     * Retrieves the slice contains all groups after this moment, exclusive. May be the far past.
     *
     * @return the value
     */
    public long getAfter() {
        return after;
    }

    /**
     * Sets the slice contains all groups after this moment, exclusive. May be the far past.
     *
     * @param after the value to be set
     */
    public void setAfter(long after) {
        this.after = after;
    }

    /**
     * Retrieves the groups.
     *
     * @return the value
     */
    public List<SheriffComplaintGroupInfo> getGroups() {
        return groups;
    }

    /**
     * Sets the groups.
     *
     * @param groups the value to be set
     */
    public void setGroups(List<SheriffComplaintGroupInfo> groups) {
        this.groups = groups;
    }

    /**
     * Retrieves total number of groups.
     *
     * @return the value
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total number of groups.
     *
     * @param total the value to be set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Retrieves number of groups before this slice till the far past.
     *
     * @return the value
     */
    public int getTotalInPast() {
        return totalInPast;
    }

    /**
     * Sets number of groups before this slice till the far past.
     *
     * @param totalInPast the value to be set
     */
    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    /**
     * Retrieves number of groups after this slice till the far future.
     *
     * @return the value
     */
    public int getTotalInFuture() {
        return totalInFuture;
    }

    /**
     * Sets number of groups after this slice till the far future.
     *
     * @param totalInFuture the value to be set
     */
    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    /**
     * Creates and returns a copy of this {@code SheriffComplaintGroupsSliceInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffComplaintGroupsSliceInfo clone() {
        try {
            return (SheriffComplaintGroupsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
