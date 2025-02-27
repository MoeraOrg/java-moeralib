package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingCommentsUpdatedNotification extends SubscriberNotification {

    private String postingId;
    private int total;

    public PostingCommentsUpdatedNotification() {
        super(NotificationType.POSTING_COMMENTS_UPDATED);
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
