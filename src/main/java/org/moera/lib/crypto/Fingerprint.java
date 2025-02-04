package org.moera.lib.crypto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Fingerprint {

    private final Map<String, Object> fields = new HashMap<>();

    public Fingerprint(int version) {
        put("version", version);
    }

    public int getVersion() {
        return (Integer) get("version");
    }

    public Object get(String name) {
        return fields.get(name);
    }

    public Object put(String name, Object value) {
        return fields.put(name, value);
    }

    public boolean containsField(Object name) {
        return fields.containsKey(name);
    }

    public Set<String> fieldSet() {
        return fields.keySet();
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return fields.entrySet();
    }

    public Object getOrDefault(String name, Object defaultValue) {
        return fields.getOrDefault(name, defaultValue);
    }

    public void forEach(BiConsumer<? super String, ? super Object> action) {
        fields.forEach(action);
    }

}
