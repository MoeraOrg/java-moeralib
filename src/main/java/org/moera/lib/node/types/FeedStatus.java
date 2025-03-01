package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedStatus extends Structure implements Cloneable {

    private int total;
    private int totalPinned;
    private Long lastMoment;
    private Integer notViewed;
    private Integer notRead;
    private Long notViewedMoment;
    private Long notReadMoment;

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

    public Long getLastMoment() {
        return lastMoment;
    }

    public void setLastMoment(Long lastMoment) {
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

    public Long getNotViewedMoment() {
        return notViewedMoment;
    }

    public void setNotViewedMoment(Long notViewedMoment) {
        this.notViewedMoment = notViewedMoment;
    }

    public Long getNotReadMoment() {
        return notReadMoment;
    }

    public void setNotReadMoment(Long notReadMoment) {
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
