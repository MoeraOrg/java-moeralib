package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendInfo extends Structure implements Cloneable {

    private String nodeName;
    private ContactInfo contact;
    private List<FriendGroupDetails> groups;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
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
    public FriendInfo clone() {
        try {
            return (FriendInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
