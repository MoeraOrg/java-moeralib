package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The set of administrative permissions granted by the sending node to this node has been updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrantUpdatedNotification extends Notification {

    private List<String> scope;

    public GrantUpdatedNotification() {
        super(NotificationType.GRANT_UPDATED);
    }

    /**
     * Retrieves the updated set of permissions.
     *
     * @return the value
     */
    public List<String> getScope() {
        return scope;
    }

    /**
     * Sets the updated set of permissions.
     *
     * @param scope the value to be set
     */
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

}
