package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushRelayClientAttributes extends Structure implements Cloneable {

    private PushRelayType type;
    private String clientId;
    private String lang;

    public PushRelayType getType() {
        return type;
    }

    public void setType(PushRelayType type) {
        this.type = type;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(type, "push-relay.type.missing");
        ValidationUtil.notBlank(clientId, "push-relay.client-id.blank");
    }

    @Override
    public PushRelayClientAttributes clone() {
        try {
            return (PushRelayClientAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
