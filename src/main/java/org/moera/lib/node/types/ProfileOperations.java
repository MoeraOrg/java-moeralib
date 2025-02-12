package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileOperations {

    private Principal edit;
    private Principal viewEmail;

    public Principal getEdit() {
        return edit;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public Principal getViewEmail() {
        return viewEmail;
    }

    public void setViewEmail(Principal viewEmail) {
        this.viewEmail = viewEmail;
    }

}
