package org.moera.lib.node.types.notifications;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.util.Util;

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
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
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
        return String.format("%s (%s)", getType(), params);
    }

    public void logParameters(List<LogPair> parameters) {
    }

}
