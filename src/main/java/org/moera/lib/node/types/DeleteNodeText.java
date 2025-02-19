package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNodeText implements Cloneable {

    private String message;

    @JsonIgnore
    private Object extra;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
        ValidationUtil.maxSize(message, 1024, "delete-node.message.wrong-size");
    }

    @Override
    public DeleteNodeText clone() {
        try {
            return (DeleteNodeText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
