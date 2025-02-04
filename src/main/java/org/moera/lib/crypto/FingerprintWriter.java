package org.moera.lib.crypto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.moera.lib.util.LogUtil;
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
        } else if (obj instanceof InetAddress value) {
            append(value.getAddress());
        } else if (obj instanceof List<?> value) {
            append(value);
        } else {
            throw new FingerprintException(obj.getClass(), "class is not a primitive fingerprint element");
        }
    }

    public void append(Fingerprint fingerprint, Object[] schema) {
        log.trace("Fingerprinting {} (ver {})", fingerprint.getClass().getName(), fingerprint.getVersion());
        append(fingerprint.getVersion());
        try {
            for (Object field : schema) {
                if (field instanceof FieldWithSchema fieldWithSchema) {
                    String fieldName = fieldWithSchema.getName();
                    log.trace("field: {}", fieldName);
                    Object value = fingerprint.get(fieldName);
                    if (value instanceof Fingerprint fingerprintValue) {
                        append(fingerprintValue, fieldWithSchema.getSchema());
                    } else {
                        throw new FingerprintException(
                                fingerprint.getClass(),
                                String.format("fingerprint field '%s' should be a Fingerprint", fieldName)
                        );
                    }
                } else {
                    if (field instanceof String fieldName) {
                        log.trace("field: {}", fieldName);
                        append(fingerprint.get(fieldName));
                    } else {
                        throw new FingerprintException(
                                fingerprint.getClass(),
                                "fingerprint schema element should be a String or a FieldWithSchema"
                        );
                    }
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
