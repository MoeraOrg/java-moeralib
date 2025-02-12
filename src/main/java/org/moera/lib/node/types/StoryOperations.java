package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.principal.Principal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoryOperations {

    private Principal edit;
    private Principal delete;

    public Principal getEdit() {
        return edit;
    }

    public void setEdit(Principal edit) {
        this.edit = edit;
    }

    public Principal getDelete() {
        return delete;
    }

    public void setDelete(Principal delete) {
        this.delete = delete;
    }

}
