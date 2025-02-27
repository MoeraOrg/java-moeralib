package org.moera.lib.node.types.notifications;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.ReactionTotalsInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionsUpdatedNotification extends Notification {

    private String subscriberId;
    private String postingId;
    private ReactionTotalsInfo totals;

    public PostingReactionsUpdatedNotification() {
        super(NotificationType.POSTING_REACTIONS_UPDATED);
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public ReactionTotalsInfo getTotals() {
        return totals;
    }

    public void setTotals(ReactionTotalsInfo totals) {
        this.totals = totals;
    }

}
