package org.moera.lib.naming;

import org.moera.lib.crypto.CryptoUtil;
import org.moera.lib.crypto.Fingerprint;

public class Fingerprints {

    private static final Object[] PUT_CALL0_SCHEMA = new Object[] {
        "name",
        "generation",
        "updating_key",
        "node_uri",
        "signing_key",
        "valid_from",
        "previous_digest",
    };

    public static byte[] putCall(
        String name, int generation, byte[] updatingKey, String nodeUri, byte[] signingKey, long validFrom,
        byte[] previousDigest
    ) {
        return putCall0(name, generation, updatingKey, nodeUri, signingKey, validFrom, previousDigest);
    }

    public static byte[] putCall0(
        String name, int generation, byte[] updatingKey, String nodeUri, byte[] signingKey, long validFrom,
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
