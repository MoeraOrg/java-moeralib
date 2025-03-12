package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.AvatarImage;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * Reaction added to a posting owned by the receiver.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReactionAddedNotification extends Notification {

    private String parentPostingId;
    private String parentCommentId;
    private String parentMediaId;
    private String postingId;
    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private AvatarImage ownerAvatar;
    private boolean negative;
    private int emoji;
    private String parentPostingNodeName;
    private String parentPostingFullName;
    private String parentPostingGender;
    private AvatarImage parentPostingAvatar;
    private String parentHeading;
    private String postingHeading;

    public PostingReactionAddedNotification() {
        super(NotificationType.POSTING_REACTION_ADDED);
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

    /**
     * Retrieves name of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets name of the reaction owner.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves full name of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets full name of the reaction owner.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves gender of the reaction owner.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets gender of the reaction owner.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves avatar of the reaction owner.
     *
     * @return the value
     */
    public AvatarImage getOwnerAvatar() {
        return ownerAvatar;
    }

    /**
     * Sets avatar of the reaction owner.
     *
     * @param ownerAvatar the value to be set
     */
    public void setOwnerAvatar(AvatarImage ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    /**
     * Retrieves <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @return the value
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Sets <code>true</code>, if the reaction is negative, <code>false</code>, if positive.
     *
     * @param negative the value to be set
     */
    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    /**
     * Retrieves reaction code, usually interpreted by clients as emoji code point.
     *
     * @return the value
     */
    public int getEmoji() {
        return emoji;
    }

    /**
     * Sets reaction code, usually interpreted by clients as emoji code point.
     *
     * @param emoji the value to be set
     */
    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    /**
     * Retrieves parent's owner node name (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @return the value
     */
    public String getParentPostingNodeName() {
        return parentPostingNodeName;
    }

    /**
     * Sets parent's owner node name (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @param parentPostingNodeName the value to be set
     */
    public void setParentPostingNodeName(String parentPostingNodeName) {
        this.parentPostingNodeName = parentPostingNodeName;
    }

    /**
     * Retrieves parent's owner full name (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @return the value
     */
    public String getParentPostingFullName() {
        return parentPostingFullName;
    }

    /**
     * Sets parent's owner full name (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @param parentPostingFullName the value to be set
     */
    public void setParentPostingFullName(String parentPostingFullName) {
        this.parentPostingFullName = parentPostingFullName;
    }

    /**
     * Retrieves parent's owner gender (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @return the value
     */
    public String getParentPostingGender() {
        return parentPostingGender;
    }

    /**
     * Sets parent's owner gender (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @param parentPostingGender the value to be set
     */
    public void setParentPostingGender(String parentPostingGender) {
        this.parentPostingGender = parentPostingGender;
    }

    /**
     * Retrieves parent's owner avatar (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @return the value
     */
    public AvatarImage getParentPostingAvatar() {
        return parentPostingAvatar;
    }

    /**
     * Sets parent's owner avatar (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @param parentPostingAvatar the value to be set
     */
    public void setParentPostingAvatar(AvatarImage parentPostingAvatar) {
        this.parentPostingAvatar = parentPostingAvatar;
    }

    /**
     * Retrieves heading of the parent (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @return the value
     */
    public String getParentHeading() {
        return parentHeading;
    }

    /**
     * Sets heading of the parent (see <code>parentPostingId</code> and <code>parentCommentId</code> above).
     *
     * @param parentHeading the value to be set
     */
    public void setParentHeading(String parentHeading) {
        this.parentHeading = parentHeading;
    }

    /**
     * Retrieves heading of the posting.
     *
     * @return the value
     */
    public String getPostingHeading() {
        return postingHeading;
    }

    /**
     * Sets heading of the posting.
     *
     * @param postingHeading the value to be set
     */
    public void setPostingHeading(String postingHeading) {
        this.postingHeading = postingHeading;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(parentPostingId, 40, "reaction.parent-posting-id.wrong-size");
        ValidationUtil.maxSize(parentCommentId, 40, "reaction.parent-comment-id.wrong-size");
        ValidationUtil.maxSize(parentMediaId, 40, "reaction.parent-media-id.wrong-size");
        ValidationUtil.maxSize(postingId, 40, "reaction.posting-id.wrong-size");
        ValidationUtil.maxSize(ownerName, 63, "reaction.owner-name.wrong-size");
        ValidationUtil.maxSize(ownerFullName, 96, "reaction.owner-full-name.wrong-size");
        ValidationUtil.maxSize(ownerGender, 31, "reaction.owner-gender.wrong-size");
        ValidationUtil.maxSize(parentPostingNodeName, 63, "reaction.parent-posting-node-name.wrong-size");
        ValidationUtil.maxSize(parentPostingFullName, 96, "reaction.parent-posting-full-name.wrong-size");
        ValidationUtil.maxSize(parentPostingGender, 31, "reaction.parent-posting-gender.wrong-size");
        ValidationUtil.maxSize(parentHeading, 255, "reaction.parent-heading.wrong-size");
        ValidationUtil.maxSize(postingHeading, 255, "reaction.posting-heading.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("parentPostingId", LogUtil.format(parentPostingId)));
        parameters.add(LogPair.of("parentCommentId", LogUtil.format(parentCommentId)));
        parameters.add(LogPair.of("parentMediaId", LogUtil.format(parentMediaId)));
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
        parameters.add(LogPair.of("ownerName", LogUtil.format(ownerName)));
        parameters.add(LogPair.of("parentPostingNodeName", LogUtil.format(parentPostingNodeName)));
        parameters.add(LogPair.of("parentHeading", LogUtil.format(parentHeading)));
        parameters.add(LogPair.of("postingHeading", LogUtil.format(postingHeading)));
    }

}
