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

    public boolean isReject() {
        return reject;
    }

    public void setReject(boolean reject) {
        this.reject = reject;
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

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(decisionDetails, 4096, "sheriff-complaint-decision.decision-details.wrong-size");
    }

    @Override
    public SheriffComplaintDecisionText clone() {
        try {
            return (SheriffComplaintDecisionText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
