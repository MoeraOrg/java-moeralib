package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingRepublishAttributes extends Structure implements Cloneable {

    private Principal postingView;
    private List<StoryAttributes> publications;

    /**
     * Retrieves new visibility of the posting, if it needs to be changed.
     *
     * @return the value
     */
    public Principal getPostingView() {
        return postingView;
    }

    /**
     * Sets new visibility of the posting, if it needs to be changed.
     *
     * @param postingView the value to be set
     */
    public void setPostingView(Principal postingView) {
        this.postingView = postingView;
    }

    /**
     * Retrieves list of new publications in feeds.
     *
     * @return the value
     */
    public List<StoryAttributes> getPublications() {
        return publications;
    }

    /**
     * Sets list of new publications in feeds.
     *
     * @param publications the value to be set
     */
    public void setPublications(List<StoryAttributes> publications) {
        this.publications = publications;
    }

    @Override
    public void validate() {
        super.validate();
        if (publications != null) {
            publications.forEach(StoryAttributes::validate);
        }
        ValidationUtil.notNull(publications, "posting.publications.missing");
    }

    /**
     * Creates and returns a copy of this {@code PostingRepublishAttributes} object.
     *
     * @return a clone of this instance
     */
    @Override
    public PostingRepublishAttributes clone() {
        try {
            return (PostingRepublishAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
