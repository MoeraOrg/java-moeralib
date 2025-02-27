package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingDeletedNotification extends SubscriberNotification {

    private String postingId;

    public PostingDeletedNotification() {
        super(NotificationType.POSTING_DELETED);
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

}
