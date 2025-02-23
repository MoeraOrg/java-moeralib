package org.moera.lib.node.types;

// This file is generated

import java.util.List;
import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGroupsFeatures implements Cloneable {

    private List<FriendGroupInfo> available;
    private List<FriendGroupDetails> memberOf;

    @JsonIgnore
    private Object extra;

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

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
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
