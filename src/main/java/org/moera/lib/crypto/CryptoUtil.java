package org.moera.lib.crypto;

import static org.moera.lib.Rules.EC_CURVE;
import static org.moera.lib.Rules.PRIVATE_KEY_LENGTH;
import static org.moera.lib.Rules.PUBLIC_KEY_LENGTH;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import io.github.novacrypto.bip39.JavaxPbkdf2WithHmacSha512;
import io.github.novacrypto.bip39.MnemonicGenerator;
import io.github.novacrypto.bip39.SeedCalculator;
import io.github.novacrypto.bip39.Words;
import io.github.novacrypto.bip39.wordlists.English;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECPoint;
import org.moera.lib.Rules;
import org.moera.lib.util.LogUtil;
import org.moera.lib.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class that provides cryptographic functions for key generation,
 * signature creation, fingerprinting, verification, and mnemonic handling.
 */
public class CryptoUtil {

    private static final Logger log = LoggerFactory.getLogger(CryptoUtil.class);

    private static byte[] encodeUnsigned(BigInteger v, int len) {
        byte[] r = v.toByteArray();
        byte[] e = new byte[len];
        int srcPos = r.length < len ? 0 : r.length - len;
        int dstPos = r.length < len ? len - r.length : 0;
        System.arraycopy(r, srcPos, e, dstPos, r.length - srcPos);
        return e;
    }

    private static BigInteger decodeUnsigned(byte[] e) {
        byte[] r = new byte[e.length + 1];
        System.arraycopy(e, 0, r, r.length - e.length, e.length);
        return new BigInteger(r);
    }

    /**
     * Generates an elliptic curve key pair using the standard EC curve used in Moera
     * ({@code Rules.EC_CURVE}) and a secure random generator.
     * The generated key pair consists of a private key and a public key.
     *
     * @return a {@code KeyPair} object containing the generated elliptic curve keys
     * @throws CryptoException if a cryptographic error occurs during key pair generation
     */
    public static KeyPair generateKey() {
        ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec(EC_CURVE);
        SecureRandom random = new SecureRandom();

        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "BC");
            keyPairGenerator.initialize(ecSpec, random);
            return new KeyPair(keyPairGenerator.generateKeyPair());
        } catch (GeneralSecurityException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Generates a new {@link MnemonicKey} containing a securely generated mnemonic phrase,
     * corresponding secret in base64 format, and a public key derived from the mnemonic.
     * The mnemonic and public key are generated using the elliptic curve specified by
     * {@code Rules.EC_CURVE}.
     *
     * @return A new instance of {@link MnemonicKey} containing the secret, mnemonic phrase,
     *         and derived public key.
     * @throws CryptoException if any cryptographic operation fails during the key generation process.
     */
    public static MnemonicKey generateMnemonicKey() {
        try {
            SecureRandom random = new SecureRandom();

            byte[] entropy = new byte[Words.TWENTY_FOUR.byteLength()];
            ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec(Rules.EC_CURVE);
            KeyFactory keyFactory = KeyFactory.getInstance("EC", "BC");

            String secret = null;
            StringBuilder mnemonic = null;

            BigInteger p = ecSpec.getCurve().getField().getCharacteristic();
            BigInteger d = BigInteger.ZERO;
            while (d.equals(BigInteger.ZERO)) {
                random.nextBytes(entropy);

                mnemonic = new StringBuilder();
                new MnemonicGenerator(English.INSTANCE).createMnemonic(entropy, mnemonic::append);
                byte[] seed = new SeedCalculator(JavaxPbkdf2WithHmacSha512.INSTANCE)
                    .calculateSeed(mnemonic.toString(), "");
                secret = Util.base64encode(entropy);

                d = new BigInteger(1, seed).remainder(p);
            }
            ECPoint q = ecSpec.getG().multiply(d);
            ECPublicKeySpec pubSpec = new ECPublicKeySpec(q, ecSpec);
            ECPublicKey publicKey = (ECPublicKey) keyFactory.generatePublic(pubSpec);

            return new MnemonicKey(secret, mnemonic.toString(), publicKey);
        } catch (GeneralSecurityException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Converts a Base64-encoded secret into a mnemonic phrase using the BIP39 standard.
     * <p>
     * The method decodes the provided Base64 secret into entropy bytes, then generates
     * a mnemonic phrase using the English word list. The resulting mnemonic is a human-readable
     * sequence of words corresponding to the entropy.
     *
     * @param secret the Base64-encoded secret to be transformed into a mnemonic phrase
     * @return the mnemonic phrase representing the decoded entropy
     */
    public static String secretToMnemonic(String secret) {
        byte[] entropy = Util.base64decode(secret);
        StringBuilder buf = new StringBuilder();
        new MnemonicGenerator(English.INSTANCE).createMnemonic(entropy, buf::append);
        return buf.toString();
    }

    /**
     * Converts a mnemonic phrase into an elliptic curve private key.
     * The mnemonic is processed to generate a seed, which is used to derive the private key.
     *
     * @param mnemonic A valid mnemonic phrase used to generate the private key.
     * @return The derived elliptic curve private key.
     * @throws CryptoException If a cryptographic error occurs during key generation.
     */
    public static ECPrivateKey mnemonicToPrivateKey(String mnemonic) {
        byte[] seed = new SeedCalculator(JavaxPbkdf2WithHmacSha512.INSTANCE).calculateSeed(mnemonic, "");

        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC", "BC");
            ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec(Rules.EC_CURVE);

            BigInteger p = ecSpec.getCurve().getField().getCharacteristic();
            BigInteger d = new BigInteger(1, seed).remainder(p);
            ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(d, ecSpec);
            return (ECPrivateKey) keyFactory.generatePrivate(privateKeySpec);
        } catch (GeneralSecurityException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Converts an {@link ECPublicKey} to its raw representation in a byte array format.
     * The raw representation includes the X and Y affine coordinates of the key,
     * encoded as unsigned integers.
     *
     * @param publicKey the {@link ECPublicKey} to be converted to its raw byte array format
     * @return a byte array containing the raw representation of the public key
     */
    public static byte[] rawPublicKey(ECPublicKey publicKey) {
        byte[] x = encodeUnsigned(publicKey.getW().getAffineX(), PUBLIC_KEY_LENGTH / 2);
        byte[] y = encodeUnsigned(publicKey.getW().getAffineY(), PUBLIC_KEY_LENGTH / 2);
        byte[] rawKey = new byte[x.length + y.length];
        System.arraycopy(x, 0, rawKey, 0, x.length);
        System.arraycopy(y, 0, rawKey, x.length, y.length);
        return rawKey;
    }

    /**
     * Converts a raw byte array representation of an EC public key into an {@link ECPublicKey} object.
     *
     * @param rawKey the raw byte array representing the EC public key. It is expected
     *               to contain the concatenated X and Y coordinates of the elliptic curve point.
     * @return the {@link ECPublicKey} object created from the provided raw byte array.
     * @throws CryptoException if the key cannot be generated due to invalid input,
     *                         missing algorithm/provider, or an invalid key specification.
     */
    public static ECPublicKey rawToPublicKey(byte[] rawKey) {
        byte[] x = new byte[PUBLIC_KEY_LENGTH / 2];
        byte[] y = new byte[PUBLIC_KEY_LENGTH / 2];
        System.arraycopy(rawKey, 0, x, 0, x.length);
        System.arraycopy(rawKey, x.length, y, 0, y.length);
        ECParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(EC_CURVE);
        ECPoint w = parameterSpec.getCurve().createPoint(decodeUnsigned(x), decodeUnsigned(y));
        ECPublicKeySpec keySpec = new ECPublicKeySpec(w, parameterSpec);

        try {
            return (ECPublicKey) KeyFactory.getInstance("EC", "BC").generatePublic(keySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Converts the provided {@link ECPrivateKey} into its raw byte representation.
     *
     * @param privateKey the {@link ECPrivateKey} instance to be converted into a raw byte array
     * @return a byte array representing the raw form of the given private key
     */
    public static byte[] rawPrivateKey(ECPrivateKey privateKey) {
        return encodeUnsigned(privateKey.getS(), PRIVATE_KEY_LENGTH);
    }

    /**
     * Converts a raw private key represented as a byte array into an {@link ECPrivateKey} instance
     * using the standard Moera elliptic curve ({@code Rules.EC_CURVE}) parameters.
     *
     * @param rawKey the raw private key as a byte array
     * @return an {@link ECPrivateKey} instance corresponding to the provided raw key
     * @throws CryptoException if an error occurs during the conversion process, such as invalid key specification
     *         or issues with the cryptographic provider
     */
    public static ECPrivateKey rawToPrivateKey(byte[] rawKey) {
        ECParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(EC_CURVE);
        ECPrivateKeySpec keySpec = new ECPrivateKeySpec(decodeUnsigned(rawKey), parameterSpec);
        try {
            return (ECPrivateKey) KeyFactory.getInstance("EC", "BC").generatePrivate(keySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Generates a secure random token encoded in Base64 URL format.
     *
     * @return Base64 URL-encoded token string.
     * @throws CryptoException If the specified cryptographic algorithm or provider is not available.
     */
    public static String token() {
        byte[] random = new byte[32];
        try {
            new SecureRandom().nextBytes(random);
            return Util.base64urlencode(MessageDigest.getInstance("SHA-256", "BC").digest(random));
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Computes the byte array representation of a given fingerprint using the provided schema.
     *
     * @param fingerprint the {@link Fingerprint} object to be converted into bytes
     * @param schema the schema that describes the structure of the fingerprint
     * @return a byte array representing the serialized fingerprint
     */
    public static byte[] fingerprint(Fingerprint fingerprint, FieldWithSchema[] schema) {
        try (FingerprintWriter writer = new FingerprintWriter()) {
            writer.append(fingerprint, schema);
            return writer.toBytes();
        }
    }

    /**
     * Generates a fingerprint of the given text.
     *
     * @param text the input text to be fingerprinted
     * @return a byte array representing the fingerprint of the input text
     * @throws CryptoException if an error occurs during fingerprint generation
     */
    public static byte[] fingerprint(String text) {
        try (FingerprintWriter writer = new FingerprintWriter()) {
            writer.append(text);
            return writer.toBytes();
        }
    }

    /**
     * Restores a fingerprint object from the given byte array using the provided schema.
     *
     * @param bytes the byte array containing the serialized fingerprint data
     * @param schema the schema of the fingerprint
     * @return a {@code RestoredFingerprint} object containing the reconstructed fingerprint and the number of bytes
     *         remaining in the input array
     */
    public static RestoredFingerprint restoreFingerprint(byte[] bytes, FieldWithSchema[] schema) {
        return restoreFingerprint(bytes, version -> schema);
    }

    /**
     * Restores a fingerprint object from the given byte array using the provided schema.
     *
     * @param bytes the byte array containing the serialized representation of the fingerprint
     * @param schemaProvider a function that provides the schema for a given fingerprint version
     * @return a {@code RestoredFingerprint} object containing the reconstructed fingerprint and the number of bytes
     *         remaining in the input array
     */
    public static RestoredFingerprint restoreFingerprint(
        byte[] bytes, Function<Integer, FieldWithSchema[]> schemaProvider
    ) {
        try (FingerprintReader reader = new FingerprintReader(bytes)) {
            Fingerprint fingerprint = reader.read(schemaProvider);
            return new RestoredFingerprint(fingerprint, reader.available());
        }
    }

    /**
     * Computes the cryptographic digest of the provided fingerprint using the standard digest algorithm
     * ({@code Rules.DIGEST_ALGORITHM}).
     *
     * @param fingerprint the byte array containing the fingerprint to be processed
     * @return a byte array containing the computed digest
     */
    public static byte[] digest(byte[] fingerprint) {
        Digest digest = DigestFactory.getDigest(Rules.DIGEST_ALGORITHM);
        digest.update(fingerprint, 0, fingerprint.length);
        byte[] result = new byte[digest.getDigestSize()];
        digest.doFinal(result, 0);
        log.debug("Digest: " + LogUtil.format(result));
        return result;
    }

    /**
     * Hashes each byte array in the provided collection using the standard cryptographic digest algorithm
     * ({@code Rules.DIGEST_ALGORITHM}).
     *
     * @param fingerprint a collection of byte arrays to be processed; each array will be
     *                    hashed individually.
     * @return a list of hashed byte arrays corresponding to the inputs, or {@code null}
     *         if the input is {@code null}.
     */
    public static List<byte[]> digest(Collection<byte[]> fingerprint) {
        return fingerprint != null ? fingerprint.stream().map(CryptoUtil::digest).toList() : null;
    }

    /**
     * Signs the given fingerprint using the specified private key.
     *
     * @param fingerprint the data to be signed, represented as a byte array
     * @param privateKey the private key to be used for signing the fingerprint, in the raw format
     * @return the resulting signature as a byte array
     * @throws CryptoException if an error occurs during the signing process
     */
    public static byte[] sign(byte[] fingerprint, byte[] privateKey) {
        return sign(fingerprint, rawToPrivateKey(privateKey));
    }

    /**
     * Signs the given fingerprint data using the specified private key.
     *
     * @param fingerprint the data to be signed, represented as a byte array.
     * @param privateKey the EC private key to be used for generating the signature.
     * @return the resulting signature as a byte array
     * @throws CryptoException if an error occurs during the signing process
     */
    public static byte[] sign(byte[] fingerprint, ECPrivateKey privateKey) {
        try {
            Signature signature = Signature.getInstance(Rules.SIGNATURE_ALGORITHM, "BC");
            signature.initSign(privateKey, new SecureRandom());
            signature.update(fingerprint);
            byte[] result = signature.sign();
            log.debug("Signature: " + LogUtil.format(result));
            return result;
        } catch (GeneralSecurityException e) {
            throw new CryptoException(e);
        }
    }

    /**
     * Verifies a digital signature using a provided fingerprint, signature, and public key.
     *
     * @param fingerprint the byte array representation of the data (fingerprint) to be validated
     * @param signature the byte array representing the digital signature to verify
     * @param publicKey the byte array of the raw public key used for verification
     * @return {@code true} if the signature is valid and matches the fingerprint using the public key,
     *         {@code false} otherwise
     * @throws CryptoException if any cryptographic error occurs during verification
     */
    public static boolean verifySignature(byte[] fingerprint, byte[] signature, byte[] publicKey) {
        return verifySignature(fingerprint, signature, rawToPublicKey(publicKey));
    }

    /**
     * Verifies a digital signature using a provided fingerprint, signature, and public key.
     *
     * @param fingerprint the byte array representation of the data (fingerprint) to be validated
     * @param signature the byte array representing the digital signature to verify
     * @param publicKey the ECDSA public key used to verify the signature
     * @return {@code true} if the signature is valid and matches the fingerprint using the public key,
     *         {@code false} otherwise
     * @throws CryptoException if any cryptographic error occurs during verification
     */
    public static boolean verifySignature(byte[] fingerprint, byte[] signature, ECPublicKey publicKey) {
        try {
            Signature sign = Signature.getInstance(Rules.SIGNATURE_ALGORITHM, "BC");
            sign.initVerify(publicKey);
            sign.update(fingerprint);
            log.debug("Verifying signature: " + LogUtil.format(signature));
            boolean correct = sign.verify(signature);
            log.debug("Signature is {}", correct ? "correct" : "incorrect");
            return correct;
        } catch (SignatureException e) {
            log.debug("Signature is incorrect: " + e.getMessage());
            return false;
        } catch (GeneralSecurityException e) {
            throw new CryptoException(e);
        }
    }

}
