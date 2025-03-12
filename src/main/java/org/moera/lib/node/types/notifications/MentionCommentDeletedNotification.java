package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A mention of the receiver in a comment on the sending node deleted.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MentionCommentDeletedNotification extends Notification {

    private String postingId;
    private String commentId;

    public MentionCommentDeletedNotification() {
        super(NotificationType.MENTION_COMMENT_DELETED);
    }

    /**
     * Retrieves ID of the posting on the sending node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the sending node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the comment on the sending node.
     *
     * @return the value
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets ID of the comment on the sending node.
     *
     * @param commentId the value to be set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(postingId, 40, "mention.posting-id.wrong-size");
        ValidationUtil.maxSize(commentId, 40, "mention.comment-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("commentId", LogUtil.format(commentId)));
    }

}
