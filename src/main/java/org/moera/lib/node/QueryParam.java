package org.moera.lib.node;

public record QueryParam(String name, Object value) {

    public static QueryParam of(String name, Object value) {
        return new QueryParam(name, value);
    }

}
