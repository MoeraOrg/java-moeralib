package org.moera.lib.node.types;

// This file is generated

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeNameOperations implements Cloneable {

    private Principal manage;

    public Principal getManage() {
        return manage;
    }

    public Principal getManage(Principal defaultValue) {
        return manage != null ? manage : defaultValue;
    }

    public static Principal getManage(NodeNameOperations operations, Principal defaultValue) {
        return operations != null ? operations.getManage(defaultValue) : defaultValue;
    }

    public void setManage(Principal manage) {
        this.manage = manage;
    }

    public void setManage(Principal manage, Principal defaultValue) {
        this.manage = Objects.equals(manage, defaultValue) ? null : manage;
    }

    @Override
    public NodeNameOperations clone() {
        try {
            return (NodeNameOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
