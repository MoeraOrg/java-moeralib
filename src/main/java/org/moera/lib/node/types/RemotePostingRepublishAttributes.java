package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemotePostingRepublishAttributes extends Structure implements Cloneable {

    private String remoteFeedName;
    private Principal postingView;
    private List<StoryAttributes> publications;

    /**
     * Retrieves name of the feed on the remote node the posting is being republished from.
     *
     * @return the value
     */
    public String getRemoteFeedName() {
        return remoteFeedName;
    }

    /**
     * Sets name of the feed on the remote node the posting is being republished from.
     *
     * @param remoteFeedName the value to be set
     */
    public void setRemoteFeedName(String remoteFeedName) {
        this.remoteFeedName = remoteFeedName;
    }

    /**
     * Retrieves visibility of the new posting, overriding the default.
     *
     * @return the value
     */
    public Principal getPostingView() {
        return postingView;
    }

    /**
     * Sets visibility of the new posting, overriding the default.
     *
     * @param postingView the value to be set
     */
    public void setPostingView(Principal postingView) {
        this.postingView = postingView;
    }

    /**
     * Retrieves list of publications in feeds to be made after downloading the posting.
     *
     * @return the value
     */
    public List<StoryAttributes> getPublications() {
        return publications;
    }

    /**
     * Sets list of publications in feeds to be made after downloading the posting.
     *
     * @param publications the value to be set
     */
    public void setPublications(List<StoryAttributes> publications) {
        this.publications = publications;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(remoteFeedName, "posting.remote-feed-name.blank");
        if (publications != null) {
            publications.forEach(StoryAttributes::validate);
        }
        ValidationUtil.notNull(publications, "posting.publications.missing");
    }

    /**
     * Creates and returns a copy of this {@code RemotePostingRepublishAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemotePostingRepublishAttributes clone() {
        try {
            return (RemotePostingRepublishAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
