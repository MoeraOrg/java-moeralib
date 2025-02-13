package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintGroupInfo implements Cloneable {

    private String id;
    private String remoteNodeName;
    private String remoteNodeFullName;
    private String remoteFeedName;
    private String remotePostingId;
    private String remotePostingRevisionId;
    private String remotePostingOwnerName;
    private String remotePostingOwnerFullName;
    private String remotePostingOwnerGender;
    private String remotePostingHeading;
    private String remoteCommentId;
    private String remoteCommentRevisionId;
    private String remoteCommentOwnerName;
    private String remoteCommentOwnerFullName;
    private String remoteCommentOwnerGender;
    private String remoteCommentHeading;
    private long createdAt;
    private long moment;
    private SheriffComplaintStatus status;
    private SheriffOrderReason decisionCode;
    private String decisionDetails;
    private Long decidedAt;
    private Boolean anonymous;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public String getRemoteNodeFullName() {
        return remoteNodeFullName;
    }

    public void setRemoteNodeFullName(String remoteNodeFullName) {
        this.remoteNodeFullName = remoteNodeFullName;
    }

    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    public String getRemotePostingId() {
        return remotePostingId;
    }

    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    public String getRemotePostingRevisionId() {
        return remotePostingRevisionId;
    }

    public void setRemotePostingRevisionId(String remotePostingRevisionId) {
        this.remotePostingRevisionId = remotePostingRevisionId;
    }

    public String getRemotePostingOwnerName() {
        return remotePostingOwnerName;
    }

    public void setRemotePostingOwnerName(String remotePostingOwnerName) {
        this.remotePostingOwnerName = remotePostingOwnerName;
    }

    public String getRemotePostingOwnerFullName() {
        return remotePostingOwnerFullName;
    }

    public void setRemotePostingOwnerFullName(String remotePostingOwnerFullName) {
        this.remotePostingOwnerFullName = remotePostingOwnerFullName;
    }

    public String getRemotePostingOwnerGender() {
        return remotePostingOwnerGender;
    }

    public void setRemotePostingOwnerGender(String remotePostingOwnerGender) {
        this.remotePostingOwnerGender = remotePostingOwnerGender;
    }

    public String getRemotePostingHeading() {
        return remotePostingHeading;
    }

    public void setRemotePostingHeading(String remotePostingHeading) {
        this.remotePostingHeading = remotePostingHeading;
    }

    public String getRemoteCommentId() {
        return remoteCommentId;
    }

    public void setRemoteCommentId(String remoteCommentId) {
        this.remoteCommentId = remoteCommentId;
    }

    public String getRemoteCommentRevisionId() {
        return remoteCommentRevisionId;
    }

    public void setRemoteCommentRevisionId(String remoteCommentRevisionId) {
        this.remoteCommentRevisionId = remoteCommentRevisionId;
    }

    public String getRemoteCommentOwnerName() {
        return remoteCommentOwnerName;
    }

    public void setRemoteCommentOwnerName(String remoteCommentOwnerName) {
        this.remoteCommentOwnerName = remoteCommentOwnerName;
    }

    public String getRemoteCommentOwnerFullName() {
        return remoteCommentOwnerFullName;
    }

    public void setRemoteCommentOwnerFullName(String remoteCommentOwnerFullName) {
        this.remoteCommentOwnerFullName = remoteCommentOwnerFullName;
    }

    public String getRemoteCommentOwnerGender() {
        return remoteCommentOwnerGender;
    }

    public void setRemoteCommentOwnerGender(String remoteCommentOwnerGender) {
        this.remoteCommentOwnerGender = remoteCommentOwnerGender;
    }

    public String getRemoteCommentHeading() {
        return remoteCommentHeading;
    }

    public void setRemoteCommentHeading(String remoteCommentHeading) {
        this.remoteCommentHeading = remoteCommentHeading;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getMoment() {
        return moment;
    }

    public void setMoment(long moment) {
        this.moment = moment;
    }

    public SheriffComplaintStatus getStatus() {
        return status;
    }

    public void setStatus(SheriffComplaintStatus status) {
        this.status = status;
    }

    public SheriffOrderReason getDecisionCode() {
        return decisionCode;
    }

    public void setDecisionCode(SheriffOrderReason decisionCode) {
        this.decisionCode = decisionCode;
    }

    public String getDecisionDetails() {
        return decisionDetails;
    }

    public void setDecisionDetails(String decisionDetails) {
        this.decisionDetails = decisionDetails;
    }

    public Long getDecidedAt() {
        return decidedAt;
    }

    public void setDecidedAt(Long decidedAt) {
        this.decidedAt = decidedAt;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public SheriffComplaintGroupInfo clone() {
        try {
            return (SheriffComplaintGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
