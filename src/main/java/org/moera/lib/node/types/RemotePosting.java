package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemotePosting implements Cloneable {

    private String nodeName;
    private String postingId;

    @JsonIgnore
    private Object extra;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public RemotePosting clone() {
        try {
            return (RemotePosting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

    @Override
    public boolean equals(Object peer) {
        if (this == peer) {
            return true;
        }
        if (peer == null || getClass() != peer.getClass()) {
            return false;
        }
        RemotePosting that = (RemotePosting) peer;
        return Objects.equals(nodeName, that.nodeName)
            && Objects.equals(postingId, that.postingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName, postingId);
    }

}
