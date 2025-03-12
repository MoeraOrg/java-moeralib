package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodeText extends Structure implements Cloneable {

    private String message;

    /**
     * Retrieves text message for the provider.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets text message for the provider.
     *
     * @param message the value to be set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.maxSize(message, 1024, "delete-node.message.wrong-size");
    }

    /**
     * Creates and returns a copy of this {@code DeleteNodeText} object.
     *
     * @return a clone of this instance
     */
    @Override
    public DeleteNodeText clone() {
        try {
            return (DeleteNodeText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
