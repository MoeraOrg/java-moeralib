package org.moera.lib.crypto;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.moera.lib.util.Util;

/**
 * Utility class for password hashing and validation.
 */
public class Password {

    /**
     * Generates a hash for the given password using a randomly generated salt.
     *
     * @param password the password to be hashed
     * @return the hashed password as a Base64-encoded string that includes the hash and the salt
     */
    public static String hash(String password) {
        byte[] salt = new byte[Long.BYTES];
        new SecureRandom().nextBytes(salt);
        return hash(password, salt);
    }

    /**
     * Validates if the provided password matches the given hash, using the salt embedded in the hash.
     *
     * @param hash the Base64-encoded string containing the hash and the salt
     * @param password the password to validate against the hash
     * @return {@code true} if the password matches the hash, {@code false} otherwise
     */
    public static boolean validate(String hash, String password) {
        byte[] data = Util.base64decode(hash);
        byte[] salt = new byte[Long.BYTES];
        System.arraycopy(data, data.length - salt.length, salt, 0, salt.length);
        return hash(password, salt).equals(hash);
    }

    private static String hash(String password, byte[] salt) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(password.getBytes(StandardCharsets.UTF_8));
            messageDigest.update(salt);
            byte[] sha = messageDigest.digest();
            byte[] result = new byte[sha.length + salt.length];
            System.arraycopy(sha, 0, result, 0, sha.length);
            System.arraycopy(salt, 0, result, sha.length, salt.length);
            return Util.base64encode(result);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException(e);
        }
    }

}
