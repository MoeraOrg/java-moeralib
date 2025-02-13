package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendOfInfo implements Cloneable {

    private String remoteNodeName;
    private ContactInfo contact;
    private List<FriendGroupDetails> groups;

    public String getRemoteNodeName() {
        return remoteNodeName;
    }

    public void setRemoteNodeName(String remoteNodeName) {
        this.remoteNodeName = remoteNodeName;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public List<FriendGroupDetails> getGroups() {
        return groups;
    }

    public void setGroups(List<FriendGroupDetails> groups) {
        this.groups = groups;
    }

    @Override
    public FriendOfInfo clone() {
        try {
            return (FriendOfInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
