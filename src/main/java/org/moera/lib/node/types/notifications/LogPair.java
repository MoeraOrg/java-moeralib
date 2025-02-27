package org.moera.lib.node.types.notifications;

public record LogPair(String name, String value) {

    public static LogPair of(String name, String value) {
        return new LogPair(name, value);
    }

}
