package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushRelayClientAttributes extends Structure implements Cloneable {

    private PushRelayType type;
    private String clientId;
    private String lang;

    /**
     * Retrieves type of the relay.
     *
     * @return the value
     */
    public PushRelayType getType() {
        return type;
    }

    /**
     * Sets type of the relay.
     *
     * @param type the value to be set
     */
    public void setType(PushRelayType type) {
        this.type = type;
    }

    /**
     * Retrieves ID/token of the client.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets ID/token of the client.
     *
     * @param clientId the value to be set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Retrieves language of the messages.
     *
     * @return the value
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets language of the messages.
     *
     * @param lang the value to be set
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(type, "push-relay.type.missing");
        ValidationUtil.notBlank(clientId, "push-relay.client-id.blank");
    }

    /**
     * Creates and returns a copy of this {@code PushRelayClientAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PushRelayClientAttributes clone() {
        try {
            return (PushRelayClientAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
