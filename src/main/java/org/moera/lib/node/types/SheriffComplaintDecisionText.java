package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SheriffComplaintDecisionText {

    private boolean reject;
    private SheriffOrderReason decisionCode;
    private String decisionDetails;
    private Boolean anonymous;

    public boolean getReject() {
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

}
