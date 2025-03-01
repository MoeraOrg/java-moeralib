package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemotePostingOrNode extends Structure implements Cloneable {

    private String nodeName;
    private String postingId;

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

    @Override
    public RemotePostingOrNode clone() {
        try {
            return (RemotePostingOrNode) super.clone();
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
        RemotePostingOrNode that = (RemotePostingOrNode) peer;
        return Objects.equals(nodeName, that.nodeName)
            && Objects.equals(postingId, that.postingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName, postingId);
    }

}
