package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendInfo extends Structure implements Cloneable {

    private String nodeName;
    private ContactInfo contact;
    private List<FriendGroupDetails> groups;

    /**
     * Retrieves name of the node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves information about the node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information about the node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves groups of friends the node belongs to.
     *
     * @return the value
     */
    public List<FriendGroupDetails> getGroups() {
        return groups;
    }

    /**
     * Sets groups of friends the node belongs to.
     *
     * @param groups the value to be set
     */
    public void setGroups(List<FriendGroupDetails> groups) {
        this.groups = groups;
    }

    /**
     * Creates and returns a copy of this {@code FriendInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendInfo clone() {
        try {
            return (FriendInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
