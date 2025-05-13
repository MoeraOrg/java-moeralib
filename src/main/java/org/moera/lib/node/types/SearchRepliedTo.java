package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchRepliedTo extends Structure implements Cloneable {

    private String id;
    private String revisionId;
    private String name;
    private String fullName;
    private AvatarImage avatar;
    private String heading;

    /**
     * Retrieves ID of the comment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the comment.
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves ID of the comment revision.
     *
     * @return the value
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets ID of the comment revision.
     *
     * @param revisionId the value to be set
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * Retrieves node name of the comment's owner.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets node name of the comment's owner.
     *
     * @param name the value to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves full name of the comment's owner.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name of the comment's owner.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves avatar of the comment's owner.
     *
     * @return the value
     */
    public AvatarImage getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar of the comment's owner.
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves heading of the comment.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets heading of the comment.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Creates and returns a copy of this {@code SearchRepliedTo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchRepliedTo clone() {
        try {
            return (SearchRepliedTo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
