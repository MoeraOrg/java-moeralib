package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintInfo extends Structure implements Cloneable {

    private String id;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private SheriffComplaintGroupInfo group;
    private SheriffOrderReason reasonCode;
    private String reasonDetails;
    private Boolean anonymousRequested;
    private long createdAt;

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
     * Retrieves complaint owner's node name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets complaint owner's node name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves complaint owner's full name.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets complaint owner's full name.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves complaint owner's gender.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets complaint owner's gender.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves the group of complaints this complaint belongs to.
     *
     * @return the value
     */
    public SheriffComplaintGroupInfo getGroup() {
        return group;
    }

    /**
     * Sets the group of complaints this complaint belongs to.
     *
     * @param group the value to be set
     */
    public void setGroup(SheriffComplaintGroupInfo group) {
        this.group = group;
    }

    /**
     * Retrieves reason of the complaint.
     *
     * @return the value
     */
    public SheriffOrderReason getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets reason of the complaint.
     *
     * @param reasonCode the value to be set
     */
    public void setReasonCode(SheriffOrderReason reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Retrieves detailed explanation of reason of the complaint in user-readable form.
     *
     * @return the value
     */
    public String getReasonDetails() {
        return reasonDetails;
    }

    /**
     * Sets detailed explanation of reason of the complaint in user-readable form.
     *
     * @param reasonDetails the value to be set
     */
    public void setReasonDetails(String reasonDetails) {
        this.reasonDetails = reasonDetails;
    }

    /**
     * Retrieves <code>true</code>, if the complaint's owner wants his name not to be published, <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAnonymousRequested() {
        return anonymousRequested;
    }

    /**
     * Sets <code>true</code>, if the complaint's owner wants his name not to be published, <code>false</code>
     * otherwise
     * .
     *
     * @param anonymousRequested the value to be set
     */
    public void setAnonymousRequested(Boolean anonymousRequested) {
        this.anonymousRequested = anonymousRequested;
    }

    /**
     * Retrieves complaint creation timestamp - the real time when the order was created.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets complaint creation timestamp - the real time when the order was created.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Creates and returns a copy of this {@code SheriffComplaintInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffComplaintInfo clone() {
        try {
            return (SheriffComplaintInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
