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

    public static String secretToMnemonic(String secret) {
        byte[] entropy = Util.base64decode(secret);
        StringBuilder buf = new StringBuilder();
        new MnemonicGenerator(English.INSTANCE).createMnemonic(entropy, buf::append);
        return buf.toString();
    }

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

    public static byte[] rawPublicKey(ECPublicKey publicKey) {
        byte[] x = encodeUnsigned(publicKey.getW().getAffineX(), PUBLIC_KEY_LENGTH / 2);
        byte[] y = encodeUnsigned(publicKey.getW().getAffineY(), PUBLIC_KEY_LENGTH / 2);
        byte[] rawKey = new byte[x.length + y.length];
        System.arraycopy(x, 0, rawKey, 0, x.length);
        System.arraycopy(y, 0, rawKey, x.length, y.length);
        return rawKey;
    }

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

    public static byte[] rawPrivateKey(ECPrivateKey privateKey) {
        return encodeUnsigned(privateKey.getS(), PRIVATE_KEY_LENGTH);
    }

    public static ECPrivateKey rawToPrivateKey(byte[] rawKey) {
        ECParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(EC_CURVE);
        ECPrivateKeySpec keySpec = new ECPrivateKeySpec(decodeUnsigned(rawKey), parameterSpec);
        try {
            return (ECPrivateKey) KeyFactory.getInstance("EC", "BC").generatePrivate(keySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    public static String token() {
        byte[] random = new byte[32];
        try {
            new SecureRandom().nextBytes(random);
            return Util.base64urlencode(MessageDigest.getInstance("SHA-256", "BC").digest(random));
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    public static byte[] fingerprint(Fingerprint fingerprint, FieldWithSchema[] schema) {
        try (FingerprintWriter writer = new FingerprintWriter()) {
            writer.append(fingerprint, schema);
            return writer.toBytes();
        }
    }

    public static byte[] fingerprint(String text) {
        try (FingerprintWriter writer = new FingerprintWriter()) {
            writer.append(text);
            return writer.toBytes();
        }
    }

    public static RestoredFingerprint restoreFingerprint(byte[] bytes, FieldWithSchema[] schema) {
        return restoreFingerprint(bytes, version -> schema);
    }

    public static RestoredFingerprint restoreFingerprint(
        byte[] bytes, Function<Integer, FieldWithSchema[]> schemaProvider
    ) {
        try (FingerprintReader reader = new FingerprintReader(bytes)) {
            Fingerprint fingerprint = reader.read(schemaProvider);
            return new RestoredFingerprint(fingerprint, reader.available());
        }
    }

    public static byte[] digest(byte[] fingerprint) {
        Digest digest = DigestFactory.getDigest(Rules.DIGEST_ALGORITHM);
        digest.update(fingerprint, 0, fingerprint.length);
        byte[] result = new byte[digest.getDigestSize()];
        digest.doFinal(result, 0);
        log.debug("Digest: " + LogUtil.format(result));
        return result;
    }

    public static List<byte[]> digest(Collection<byte[]> fingerprint) {
        return fingerprint != null ? fingerprint.stream().map(CryptoUtil::digest).toList() : null;
    }

    public static byte[] sign(byte[] fingerprint, byte[] privateKey) {
        return sign(fingerprint, rawToPrivateKey(privateKey));
    }

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

    public static boolean verifySignature(byte[] fingerprint, byte[] signature, byte[] publicKey) {
        return verifySignature(fingerprint, signature, rawToPublicKey(publicKey));
    }

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
