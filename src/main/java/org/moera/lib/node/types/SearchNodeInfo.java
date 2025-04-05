package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchNodeInfo extends Structure implements Cloneable {

    private String nodeName;
    private String fullName;
    private String title;
    private AvatarImage avatar;
    private float closeness;

    /**
     * Retrieves .
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets .
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves node owner's full name.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets node owner's full name.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves node title.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets node title.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves node owner's avatar.
     *
     * @return the value
     */
    public AvatarImage getAvatar() {
        return avatar;
    }

    /**
     * Sets node owner's avatar.
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves closeness of the node to the client.
     *
     * @return the value
     */
    public float getCloseness() {
        return closeness;
    }

    /**
     * Sets closeness of the node to the client.
     *
     * @param closeness the value to be set
     */
    public void setCloseness(float closeness) {
        this.closeness = closeness;
    }

    /**
     * Creates and returns a copy of this {@code SearchNodeInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchNodeInfo clone() {
        try {
            return (SearchNodeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
