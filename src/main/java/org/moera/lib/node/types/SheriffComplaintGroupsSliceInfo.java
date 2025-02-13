package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintGroupsSliceInfo implements Cloneable {

    private long before;
    private long after;
    private List<SheriffComplaintGroupInfo> groups;
    private int total;
    private int totalInPast;
    private int totalInFuture;

    public long getBefore() {
        return before;
    }

    public void setBefore(long before) {
        this.before = before;
    }

    public long getAfter() {
        return after;
    }

    public void setAfter(long after) {
        this.after = after;
    }

    public List<SheriffComplaintGroupInfo> getGroups() {
        return groups;
    }

    public void setGroups(List<SheriffComplaintGroupInfo> groups) {
        this.groups = groups;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalInPast() {
        return totalInPast;
    }

    public void setTotalInPast(int totalInPast) {
        this.totalInPast = totalInPast;
    }

    public int getTotalInFuture() {
        return totalInFuture;
    }

    public void setTotalInFuture(int totalInFuture) {
        this.totalInFuture = totalInFuture;
    }

    @Override
    public SheriffComplaintGroupsSliceInfo clone() {
        try {
            return (SheriffComplaintGroupsSliceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
