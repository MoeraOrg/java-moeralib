package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedStatus implements Cloneable {

    private int total;
    private int totalPinned;
    private Integer lastMoment;
    private Integer notViewed;
    private Integer notRead;
    private Integer notViewedMoment;
    private Integer notReadMoment;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPinned() {
        return totalPinned;
    }

    public void setTotalPinned(int totalPinned) {
        this.totalPinned = totalPinned;
    }

    public Integer getLastMoment() {
        return lastMoment;
    }

    public void setLastMoment(Integer lastMoment) {
        this.lastMoment = lastMoment;
    }

    public Integer getNotViewed() {
        return notViewed;
    }

    public void setNotViewed(Integer notViewed) {
        this.notViewed = notViewed;
    }

    public Integer getNotRead() {
        return notRead;
    }

    public void setNotRead(Integer notRead) {
        this.notRead = notRead;
    }

    public Integer getNotViewedMoment() {
        return notViewedMoment;
    }

    public void setNotViewedMoment(Integer notViewedMoment) {
        this.notViewedMoment = notViewedMoment;
    }

    public Integer getNotReadMoment() {
        return notReadMoment;
    }

    public void setNotReadMoment(Integer notReadMoment) {
        this.notReadMoment = notReadMoment;
    }

    @Override
    public FeedStatus clone() {
        try {
            return (FeedStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
