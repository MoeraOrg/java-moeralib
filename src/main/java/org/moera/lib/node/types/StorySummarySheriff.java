package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummarySheriff extends Structure implements Cloneable {

    private String sheriffName;
    private String orderId;
    private String complaintId;

    /**
     * Retrieves name of the sheriff.
     *
     * @return the value
     */
    public String getSheriffName() {
        return sheriffName;
    }

    /**
     * Sets name of the sheriff.
     *
     * @param sheriffName the value to be set
     */
    public void setSheriffName(String sheriffName) {
        this.sheriffName = sheriffName;
    }

    /**
     * Retrieves ID of the sheriff's order.
     *
     * @return the value
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets ID of the sheriff's order.
     *
     * @param orderId the value to be set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Retrieves ID of the complaint, if any.
     *
     * @return the value
     */
    public String getComplaintId() {
        return complaintId;
    }

    /**
     * Sets ID of the complaint, if any.
     *
     * @param complaintId the value to be set
     */
    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    /**
     * Creates and returns a copy of this {@code StorySummarySheriff} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummarySheriff clone() {
        try {
            return (StorySummarySheriff) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
