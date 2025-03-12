package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Deleted all reactions from a posting owned by the receiver.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionDeletedAllNotification extends Notification {

    private String parentPostingId;
    private String parentCommentId;
    private String parentMediaId;
    private String postingId;

    public PostingReactionDeletedAllNotification() {
        super(NotificationType.POSTING_REACTION_DELETED_ALL);
    }

    /**
     * Retrieves ID of the posting containing the media or containing the comment that contains the media linked to the
     * posting in question (present only if the posting in question is linked to a media)
     * .
     *
     * @return the value
     */
    public String getParentPostingId() {
        return parentPostingId;
    }

    /**
     * Sets ID of the posting containing the media or containing the comment that contains the media linked to the
     * posting in question (present only if the posting in question is linked to a media)
     * .
     *
     * @param parentPostingId the value to be set
     */
    public void setParentPostingId(String parentPostingId) {
        this.parentPostingId = parentPostingId;
    }

    /**
     * Retrieves ID of the comment containing the media linked to the posting in question (present only if the posting
     * in question is linked to a media attached to a comment)
     * .
     *
     * @return the value
     */
    public String getParentCommentId() {
        return parentCommentId;
    }

    /**
     * Sets ID of the comment containing the media linked to the posting in question (present only if the posting in
     * question is linked to a media attached to a comment)
     * .
     *
     * @param parentCommentId the value to be set
     */
    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    /**
     * Retrieves ID of the media linked to the posting in question (present only if the posting in question is linked
     * to a media)
     * .
     *
     * @return the value
     */
    public String getParentMediaId() {
        return parentMediaId;
    }

    /**
     * Sets ID of the media linked to the posting in question (present only if the posting in question is linked to a
     * media)
     * .
     *
     * @param parentMediaId the value to be set
     */
    public void setParentMediaId(String parentMediaId) {
        this.parentMediaId = parentMediaId;
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
