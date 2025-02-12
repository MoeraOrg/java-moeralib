package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedOperations {

    private Principal add;

    public Principal getAdd() {
        return add;
    }

    public void setAdd(Principal add) {
        this.add = add;
    }

}
