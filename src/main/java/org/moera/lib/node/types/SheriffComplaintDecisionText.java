package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintDecisionText extends Structure implements Cloneable {

    private boolean reject;
    private SheriffOrderReason decisionCode;
    private String decisionDetails;
    private Boolean anonymous;

    /**
     * Retrieves <code>true</code>, if the complaints in the group are to be rejected, <code>false</code> otherwise.
     *
     * @return the value
     */
    public boolean isReject() {
        return reject;
    }

    /**
     * Sets <code>true</code>, if the complaints in the group are to be rejected, <code>false</code> otherwise.
     *
     * @param reject the value to be set
     */
    public void setReject(boolean reject) {
        this.reject = reject;
    }

    /**
     * Retrieves the decision.
     *
     * @return the value
     */
    public SheriffOrderReason getDecisionCode() {
        return decisionCode;
    }

    /**
     * Sets the decision.
     *
     * @param decisionCode the value to be set
     */
    public void setDecisionCode(SheriffOrderReason decisionCode) {
        this.decisionCode = decisionCode;
    }

    /**
     * Retrieves detailed explanation of the decision in user-readable form.
     *
     * @return the value
     */
    public String getDecisionDetails() {
        return decisionDetails;
    }

    /**
     * Sets detailed explanation of the decision in user-readable form.
     *
     * @param decisionDetails the value to be set
     */
    public void setDecisionDetails(String decisionDetails) {
        this.decisionDetails = decisionDetails;
    }

    /**
     * Retrieves <code>true</code>, if the complaints' owners' names are not to be published, <code>false</code>
     * otherwise
     * .
     *
     * @return the value
     */
    public Boolean getAnonymous() {
        return anonymous;
    }

    /**
     * Sets <code>true</code>, if the complaints' owners' names are not to be published, <code>false</code> otherwise
     * .
     *
     * @param anonymous the value to be set
     */
    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(decisionDetails, 4096, "sheriff-complaint-decision.decision-details.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code SheriffComplaintDecisionText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SheriffComplaintDecisionText clone() {
        try {
            return (SheriffComplaintDecisionText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
