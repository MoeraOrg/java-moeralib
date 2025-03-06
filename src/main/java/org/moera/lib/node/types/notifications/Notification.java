package org.moera.lib.node.types.notifications;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.util.Util;

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

    protected Notification(NotificationType type) {
        this.type = type;
    }

    public String getSenderNodeName() {
        return senderNodeName;
    }

    public void setSenderNodeName(String senderNodeName) {
        this.senderNodeName = senderNodeName;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getSenderGender() {
        return senderGender;
    }

    public void setSenderGender(String senderGender) {
        this.senderGender = senderGender;
    }

    public AvatarImage getSenderAvatar() {
        return senderAvatar;
    }

    public void setSenderAvatar(AvatarImage senderAvatar) {
        this.senderAvatar = senderAvatar;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public String getPendingNotificationId() {
        return pendingNotificationId;
    }

    public void setPendingNotificationId(String pendingNotificationId) {
        this.pendingNotificationId = pendingNotificationId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void validate() {
    }

    @Override
    public Notification clone() {
        try {
            return (Notification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

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

    public void logParameters(List<LogPair> parameters) {
    }

}
