package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchBlockUpdate extends Structure implements Cloneable {

    private String nodeName;
    private BlockedOperation blockedOperation;

    /**
     * Retrieves name of the node being blocked/unblocked.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the node being blocked/unblocked.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves the operation being blocked/unblocked.
     *
     * @return the value
     */
    public BlockedOperation getBlockedOperation() {
        return blockedOperation;
    }

    /**
     * Sets the operation being blocked/unblocked.
     *
     * @param blockedOperation the value to be set
     */
    public void setBlockedOperation(BlockedOperation blockedOperation) {
        this.blockedOperation = blockedOperation;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(nodeName, 40, "search.node-name.wrong-size");
        ValidationUtil.notNull(blockedOperation, "search.blocked-operation.missing");
    }

    /**
     * Creates and returns a copy of this {@code SearchBlockUpdate} object.
     *
     * @return a clone of this instance
     */
    @Override
    public SearchBlockUpdate clone() {
        try {
            return (SearchBlockUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
