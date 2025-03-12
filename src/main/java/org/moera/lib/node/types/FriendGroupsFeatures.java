package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupsFeatures extends Structure implements Cloneable {

    private List<FriendGroupInfo> available;
    private List<FriendGroupDetails> memberOf;

    /**
     * Retrieves list of groups of friends existing on the node.
     *
     * @return the value
     */
    public List<FriendGroupInfo> getAvailable() {
        return available;
    }

    /**
     * Sets list of groups of friends existing on the node.
     *
     * @param available the value to be set
     */
    public void setAvailable(List<FriendGroupInfo> available) {
        this.available = available;
    }

    /**
     * Retrieves list of groups of friends the client is member of.
     *
     * @return the value
     */
    public List<FriendGroupDetails> getMemberOf() {
        return memberOf;
    }

    /**
     * Sets list of groups of friends the client is member of.
     *
     * @param memberOf the value to be set
     */
    public void setMemberOf(List<FriendGroupDetails> memberOf) {
        this.memberOf = memberOf;
    }

    /**
     * Creates and returns a copy of this {@code FriendGroupsFeatures} object.
     *
     * @return a clone of this instance
     */
    @Override
    public FriendGroupsFeatures clone() {
        try {
            return (FriendGroupsFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
