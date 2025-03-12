package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemotePostingOrNode extends Structure implements Cloneable {

    private String nodeName;
    private String postingId;

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
     * Retrieves ID of the posting on the node.
     *
     * @return the value
     */
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets ID of the posting on the node.
     *
     * @param postingId the value to be set
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Creates and returns a copy of this {@code RemotePostingOrNode} object.
     *
     * @return a clone of this instance
     */
    @Override
    public RemotePostingOrNode clone() {
        try {
            return (RemotePostingOrNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

    /**
     * Compares this object to the specified object.
     *
     * @param peer the object to compare with this instance
     * @return {@code true} if the specified object is equal to this object, otherwise {@code false}
     */
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

    /**
     * Computes the hash code for this object using its attributes.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(nodeName, postingId);
    }

}
