package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AskSubject;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AskedNotification extends Notification {

    private AskSubject subject;
    private String friendGroupId;
    private String message;

    public AskedNotification() {
        super(NotificationType.ASKED);
    }

    public AskSubject getSubject() {
        return subject;
    }

    public void setSubject(AskSubject subject) {
        this.subject = subject;
    }

    public String getFriendGroupId() {
        return friendGroupId;
    }

    public void setFriendGroupId(String friendGroupId) {
        this.friendGroupId = friendGroupId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void validate() {
        ValidationUtil.maxSize(friendGroupId, 40, "ask.friend-group-id.wrong-size");
        ValidationUtil.maxSize(message, 70, "ask.message.wrong-size");
    }

}
