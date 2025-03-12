package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCarte extends Structure implements Cloneable {

    private String clientName;
    private String carte;

    /**
     * Retrieves the node name the client (carte owner) wants to authenticate under.
     *
     * @return the value
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the node name the client (carte owner) wants to authenticate under.
     *
     * @param clientName the value to be set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Retrieves the carte to verify.
     *
     * @return the value
     */
    public String getCarte() {
        return carte;
    }

    /**
     * Sets the carte to verify.
     *
     * @param carte the value to be set
     */
    public void setCarte(String carte) {
        this.carte = carte;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(carte, "carte.carte.blank");
    }

    /**
     * Creates and returns a copy of this {@code ClientCarte} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ClientCarte clone() {
        try {
            return (ClientCarte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
