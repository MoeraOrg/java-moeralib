package org.moera.lib.node.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.moera.lib.node.types.principal.Principal;
import tools.jackson.databind.ObjectMapper;

class PostingRepublishAttributesTest {

    @Test
    void serializesPostingViewOverride() {
        PostingRepublishAttributes attributes = new PostingRepublishAttributes();
        attributes.setPostingView(Principal.PRIVATE);

        assertEquals("{\"postingView\":\"private\"}", new ObjectMapper().writeValueAsString(attributes));
    }

}
