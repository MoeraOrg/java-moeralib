package org.moera.lib.node;

public record QueryParam(String name, Object value) {

    public QueryParam of(String name, Object value) {
        return new QueryParam(name, value);
    }

}
