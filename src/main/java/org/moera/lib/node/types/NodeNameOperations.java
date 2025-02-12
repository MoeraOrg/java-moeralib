package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeNameOperations {

    private Principal manage;

    public Principal getManage() {
        return manage;
    }

    public void setManage(Principal manage) {
        this.manage = manage;
    }

}
