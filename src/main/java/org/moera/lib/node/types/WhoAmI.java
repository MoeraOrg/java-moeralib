package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WhoAmI extends Structure implements Cloneable {

    private String nodeName;
    private Boolean nodeNameChanging;
    private String fullName;
    private String gender;
    private String title;
    private AvatarImage avatar;
    private Boolean frozen;
    private NodeType type;

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
     * Retrieves <code>true</code> if node name is about to be changed.
     *
     * @return the value
     */
    public Boolean getNodeNameChanging() {
        return nodeNameChanging;
    }

    /**
     * Sets <code>true</code> if node name is about to be changed.
     *
     * @param nodeNameChanging the value to be set
     */
    public void setNodeNameChanging(Boolean nodeNameChanging) {
        this.nodeNameChanging = nodeNameChanging;
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
     * Retrieves node owner's gender.
     *
     * @return the value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets node owner's gender.
     *
     * @param gender the value to be set
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     * Retrieves <code>true</code> if the node is frozen due to inactivity, <code>false</code> (the default) otherwise
     * .
     *
     * @return the value
     */
    public Boolean getFrozen() {
        return frozen;
    }

    /**
     * Sets <code>true</code> if the node is frozen due to inactivity, <code>false</code> (the default) otherwise
     * .
     *
     * @param frozen the value to be set
     */
    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    /**
     * Retrieves type of the node, <code>regular</code> by default.
     *
     * @return the value
     */
    public NodeType getType() {
        return type;
    }

    /**
     * Sets type of the node, <code>regular</code> by default.
     *
     * @param type the value to be set
     */
    public void setType(NodeType type) {
        this.type = type;
    }

    /**
     * Creates and returns a copy of this {@code WhoAmI} object.
     *
     * @return a clone of this instance
     */
    @Override
    public WhoAmI clone() {
        try {
            return (WhoAmI) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
