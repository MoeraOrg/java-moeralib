package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrantUpdatedNotification extends Notification {

    private List<String> scope;

    public GrantUpdatedNotification() {
        super(NotificationType.GRANT_UPDATED);
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

}
