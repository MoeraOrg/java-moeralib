package org.moera.lib.crypto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.List;

import org.moera.lib.util.LogUtil;
import org.moera.lib.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FingerprintWriter implements AutoCloseable {

    private static final Logger log = LoggerFactory.getLogger(FingerprintWriter.class);

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    FingerprintWriter() {
    }

    private void appendNull() {
        log.trace("value: null");
        out.write((byte) 0xff);
    }

    private void append(String str) {
        if (str == null) {
            appendNull();
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (log.isTraceEnabled()) {
            log.trace("value: {}", LogUtil.format(bytes));
        }
        append(bytes.length);
        try {
            out.write(bytes);
        } catch (IOException e) {
            throw new CryptoException(e);
        }
    }

    private void append(boolean b) {
        log.trace("value: {}", LogUtil.format(b));
        out.write((byte) (b ? 1 : 0));
    }

    private void append(long l) {
        log.trace("value: {}", LogUtil.format(l));
        int len;
        if (l < 0xfc) {
            len = 1;
        } else if (l <= 0xffff) {
            out.write((byte) 0xfc);
            len = 2;
        } else if (l <= 0xffffffffL) {
            out.write((byte) 0xfd);
            len = 4;
        } else {
            out.write((byte) 0xfe);
            len = 8;
        }
        for (int i = 0; i < len; i++) {
            out.write((byte) (l & 0xff));
            l = l >> 8;
        }
    }

    private void append(byte[] bytes) {
        append(bytes.length);
        if (log.isTraceEnabled()) {
            log.trace("value: {}", LogUtil.format(bytes));
        }
        try {
            out.write(bytes);
        } catch (IOException e) {
            throw new CryptoException(e);
        }
    }

    private void append(List<?> objects) {
        if (log.isTraceEnabled()) {
            log.trace("list: {}", LogUtil.format(objects.size()));
        }
        try (FingerprintWriter writer = new FingerprintWriter()) {
            objects.forEach(writer::append);
            append(writer.toBytes());
        }
    }

    private void append(Object obj) {
        if (obj == null) {
            appendNull();
            return;
        }
        if (obj instanceof Boolean value) {
            append(value.booleanValue());
        } else if (obj instanceof Byte value) {
            append(value.longValue());
        } else if (obj instanceof Short value) {
            append(value.longValue());
        } else if (obj instanceof Integer value) {
            append(value.longValue());
        } else if (obj instanceof Long value) {
            append(value.longValue());
        } else if (obj instanceof String value) {
            append(value);
        } else if (obj instanceof byte[] value) {
            append(value);
        } else if (obj instanceof Timestamp value) {
            append(Util.toEpochSecond(value));
        } else if (obj instanceof InetAddress value) {
            append(value.getAddress());
        } else if (obj instanceof List<?> value) {
            append(value);
        } else {
            throw new FingerprintException(
                String.format("%s is not a primitive fingerprint element", obj.getClass().getName())
            );
        }
    }

    public void append(Fingerprint fingerprint, FieldWithSchema[] schema) {
        log.trace("Fingerprinting {} (ver {})", fingerprint.getClass().getName(), fingerprint.getVersion());
        append(fingerprint.getVersion());
        try {
            for (FieldWithSchema field : schema) {
                if (field.schema().getClass().isArray()) {
                    if (!FieldWithSchema.class.isAssignableFrom(field.schema().getClass().componentType())) {
                        throw new FingerprintException(
                            String.format(
                                "fingerprint schema should be a String or a FieldWithSchema[], but got %s",
                                field.schema().getClass()
                            )
                        );
                    }
                    String fieldName = field.name();
                    log.trace("field: {}", fieldName);
                    Object value = fingerprint.get(fieldName);
                    if (value instanceof Fingerprint fingerprintValue) {
                        append(fingerprintValue, (FieldWithSchema[]) field.schema());
                    } else {
                        throw new FingerprintException(
                            String.format("fingerprint field '%s' should be a Fingerprint", fieldName)
                        );
                    }
                } else {
                    log.trace("field: {}", field.name());
                    append(fingerprint.get(field.name()));
                }
            }
        } finally {
            log.trace("End of fingerprint {}", fingerprint.getClass().getName());
        }
    }

    @Override
    public void close() {
        try {
            out.close();
        } catch (IOException e) {
            throw new CryptoException(e);
        }
    }

    public byte[] toBytes() {
        return out.toByteArray();
    }

}
