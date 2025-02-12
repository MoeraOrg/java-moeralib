package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AskDescription {

    private AskSubject subject;
    private String friendGroupId;
    private String message;

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

}
