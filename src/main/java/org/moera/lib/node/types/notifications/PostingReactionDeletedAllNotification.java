package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionDeletedAllNotification extends Notification {

    private String parentPostingId;
    private String parentCommentId;
    private String parentMediaId;
    private String postingId;

    public PostingReactionDeletedAllNotification() {
        super(NotificationType.POSTING_REACTION_DELETED_ALL);
    }

    public String getParentPostingId() {
        return parentPostingId;
    }

    public void setParentPostingId(String parentPostingId) {
        this.parentPostingId = parentPostingId;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getParentMediaId() {
        return parentMediaId;
    }

    public void setParentMediaId(String parentMediaId) {
        this.parentMediaId = parentMediaId;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(parentPostingId, 40, "reaction.parent-posting-id.wrong-size");
        ValidationUtil.maxSize(parentCommentId, 40, "reaction.parent-comment-id.wrong-size");
        ValidationUtil.maxSize(parentMediaId, 40, "reaction.parent-media-id.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "reaction.posting-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("parentPostingId", LogUtil.format(parentPostingId)));
        parameters.add(LogPair.of("parentCommentId", LogUtil.format(parentCommentId)));
        parameters.add(LogPair.of("parentMediaId", LogUtil.format(parentMediaId)));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
    }

}
