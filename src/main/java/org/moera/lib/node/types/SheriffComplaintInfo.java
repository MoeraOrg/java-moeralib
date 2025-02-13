package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintInfo implements Cloneable {

    private String id;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private SheriffComplaintGroupInfo group;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;
    private Boolean anonymousRequested;
    private long createdAt;

    @JsonIgnore
    private Object extra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    public SheriffComplaintGroupInfo getGroup() {
        return group;
    }

    public void setGroup(SheriffComplaintGroupInfo group) {
        this.group = group;
    }

    public SheriffOrderReason getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(SheriffOrderReason reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDetails() {
        return reasonDetails;
    }

    public void setReasonDetails(String reasonDetails) {
        this.reasonDetails = reasonDetails;
    }

    public Boolean getAnonymousRequested() {
        return anonymousRequested;
    }

    public void setAnonymousRequested(Boolean anonymousRequested) {
        this.anonymousRequested = anonymousRequested;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public SheriffComplaintInfo clone() {
        try {
            return (SheriffComplaintInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
