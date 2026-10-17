package org.moera.lib.node.types.notifications;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.SharingType;
import org.moera.lib.node.types.validate.ValidationUtil;
import org.moera.lib.util.LogUtil;

/**
 * A remote node removed a sharing. Sharing type, posting ID, sender node name, posting revision ID, remote story ID,
 * and remote posting ID must match, including null for omitted fields. A story is identified solely by its ID; remote
 * feed name and story moment do not participate in matching.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingUnsharedNotification extends Notification {

    private SharingType sharingType;
    private String postingId;
    private String postingRevisionId;
    private String remoteFeedName;
    private String remoteStoryId;
    private Long remoteStoryMoment;
    private String remotePostingId;

    public PostingUnsharedNotification() {
        super(NotificationType.POSTING_UNSHARED);
    }

    /**
     * Retrieves type of sharing.
     *
     * @return the value
     */
    public SharingType getSharingType() {
        return sharingType;
    }

    /**
     * Sets type of sharing.
     *
     * @param sharingType the value to be set
     */
    public void setSharingType(SharingType sharingType) {
        this.sharingType = sharingType;
    }

    /**
     * Retrieves ID of the original posting on the receiving node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the original posting on the receiving node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Retrieves ID of the shared revision on the receiving node.
     *
     * @return the value
     */
    public String getPostingRevisionId() {
        return postingRevisionId;
    }

    /**
     * Sets ID of the shared revision on the receiving node.
     *
     * @param postingRevisionId the value to be set
     */
    public void setPostingRevisionId(String postingRevisionId) {
        this.postingRevisionId = postingRevisionId;
    }

    /**
     * Retrieves sharing feed on the sending node; required together with story ID and moment.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets sharing feed on the sending node; required together with story ID and moment.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves sharing story ID on the sending node; required together with feed name and moment.
     *
     * @return the value
     */
    public String getRemoteStoryId() {
        return remoteStoryId;
    }

    /**
     * Sets sharing story ID on the sending node; required together with feed name and moment.
     *
     * @param remoteStoryId the value to be set
     */
    public void setRemoteStoryId(String remoteStoryId) {
        this.remoteStoryId = remoteStoryId;
    }

    /**
     * Retrieves sharing story moment on the sending node; required together with feed name and story ID.
     *
     * @return the value
     */
    public Long getRemoteStoryMoment() {
        return remoteStoryMoment;
    }

    /**
     * Sets sharing story moment on the sending node; required together with feed name and story ID.
     *
     * @param remoteStoryMoment the value to be set
     */
    public void setRemoteStoryMoment(Long remoteStoryMoment) {
        this.remoteStoryMoment = remoteStoryMoment;
    }

    /**
     * Retrieves sharing posting ID on the sending node; required unless a complete story reference is provided.
     *
     * @return the value
     */
    public String getRemotePostingId() {
        return remotePostingId;
    }

    /**
     * Sets sharing posting ID on the sending node; required unless a complete story reference is provided.
     *
     * @param remotePostingId the value to be set
     */
    public void setRemotePostingId(String remotePostingId) {
        this.remotePostingId = remotePostingId;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notNull(sharingType, "sharing.sharing-type.missing");
        ValidationUtil.notNull(postingId, "sharing.posting-id.missing");
        ValidationUtil.maxSize(postingId, 40, "sharing.posting-id.wrong-size");
        ValidationUtil.maxSize(postingRevisionId, 40, "sharing.posting-revision-id.wrong-size");
        ValidationUtil.maxSize(remoteFeedName, 63, "sharing.feed-name.wrong-size");
        ValidationUtil.maxSize(remoteStoryId, 40, "sharing.story-id.wrong-size");
        ValidationUtil.maxSize(remotePostingId, 40, "sharing.remote-posting-id.wrong-size");
    }

    @Override
    public void logParameters(List<LogPair> parameters) {
        super.logParameters(parameters);
        parameters.add(LogPair.of("postingId", LogUtil.format(postingId)));
    }

}
