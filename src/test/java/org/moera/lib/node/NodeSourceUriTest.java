package org.moera.lib.node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class NodeSourceUriTest {

    @Test
    void parsesParametersAndUsesLastDuplicate() {
        NodeSourceUri source = NodeSourceUri.parse(
            "https://example/node?a=b;via_email;name=first;name=last;=ignored"
        );

        assertEquals("https://example/node?a=b", source.getUri());
        assertEquals("", source.getParameter(NodeSourceUri.VIA_EMAIL));
        assertEquals("last", source.getParameter("name"));
        assertEquals(
            java.util.List.of("via_email", "name"),
            new ArrayList<>(source.getParameters().keySet())
        );
        assertEquals("https://example/node?a=b;via_email=;name=last", source.toString());
        assertFalse(source.hasParameter(""));
        assertNull(source.getParameter("missing"));
    }

    @Test
    void appliesRfc3986EncodingAndTolerantDecoding() {
        NodeSourceUri source = NodeSourceUri.parse(
            "node;label=%D0%9C%D0%B8%D1%80%20%2B;reserved=%21%27%28%29%2A;equals=a=b;bad=%ZZ%2"
        );

        assertEquals("Мир +", source.getParameter("label"));
        assertEquals("!'()*", source.getParameter("reserved"));
        assertEquals("a=b", source.getParameter("equals"));
        assertEquals("%ZZ%2", source.getParameter("bad"));
        assertEquals(
            "node;label=%D0%9C%D0%B8%D1%80%20%2B;reserved=%21%27%28%29%2A;equals=a%3Db;bad=%25ZZ%252",
            source.toString()
        );
    }

    @Test
    void supportsDefaultStateAndProgrammaticUpdates() {
        NodeSourceUri source = new NodeSourceUri();

        assertEquals("", source.getUri());
        assertEquals("", source.toString());

        source.setUri("https://example/node?a=b");
        source.setParameter(NodeSourceUri.VIA_EMAIL, "true");
        source.setParameter("", "ignored");

        assertTrue(source.hasParameter(NodeSourceUri.VIA_EMAIL));
        assertEquals("https://example/node?a=b;via_email=true", source.toString());
    }

    @Test
    void rejectsSemicolonInProgrammaticUri() {
        NodeSourceUri source = new NodeSourceUri();

        assertThrows(IllegalArgumentException.class, () -> source.setUri("https://example/node;parameter"));
    }

    @Test
    void copiesInputAndReturnsReadOnlyLiveView() {
        Map<String, String> parameters = new LinkedHashMap<>();
        parameters.put("first", "one");
        parameters.put("", "ignored");
        NodeSourceUri source = new NodeSourceUri();
        source.setParameters(parameters);
        Map<String, String> view = source.getParameters();

        parameters.put("second", "external");
        source.setParameter("second", "internal");

        assertEquals(Map.of("first", "one", "second", "internal"), view);
        assertEquals("internal", source.getParameter("second"));
        assertThrows(UnsupportedOperationException.class, () -> view.put("third", "three"));
    }

    @Test
    void replacesMalformedUtf8WithReplacementCharacter() {
        NodeSourceUri source = NodeSourceUri.parse("node;value=%FF%61");

        assertEquals("\uFFFDa", source.getParameter("value"));
    }

    @Test
    void identifiesServiceFromUri() {
        assertEquals(
            NodeSourceUri.Service.TELEGRAM,
            NodeSourceUri.parse("https://t.me/moera").getService()
        );
        assertNull(NodeSourceUri.parse("https://example.com/moera").getService());
    }

}
