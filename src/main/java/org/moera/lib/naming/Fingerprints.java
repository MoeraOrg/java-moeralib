package org.moera.lib.naming;

import java.sql.Timestamp;

import org.moera.lib.crypto.CryptoUtil;
import org.moera.lib.crypto.FieldWithSchema;
import org.moera.lib.crypto.Fingerprint;

public class Fingerprints {

    private static final FieldWithSchema[] PUT_CALL0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("name", "String"),
        new FieldWithSchema("generation", "int"),
        new FieldWithSchema("updating_key", "byte[]"),
        new FieldWithSchema("node_uri", "String"),
        new FieldWithSchema("signing_key", "byte[]"),
        new FieldWithSchema("valid_from", "Timestamp"),
        new FieldWithSchema("previous_digest", "byte[]")
    };

    public static byte[] putCall(
        String name, int generation, byte[] updatingKey, String nodeUri, byte[] signingKey, Timestamp validFrom,
        byte[] previousDigest
    ) {
        return putCall0(name, generation, updatingKey, nodeUri, signingKey, validFrom, previousDigest);
    }

    public static byte[] putCall0(
        String name, int generation, byte[] updatingKey, String nodeUri, byte[] signingKey, Timestamp validFrom,
        byte[] previousDigest
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("name", name);
        fingerprint.put("generation", generation);
        fingerprint.put("updating_key", updatingKey);
        fingerprint.put("node_uri", nodeUri);
        fingerprint.put("signing_key", signingKey);
        fingerprint.put("valid_from", validFrom);
        fingerprint.put("previous_digest", previousDigest);

        return CryptoUtil.fingerprint(fingerprint, PUT_CALL0_SCHEMA);
    }

}
