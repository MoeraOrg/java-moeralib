package org.moera.lib.node.types;

import java.util.function.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Structure {

    @JsonIgnore
    private Object extra;

    public Object getExtra() {
        return extra;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrCreateExtra(Supplier<T> creator) {
        if (extra == null) {
            extra = creator.get();
        }
        return (T) extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public void validate() {
    }

}
