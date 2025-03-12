package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintGroupInfo extends Structure implements Cloneable {

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

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets .
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves name of the node the complaints are related to.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the node the complaints are related to.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves full name of the node the complaints are related to.
     *
     * @return the value
     */
    public String getRemoteNodeFullName() {
        return remoteNodeFullName;
    }

    /**
     * Sets full name of the node the complaints are related to.
     *
     * @param remoteNodeFullName the value to be set
     */
    public void setRemoteNodeFullName(String remoteNodeFullName) {
        this.remoteNodeFullName = remoteNodeFullName;
    }

    /**
     * Retrieves name of the feed the complaints are related to.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed the complaints are related to.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves ID of the posting the complaints are related to.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets ID of the posting the complaints are related to.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    /**
     * Retrieves ID of the posting's revision the complaints are related to.
     *
     * @return the value
     */
    public String getRemotePostingRevisionId() {
        return remotePostingRevisionId;
    }

    /**
     * Sets ID of the posting's revision the complaints are related to.
     *
     * @param remotePostingRevisionId the value to be set
     */
    public void setRemotePostingRevisionId(String remotePostingRevisionId) {
        this.remotePostingRevisionId = remotePostingRevisionId;
    }

    /**
     * Retrieves posting owner's node name.
     *
     * @return the value
     */
    public String getRemotePostingOwnerName() {
        return remotePostingOwnerName;
    }

    /**
     * Sets posting owner's node name.
     *
     * @param remotePostingOwnerName the value to be set
     */
    public void setRemotePostingOwnerName(String remotePostingOwnerName) {
        this.remotePostingOwnerName = remotePostingOwnerName;
    }

    /**
     * Retrieves posting owner's full name.
     *
     * @return the value
     */
    public String getRemotePostingOwnerFullName() {
        return remotePostingOwnerFullName;
    }

    /**
     * Sets posting owner's full name.
     *
     * @param remotePostingOwnerFullName the value to be set
     */
    public void setRemotePostingOwnerFullName(String remotePostingOwnerFullName) {
        this.remotePostingOwnerFullName = remotePostingOwnerFullName;
    }

    /**
     * Retrieves posting owner's gender.
     *
     * @return the value
     */
    public String getRemotePostingOwnerGender() {
        return remotePostingOwnerGender;
    }

    /**
     * Sets posting owner's gender.
     *
     * @param remotePostingOwnerGender the value to be set
     */
    public void setRemotePostingOwnerGender(String remotePostingOwnerGender) {
        this.remotePostingOwnerGender = remotePostingOwnerGender;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getRemotePostingHeading() {
        return remotePostingHeading;
    }

    /**
     * Sets heading of the posting.
     *
     * @param remotePostingHeading the value to be set
     */
    public void setRemotePostingHeading(String remotePostingHeading) {
        this.remotePostingHeading = remotePostingHeading;
    }

    /**
     * Retrieves ID of the comment the complaints are related to.
     *
     * @return the value
     */
    public String getRemoteCommentId() {
        return remoteCommentId;
    }

    /**
     * Sets ID of the comment the complaints are related to.
     *
     * @param remoteCommentId the value to be set
     */
    public void setRemoteCommentId(String remoteCommentId) {
        this.remoteCommentId = remoteCommentId;
    }

    /**
     * Retrieves ID of the comment's revision the complaints are related to.
     *
     * @return the value
     */
    public String getRemoteCommentRevisionId() {
        return remoteCommentRevisionId;
    }

    /**
     * Sets ID of the comment's revision the complaints are related to.
     *
     * @param remoteCommentRevisionId the value to be set
     */
    public void setRemoteCommentRevisionId(String remoteCommentRevisionId) {
        this.remoteCommentRevisionId = remoteCommentRevisionId;
    }

    /**
     * Retrieves comment owner's node name.
     *
     * @return the value
     */
    public String getRemoteCommentOwnerName() {
        return remoteCommentOwnerName;
    }

    /**
     * Sets comment owner's node name.
     *
     * @param remoteCommentOwnerName the value to be set
     */
    public void setRemoteCommentOwnerName(String remoteCommentOwnerName) {
        this.remoteCommentOwnerName = remoteCommentOwnerName;
    }

    /**
     * Retrieves comment owner's full name.
     *
     * @return the value
     */
    public String getRemoteCommentOwnerFullName() {
        return remoteCommentOwnerFullName;
    }

    /**
     * Sets comment owner's full name.
     *
     * @param remoteCommentOwnerFullName the value to be set
     */
    public void setRemoteCommentOwnerFullName(String remoteCommentOwnerFullName) {
        this.remoteCommentOwnerFullName = remoteCommentOwnerFullName;
    }

    /**
     * Retrieves comment owner's gender.
     *
     * @return the value
     */
    public String getRemoteCommentOwnerGender() {
        return remoteCommentOwnerGender;
    }

    /**
     * Sets comment owner's gender.
     *
     * @param remoteCommentOwnerGender the value to be set
     */
    public void setRemoteCommentOwnerGender(String remoteCommentOwnerGender) {
        this.remoteCommentOwnerGender = remoteCommentOwnerGender;
    }

    /**
     * Retrieves heading of the comment.
     *
     * @return the value
     */
    public String getRemoteCommentHeading() {
        return remoteCommentHeading;
    }

    /**
     * Sets heading of the comment.
     *
     * @param remoteCommentHeading the value to be set
     */
    public void setRemoteCommentHeading(String remoteCommentHeading) {
        this.remoteCommentHeading = remoteCommentHeading;
    }

    /**
     * Retrieves the group of complaints creation timestamp - the real time when the group was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the group of complaints creation timestamp - the real time when the group was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves moment of the group of complaints.
     *
     * @return the value
     */
    public long getMoment() {
        return moment;
    }

    /**
     * Sets moment of the group of complaints.
     *
     * @param moment the value to be set
     */
    public void setMoment(long moment) {
        this.moment = moment;
    }

    /**
     * Retrieves status of the group of complaints.
     *
     * @return the value
     */
    public SheriffComplaintStatus getStatus() {
        return status;
    }

    /**
     * Sets status of the group of complaints.
     *
     * @param status the value to be set
     */
    public void setStatus(SheriffComplaintStatus status) {
        this.status = status;
    }

    /**
     * Retrieves sheriff's decision.
     *
     * @return the value
     */
    public SheriffOrderReason getDecisionCode() {
        return decisionCode;
    }

    /**
     * Sets sheriff's decision.
     *
     * @param decisionCode the value to be set
     */
    public void setDecisionCode(SheriffOrderReason decisionCode) {
        this.decisionCode = decisionCode;
    }

    /**
     * Retrieves detailed explanation of sheriff's decision in user-readable form.
     *
     * @return the value
     */
    public String getDecisionDetails() {
        return decisionDetails;
    }

    /**
     * Sets detailed explanation of sheriff's decision in user-readable form.
     *
     * @param decisionDetails the value to be set
     */
    public void setDecisionDetails(String decisionDetails) {
        this.decisionDetails = decisionDetails;
    }

    /**
     * Retrieves sheriff's decision timestamp - the real time when the decision was made.
     *
     * @return the value
     */
    public Long getDecidedAt() {
        return decidedAt;
    }

    /**
     * Sets sheriff's decision timestamp - the real time when the decision was made.
     *
     * @param decidedAt the value to be set
     */
    public void setDecidedAt(Long decidedAt) {
        this.decidedAt = decidedAt;
    }

    /**
     * Retrieves <code>true</code>, if the complaints' owners' names are not published, <code>false</code> otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAnonymous() {
        return anonymous;
    }

    /**
     * Sets <code>true</code>, if the complaints' owners' names are not published, <code>false</code> otherwise
     * .
     *
     * @param anonymous the value to be set
     */
    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    /**
     * Creates and returns a copy of this {@code SheriffComplaintGroupInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffComplaintGroupInfo clone() {
        try {
            return (SheriffComplaintGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
