package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AskDescription implements Cloneable {

    private AskSubject subject;
    private String friendGroupId;
    private String message;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.notNull(subject, "ask.subject.missing");
        ValidationUtil.maxSize(friendGroupId, 40, "ask.friend-group-id.wrong-size");
        ValidationUtil.maxSize(message, 70, "ask.message.wrong-size");
    }

    @Override
    public AskDescription clone() {
        try {
            return (AskDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
