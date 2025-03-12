package org.moera.lib.node.types.notifications;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationFailure;
import org.moera.lib.util.Util;

/**
 * Represents a generic notification that can be sent and received.
 * <p>
 * Notifications provide basic metadata about the sender and the type of notification.
 * Subclasses can customize fields as needed.
 * <p>
 * Additional functionality includes the ability to validate the notification, clone it,
 * and log its details in a structured format for debugging or auditing purposes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Notification implements Cloneable {

    @JsonIgnore
    private String senderNodeName;

    @JsonIgnore
    private String senderFullName;

    @JsonIgnore
    private String senderGender;

    @JsonIgnore
    private AvatarImage senderAvatar;

    @JsonIgnore
    private NotificationType type;

    @JsonIgnore
    private String pendingNotificationId;

    @JsonIgnore
    private Timestamp createdAt = Util.now();

    /**
     * Constructs a {@code Notification} with the specified notification type.
     *
     * @param type the type of the notification
     */
    protected Notification(NotificationType type) {
        this.type = type;
    }

    /**
     * Retrieves the name of the sender node.
     *
     * @return the name of the sender node
     */
    public String getSenderNodeName() {
        return senderNodeName;
    }

    /**
     * Sets the sender node's name for this notification.
     *
     * @param senderNodeName the name of the sender's node
     */
    public void setSenderNodeName(String senderNodeName) {
        this.senderNodeName = senderNodeName;
    }

    /**
     * Retrieves the full name of the notification's sender.
     *
     * @return the sender's full name
     */
    public String getSenderFullName() {
        return senderFullName;
    }

    /**
     * Sets the full name of the notification's sender.
     *
     * @param senderFullName the full name of the sender to be set
     */
    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    /**
     * Retrieves the gender of the sender.
     *
     * @return the gender of the sender, or {@code null} if not set
     */
    public String getSenderGender() {
        return senderGender;
    }

    /**
     * Sets the gender of the sender.
     *
     * @param senderGender the gender of the sender to be set
     */
    public void setSenderGender(String senderGender) {
        this.senderGender = senderGender;
    }

    /**
     * Retrieves the avatar image of the sender.
     *
     * @return the sender's avatar as an {@link AvatarImage} object
     */
    public AvatarImage getSenderAvatar() {
        return senderAvatar;
    }

    /**
     * Sets the avatar for the sender of the notification.
     *
     * @param senderAvatar the sender's avatar
     */
    public void setSenderAvatar(AvatarImage senderAvatar) {
        this.senderAvatar = senderAvatar;
    }

    /**
     * Retrieves the type of the notification.
     *
     * @return the notification type
     */
    public NotificationType getType() {
        return type;
    }

    /**
     * Sets the notification type for this instance.
     *
     * @param type the type of the notification to set
     */
    public void setType(NotificationType type) {
        this.type = type;
    }

    /**
     * Retrieves the identifier of the pending notification.
     * This field is used for managing notifications on the sender's node. It is not transferred to the receiver.
     *
     * @return the pending notification identifier
     */
    public String getPendingNotificationId() {
        return pendingNotificationId;
    }

    /**
     * Sets the identifier of the pending notification.
     *
     * @param pendingNotificationId the identifier of the pending notification
     */
    public void setPendingNotificationId(String pendingNotificationId) {
        this.pendingNotificationId = pendingNotificationId;
    }

    /**
     * Retrieves the timestamp when the notification was created.
     *
     * @return the creation time of the notification
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the creation timestamp of the notification.
     *
     * @param createdAt the creation time of the notification to be set
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Validates the notification structure.
     * <p>
     * If the structure contains incorrect data, this method should throw {@link ValidationFailure} exception.
     */
    public void validate() {
    }

    /**
     * Creates and returns a copy of this {@code Notification} object.
     * The method performs a shallow copy of the current instance.
     *
     * @return a clone of this {@code Notification} instance
     */
    @Override
    public Notification clone() {
        try {
            return (Notification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

    /**
     * Converts the notification to a string that can be used for logging.
     * The log message includes the notification type and some additional parameters,
     * if present.
     *
     * @return A string representation of the notification formatted as a log message.
     * @see #logParameters
     */
    public final String toLogMessage() {
        List<LogPair> parameters = new ArrayList<>();
        logParameters(parameters);
        if (parameters.isEmpty()) {
            return getType().toString();
        }
        String params = parameters.stream()
            .map(p -> p.name() + " = " + p.value())
            .collect(Collectors.joining(", "));
        return "%s (%s)".formatted(getType(), params);
    }

    /**
     * Fills the list with parameters that should be added to the log message.
     * Each parameter is represented as a {@link LogPair} containing a name and value.
     *
     * @param parameters the list of parameters
     * @see #toLogMessage
     */
    public void logParameters(List<LogPair> parameters) {
    }

}
