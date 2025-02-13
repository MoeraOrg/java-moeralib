package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupsFeatures implements Cloneable {

    private List<FriendGroupInfo> available;
    private List<FriendGroupDetails> memberOf;

    public List<FriendGroupInfo> getAvailable() {
        return available;
    }

    public void setAvailable(List<FriendGroupInfo> available) {
        this.available = available;
    }

    public List<FriendGroupDetails> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(List<FriendGroupDetails> memberOf) {
        this.memberOf = memberOf;
    }

    @Override
    public FriendGroupsFeatures clone() {
        try {
            return (FriendGroupsFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
