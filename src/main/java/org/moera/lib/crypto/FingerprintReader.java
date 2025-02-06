package org.moera.lib.crypto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.moera.lib.util.Util;

public class FingerprintReader implements AutoCloseable {

    private final ByteArrayInputStream in;

    FingerprintReader(byte[] input) {
        in = new ByteArrayInputStream(input);
    }

    private Boolean readBoolean() {
        int value = in.read();
        if (value == 0xff) {
            return null;
        } else {
            return value != 0;
        }
    }

    private Long readNumber() {
        int lower = in.read();
        int len;
        switch (lower) {
            case 0xfc:
                len = 2;
                break;
            case 0xfd:
                len = 4;
                break;
            case 0xfe:
                len = 8;
                break;
            case 0xff:
                return null;
            default:
                return (long) lower;
        }
        long value = 0;
        int shift = 0;
        for (int i = 0; i < len; i++) {
            value |= (long) in.read() << shift;
            shift += 8;
        }
        return value;
    }

    private String readString() {
        byte[] bytes = readBytes();
        return bytes != null ? new String(bytes, StandardCharsets.UTF_8) : null;
    }

    private byte[] readBytes() {
        Long len = readNumber();
        if (len == null) {
            return null;
        }
        if (len > in.available()) {
            throw new FingerprintException("incorrect length");
        }
        byte[] bytes = new byte[len.intValue()];
        in.read(bytes, 0, bytes.length);
        return bytes;
    }

    private Object read(Object schema) {
        if (schema.equals("boolean")) {
            return readBoolean();
        } else if (schema.equals("byte")) {
            Long l = readNumber();
            return l != null ? l.byteValue() : null;
        } else if (schema.equals("short")) {
            Long l = readNumber();
            return l != null ? l.shortValue() : null;
        } else if (schema.equals("int")) {
            Long l = readNumber();
            return l != null ? l.intValue() : null;
        } else if (schema.equals("long")) {
            return readNumber();
        } else if (schema.equals("Timestamp")) {
            return Util.toTimestamp(readNumber());
        } else if (schema.equals("String")) {
            return readString();
        } else if (schema.equals("byte[]")) {
            return readBytes();
        } else if (schema.equals("InetAddress")) {
            try {
                byte[] bytes = readBytes();
                return bytes != null ? InetAddress.getByAddress(bytes) : null;
            } catch (UnknownHostException e) {
                throw new FingerprintException("incorrect inet address", e);
            }
        } else if (schema instanceof String type && type.endsWith("[]")) {
            Long size = readNumber();
            if (size == null) {
                return null;
            }
            long edge = in.available() - size.intValue();
            if (edge < 0) {
                throw new FingerprintException("incorrect size");
            }
            List<Object> list = new ArrayList<>();
            String elementType = type.substring(0, type.length() - 2);
            while (in.available() > edge) {
                list.add(read(elementType));
            }
            return list;
        } else if (schema.getClass().isArray()) {
            if (!FieldWithSchema.class.isAssignableFrom(schema.getClass().componentType())) {
                throw new FingerprintException(
                    String.format(
                        "fingerprint schema should be a String or a FieldWithSchema[], but got %s",
                        schema.getClass()
                    )
                );
            }
            assert schema instanceof FieldWithSchema[];
            return read((FieldWithSchema[]) schema);
        } else {
            throw new FingerprintException(String.format("unknown field type in the schema: %s", schema));
        }
    }

    public Fingerprint read(Function<Integer, FieldWithSchema[]> schemaProvider) {
        Long version = readNumber();
        if (version == null) {
            return null;
        }

        FieldWithSchema[] schema = schemaProvider.apply(version.intValue());
        if (schema == null) {
            throw new FingerprintException(String.format("no schema for version %d", version));
        }

        Fingerprint fingerprint = new Fingerprint(version.intValue());
        for (FieldWithSchema field : schema) {
            fingerprint.put(field.name(), read(field.schema()));
        }
        return fingerprint;
    }

    public int available() {
        return in.available();
    }

    @Override
    public void close() {
        try {
            in.close();
        } catch (IOException e) {
            throw new CryptoException(e);
        }
    }

}
