package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionOperations {

    private Principal view;
    private Principal delete;

    public Principal getView() {
        return view;
    }

    public void setView(Principal view) {
        this.view = view;
    }

    public Principal getDelete() {
        return delete;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

}
