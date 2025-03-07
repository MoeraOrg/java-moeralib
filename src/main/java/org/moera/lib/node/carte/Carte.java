package org.moera.lib.node.carte;

import java.net.InetAddress;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.moera.lib.crypto.CryptoUtil;
import org.moera.lib.naming.NodeName;
import org.moera.lib.node.Fingerprints;
import org.moera.lib.util.Util;

/**
 * This class provides functionality for generating and handling a cryptographic "carte".
 * A carte is a signed token-like construct that incorporates specific user, node, and
 * time-related information to ensure security and authenticity.
 */
public class Carte {

    private static final Duration TTL = Duration.of(10, ChronoUnit.MINUTES);

    /**
     * Calculates the planned deadline of a carte starting at the given time.
     *
     * @param beginning the time from which the deadline will be calculated
     * @return the calculated deadline
     */
    public static Instant getDeadline(Instant beginning) {
        return beginning.plus(TTL);
    }

    /**
     * Generates a cryptographically signed carte.
     *
     * @param ownerName the name of the node authenticating with the carte
     * @param address if set, the carte is valid for authentication from the given IP address only
     * @param beginning the beginning time of the carte's life
     * @param signingKey the private key used to sign the carte
     * @param nodeName if set, the carte is valid for authentication on the specified node only
     * @param clientScope the list of permissions granted to the carte
     * @param adminScope the list of additional administrative permissions (of those granted to the carte's owner by
     *                  the target node) granted to the carte
     * @return the signed carte
     */
    public static String generate(
        String ownerName,
        InetAddress address,
        Instant beginning,
        PrivateKey signingKey,
        String nodeName,
        long clientScope,
        long adminScope
    ) {
        var salt = new byte[8];
        new SecureRandom().nextBytes(salt);
        byte[] fingerprint = Fingerprints.carte(
            NodeName.expand(ownerName),
            address,
            Timestamp.from(beginning),
            Timestamp.from(getDeadline(beginning)),
            NodeName.expand(nodeName),
            clientScope,
            adminScope,
            salt
        );
        byte[] signature = CryptoUtil.sign(fingerprint, (ECPrivateKey) signingKey);
        byte[] carte = new byte[fingerprint.length + signature.length];
        System.arraycopy(fingerprint, 0, carte, 0, fingerprint.length);
        System.arraycopy(signature, 0, carte, fingerprint.length, signature.length);
        return Util.base64urlencode(carte);
    }

}
