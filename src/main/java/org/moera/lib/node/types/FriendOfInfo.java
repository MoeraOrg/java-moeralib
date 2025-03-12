package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendOfInfo extends Structure implements Cloneable {

    private String remoteNodeName;
    private ContactInfo contact;
    private List<FriendGroupDetails> groups;

    /**
     * Retrieves name of the remote node.
     *
     * @return the value
     */
    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    /**
     * Sets name of the remote node.
     *
     * @param remoteNodeName the value to be set
     */
    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    /**
     * Retrieves information about the remote node.
     *
     * @return the value
     */
    public ContactInfo getContact() {
        return contact;
    }

    /**
     * Sets information about the remote node.
     *
     * @param contact the value to be set
     */
    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    /**
     * Retrieves groups of friends on the remote node this node was added to.
     *
     * @return the value
     */
    public List<FriendGroupDetails> getGroups() {
        return groups;
    }

    /**
     * Sets groups of friends on the remote node this node was added to.
     *
     * @param groups the value to be set
     */
    public void setGroups(List<FriendGroupDetails> groups) {
        this.groups = groups;
    }

    /**
     * Creates and returns a copy of this {@code FriendOfInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendOfInfo clone() {
        try {
            return (FriendOfInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
