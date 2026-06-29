package org.moera.lib.node.types.notifications;

import java.util.List;

import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Represents a notification sent to a node holding a media lease.
 */
public abstract class LeaseNotification extends Notification {

    private String leaseId;

    /**
     * Constructs a {@code LeaseNotification} with the specified notification type.
     *
     * @param type the type of the notification
     */
    protected LeaseNotification(NotificationType type) {
        super(type);
    }

    /**
     * Retrieves the media lease identifier.
     *
     * @return the media lease identifier
     */
    public String getLeaseId() {
        return leaseId;
    }

    /**
     * Sets the media lease identifier.
     *
     * @param leaseId the media lease identifier to be set
     */
    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(leaseId, 40, "media-lease.lease-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("leaseId", LogUtil.format(leaseId)));
    }

}
