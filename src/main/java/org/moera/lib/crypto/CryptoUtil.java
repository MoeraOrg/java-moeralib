package org.moera.lib.crypto;

import static org.moera.lib.Rules.EC_CURVE;
import static org.moera.lib.Rules.PRIVATE_KEY_LENGTH;
import static org.moera.lib.Rules.PUBLIC_KEY_LENGTH;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;

import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECPoint;
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

    public static byte[] toRawPublicKey(ECPublicKey publicKey) {
        byte[] x = encodeUnsigned(publicKey.getW().getAffineX(), PUBLIC_KEY_LENGTH / 2);
        byte[] y = encodeUnsigned(publicKey.getW().getAffineY(), PUBLIC_KEY_LENGTH / 2);
        byte[] rawKey = new byte[x.length + y.length];
        System.arraycopy(x, 0, rawKey, 0, x.length);
        System.arraycopy(y, 0, rawKey, x.length, y.length);
        return rawKey;
    }

    public static byte[] toUncompressedPublicKey(ECPublicKey publicKey) {
        byte[] raw = toRawPublicKey(publicKey);
        byte[] uncompressed = new byte[raw.length + 1];
        uncompressed[0] = 0x04;
        System.arraycopy(raw, 0, uncompressed, 1, raw.length);
        return uncompressed;
    }

    public static ECPublicKey toPublicKey(byte[] rawKey) {
        return toPublicKey(rawKey, EC_CURVE);
    }

    public static ECPublicKey toPublicKey(byte[] rawKey, String curve) {
        byte[] x = new byte[PUBLIC_KEY_LENGTH / 2];
        byte[] y = new byte[PUBLIC_KEY_LENGTH / 2];
        System.arraycopy(rawKey, 0, x, 0, x.length);
        System.arraycopy(rawKey, x.length, y, 0, y.length);
        ECParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(curve);
        ECPoint w = parameterSpec.getCurve().createPoint(decodeUnsigned(x), decodeUnsigned(y));
        ECPublicKeySpec keySpec = new ECPublicKeySpec(w, parameterSpec);

        try {
            return (ECPublicKey) KeyFactory.getInstance("EC", "BC").generatePublic(keySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

    public static byte[] toRawPrivateKey(ECPrivateKey privateKey) {
        return encodeUnsigned(privateKey.getS(), PRIVATE_KEY_LENGTH);
    }

    public static ECPrivateKey toPrivateKey(byte[] rawKey) {
        return toPrivateKey(rawKey, EC_CURVE);
    }

    public static ECPrivateKey toPrivateKey(byte[] rawKey, String curve) {
        ECParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec(curve);
        ECPrivateKeySpec keySpec = new ECPrivateKeySpec(decodeUnsigned(rawKey), parameterSpec);
        try {
            return (ECPrivateKey) KeyFactory.getInstance("EC", "BC").generatePrivate(keySpec);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new CryptoException(e);
        }
    }

}
