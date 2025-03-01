package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCarte extends Structure implements Cloneable {

    private String clientName;
    private String carte;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(carte, "carte.carte.blank");
    }

    @Override
    public ClientCarte clone() {
        try {
            return (ClientCarte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
