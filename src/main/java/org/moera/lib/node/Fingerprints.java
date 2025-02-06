package org.moera.lib.node;

// This file is generated

import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.List;

import org.moera.lib.crypto.CryptoUtil;
import org.moera.lib.crypto.FieldWithSchema;
import org.moera.lib.crypto.Fingerprint;

public class Fingerprints {

    private static final FieldWithSchema[] ATTACHMENT0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("digest", "byte[]"),
    };

    private static final FieldWithSchema[] CARTE2_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("address", "InetAddress"),
        new FieldWithSchema("beginning", "Timestamp"),
        new FieldWithSchema("deadline", "Timestamp"),
        new FieldWithSchema("node_name", "String"),
        new FieldWithSchema("client_scope", "long"),
        new FieldWithSchema("admin_scope", "long"),
        new FieldWithSchema("salt", "byte[]"),
    };

    private static final FieldWithSchema[] CARTE1_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("address", "InetAddress"),
        new FieldWithSchema("beginning", "Timestamp"),
        new FieldWithSchema("deadline", "Timestamp"),
        new FieldWithSchema("node_name", "String"),
        new FieldWithSchema("auth_category", "byte"),
        new FieldWithSchema("salt", "byte[]"),
    };

    private static final FieldWithSchema[] CARTE0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("address", "InetAddress"),
        new FieldWithSchema("beginning", "Timestamp"),
        new FieldWithSchema("deadline", "Timestamp"),
        new FieldWithSchema("permissions", "byte"),
        new FieldWithSchema("salt", "byte[]"),
    };

    private static final FieldWithSchema[] COMMENT0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("posting_fingerprint", "byte[]"),
        new FieldWithSchema("replied_to_fingerprint", "byte[]"),
        new FieldWithSchema("body_src_hash", "byte[]"),
        new FieldWithSchema("body_src_format", "String"),
        new FieldWithSchema("body", "String"),
        new FieldWithSchema("body_format", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
        new FieldWithSchema("permissions", "byte"),
        new FieldWithSchema("attachments", "byte[][]"),
    };

    private static final FieldWithSchema[] NOTIFICATION_PACKET1_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("id", "String"),
        new FieldWithSchema("node_name", "String"),
        new FieldWithSchema("full_name", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
        new FieldWithSchema("type", "String"),
        new FieldWithSchema("notification", "String"),
    };

    private static final FieldWithSchema[] NOTIFICATION_PACKET0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("id", "String"),
        new FieldWithSchema("node_name", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
        new FieldWithSchema("type", "String"),
        new FieldWithSchema("notification", "String"),
    };

    private static final FieldWithSchema[] POSTING1_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("receiver_name", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("body_src_hash", "byte[]"),
        new FieldWithSchema("body_src_format", "String"),
        new FieldWithSchema("body", "String"),
        new FieldWithSchema("body_format", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
        new FieldWithSchema("permissions", "byte"),
        new FieldWithSchema("attachments", "byte[][]"),
    };

    private static final FieldWithSchema[] POSTING0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("receiver_name", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("body_src_hash", "byte[]"),
        new FieldWithSchema("body_src_format", "String"),
        new FieldWithSchema("body", "String"),
        new FieldWithSchema("body_format", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
        new FieldWithSchema("permissions", "byte"),
        new FieldWithSchema("attachments", "byte"),
    };

    private static final FieldWithSchema[] PUSH_RELAY_MESSAGE0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("signed_at", "Timestamp"),
    };

    private static final FieldWithSchema[] PUSH_RELAY_REGISTER0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("client_id", "String"),
        new FieldWithSchema("lang", "String"),
        new FieldWithSchema("signed_at", "Timestamp"),
    };

    private static final FieldWithSchema[] REACTION0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("owner_name", "String"),
        new FieldWithSchema("entry_fingerprint", "byte[]"),
        new FieldWithSchema("negative", "boolean"),
        new FieldWithSchema("emoji", "int"),
    };

    private static final FieldWithSchema[] SHERIFF_ORDER0_SCHEMA = new FieldWithSchema[] {
        new FieldWithSchema("object_type", "String"),
        new FieldWithSchema("sheriff_name", "String"),
        new FieldWithSchema("node_name", "String"),
        new FieldWithSchema("feed_name", "String"),
        new FieldWithSchema("entry_fingerprint", "byte[]"),
        new FieldWithSchema("category", "String"),
        new FieldWithSchema("reason_code", "String"),
        new FieldWithSchema("reason_details", "String"),
        new FieldWithSchema("created_at", "Timestamp"),
    };

    public static FieldWithSchema[] getSchema(String objectType, int version) {
        return switch (objectType) {
            case "ATTACHMENT" -> switch (version) {
                case 0 -> ATTACHMENT0_SCHEMA;
                default -> null;
            };
            case "CARTE" -> switch (version) {
                case 2 -> CARTE2_SCHEMA;
                case 1 -> CARTE1_SCHEMA;
                case 0 -> CARTE0_SCHEMA;
                default -> null;
            };
            case "COMMENT" -> switch (version) {
                case 0 -> COMMENT0_SCHEMA;
                default -> null;
            };
            case "NOTIFICATION_PACKET" -> switch (version) {
                case 1 -> NOTIFICATION_PACKET1_SCHEMA;
                case 0 -> NOTIFICATION_PACKET0_SCHEMA;
                default -> null;
            };
            case "POSTING" -> switch (version) {
                case 1 -> POSTING1_SCHEMA;
                case 0 -> POSTING0_SCHEMA;
                default -> null;
            };
            case "PUSH_RELAY_MESSAGE" -> switch (version) {
                case 0 -> PUSH_RELAY_MESSAGE0_SCHEMA;
                default -> null;
            };
            case "PUSH_RELAY_REGISTER" -> switch (version) {
                case 0 -> PUSH_RELAY_REGISTER0_SCHEMA;
                default -> null;
            };
            case "REACTION" -> switch (version) {
                case 0 -> REACTION0_SCHEMA;
                default -> null;
            };
            case "SHERIFF_ORDER" -> switch (version) {
                case 0 -> SHERIFF_ORDER0_SCHEMA;
                default -> null;
            };
            default -> null;
        };
    }

    public static byte[] attachment(byte[] digest) {
        return attachment0(digest);
    }

    public static byte[] attachment0(byte[] digest) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "ATTACHMENT");
        fingerprint.put("digest", digest);

        return CryptoUtil.fingerprint(fingerprint, ATTACHMENT0_SCHEMA);
    }

    public static byte[] carte(
        String ownerName, InetAddress address, Timestamp beginning, Timestamp deadline, String nodeName,
        long clientScope, long adminScope, byte[] salt
    ) {
        return carte2(ownerName, address, beginning, deadline, nodeName, clientScope, adminScope, salt);
    }

    public static byte[] carte2(
        String ownerName, InetAddress address, Timestamp beginning, Timestamp deadline, String nodeName,
        long clientScope, long adminScope, byte[] salt
    ) {
        Fingerprint fingerprint = new Fingerprint(2);
        fingerprint.put("object_type", "CARTE");
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("address", address);
        fingerprint.put("beginning", beginning);
        fingerprint.put("deadline", deadline);
        fingerprint.put("node_name", nodeName);
        fingerprint.put("client_scope", clientScope);
        fingerprint.put("admin_scope", adminScope);
        fingerprint.put("salt", salt);

        return CryptoUtil.fingerprint(fingerprint, CARTE2_SCHEMA);
    }

    public static byte[] carte1(
        String ownerName, InetAddress address, Timestamp beginning, Timestamp deadline, String nodeName,
        byte authCategory, byte[] salt
    ) {
        Fingerprint fingerprint = new Fingerprint(1);
        fingerprint.put("object_type", "CARTE");
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("address", address);
        fingerprint.put("beginning", beginning);
        fingerprint.put("deadline", deadline);
        fingerprint.put("node_name", nodeName);
        fingerprint.put("auth_category", authCategory);
        fingerprint.put("salt", salt);

        return CryptoUtil.fingerprint(fingerprint, CARTE1_SCHEMA);
    }

    public static byte[] carte0(
        String ownerName, InetAddress address, Timestamp beginning, Timestamp deadline, byte permissions, byte[] salt
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "CARTE");
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("address", address);
        fingerprint.put("beginning", beginning);
        fingerprint.put("deadline", deadline);
        fingerprint.put("permissions", permissions);
        fingerprint.put("salt", salt);

        return CryptoUtil.fingerprint(fingerprint, CARTE0_SCHEMA);
    }

    public static byte[] comment(
        String ownerName, byte[] postingFingerprint, byte[] repliedToFingerprint, byte[] bodySrcHash,
        String bodySrcFormat, String body, String bodyFormat, Timestamp createdAt, byte permissions,
        List<byte[]> attachments
    ) {
        return comment0(
            ownerName, postingFingerprint, repliedToFingerprint, bodySrcHash, bodySrcFormat, body, bodyFormat,
            createdAt, permissions, attachments
        );
    }

    public static byte[] comment0(
        String ownerName, byte[] postingFingerprint, byte[] repliedToFingerprint, byte[] bodySrcHash,
        String bodySrcFormat, String body, String bodyFormat, Timestamp createdAt, byte permissions,
        List<byte[]> attachments
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "COMMENT");
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("posting_fingerprint", postingFingerprint);
        fingerprint.put("replied_to_fingerprint", repliedToFingerprint);
        fingerprint.put("body_src_hash", bodySrcHash);
        fingerprint.put("body_src_format", bodySrcFormat);
        fingerprint.put("body", body);
        fingerprint.put("body_format", bodyFormat);
        fingerprint.put("created_at", createdAt);
        fingerprint.put("permissions", permissions);
        fingerprint.put("attachments", attachments);

        return CryptoUtil.fingerprint(fingerprint, COMMENT0_SCHEMA);
    }

    public static byte[] notificationPacket(
        String id, String nodeName, String fullName, Timestamp createdAt, String type, String notification
    ) {
        return notificationPacket1(id, nodeName, fullName, createdAt, type, notification);
    }

    public static byte[] notificationPacket1(
        String id, String nodeName, String fullName, Timestamp createdAt, String type, String notification
    ) {
        Fingerprint fingerprint = new Fingerprint(1);
        fingerprint.put("object_type", "NOTIFICATION_PACKET");
        fingerprint.put("id", id);
        fingerprint.put("node_name", nodeName);
        fingerprint.put("full_name", fullName);
        fingerprint.put("created_at", createdAt);
        fingerprint.put("type", type);
        fingerprint.put("notification", notification);

        return CryptoUtil.fingerprint(fingerprint, NOTIFICATION_PACKET1_SCHEMA);
    }

    public static byte[] notificationPacket0(
        String id, String nodeName, Timestamp createdAt, String type, String notification
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "NOTIFICATION_PACKET");
        fingerprint.put("id", id);
        fingerprint.put("node_name", nodeName);
        fingerprint.put("created_at", createdAt);
        fingerprint.put("type", type);
        fingerprint.put("notification", notification);

        return CryptoUtil.fingerprint(fingerprint, NOTIFICATION_PACKET0_SCHEMA);
    }

    public static byte[] posting(
        String receiverName, String ownerName, byte[] bodySrcHash, String bodySrcFormat, String body, String bodyFormat,
        Timestamp createdAt, byte permissions, List<byte[]> attachments
    ) {
        return posting1(
            receiverName, ownerName, bodySrcHash, bodySrcFormat, body, bodyFormat, createdAt, permissions, attachments
        );
    }

    public static byte[] posting1(
        String receiverName, String ownerName, byte[] bodySrcHash, String bodySrcFormat, String body, String bodyFormat,
        Timestamp createdAt, byte permissions, List<byte[]> attachments
    ) {
        Fingerprint fingerprint = new Fingerprint(1);
        fingerprint.put("object_type", "POSTING");
        fingerprint.put("receiver_name", receiverName);
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("body_src_hash", bodySrcHash);
        fingerprint.put("body_src_format", bodySrcFormat);
        fingerprint.put("body", body);
        fingerprint.put("body_format", bodyFormat);
        fingerprint.put("created_at", createdAt);
        fingerprint.put("permissions", permissions);
        fingerprint.put("attachments", attachments);

        return CryptoUtil.fingerprint(fingerprint, POSTING1_SCHEMA);
    }

    public static byte[] posting0(
        String receiverName, String ownerName, byte[] bodySrcHash, String bodySrcFormat, String body, String bodyFormat,
        Timestamp createdAt, byte permissions, byte attachments
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "POSTING");
        fingerprint.put("receiver_name", receiverName);
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("body_src_hash", bodySrcHash);
        fingerprint.put("body_src_format", bodySrcFormat);
        fingerprint.put("body", body);
        fingerprint.put("body_format", bodyFormat);
        fingerprint.put("created_at", createdAt);
        fingerprint.put("permissions", permissions);
        fingerprint.put("attachments", attachments);

        return CryptoUtil.fingerprint(fingerprint, POSTING0_SCHEMA);
    }

    public static byte[] pushRelayMessage(Timestamp signedAt) {
        return pushRelayMessage0(signedAt);
    }

    public static byte[] pushRelayMessage0(Timestamp signedAt) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "PUSH_RELAY_MESSAGE");
        fingerprint.put("signed_at", signedAt);

        return CryptoUtil.fingerprint(fingerprint, PUSH_RELAY_MESSAGE0_SCHEMA);
    }

    public static byte[] pushRelayRegister(String clientId, String lang, Timestamp signedAt) {
        return pushRelayRegister0(clientId, lang, signedAt);
    }

    public static byte[] pushRelayRegister0(String clientId, String lang, Timestamp signedAt) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "PUSH_RELAY_REGISTER");
        fingerprint.put("client_id", clientId);
        fingerprint.put("lang", lang);
        fingerprint.put("signed_at", signedAt);

        return CryptoUtil.fingerprint(fingerprint, PUSH_RELAY_REGISTER0_SCHEMA);
    }

    public static byte[] reaction(String ownerName, byte[] entryFingerprint, boolean negative, int emoji) {
        return reaction0(ownerName, entryFingerprint, negative, emoji);
    }

    public static byte[] reaction0(String ownerName, byte[] entryFingerprint, boolean negative, int emoji) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "REACTION");
        fingerprint.put("owner_name", ownerName);
        fingerprint.put("entry_fingerprint", entryFingerprint);
        fingerprint.put("negative", negative);
        fingerprint.put("emoji", emoji);

        return CryptoUtil.fingerprint(fingerprint, REACTION0_SCHEMA);
    }

    public static byte[] sheriffOrder(
        String sheriffName, String nodeName, String feedName, byte[] entryFingerprint, String category,
        String reasonCode, String reasonDetails, Timestamp createdAt
    ) {
        return sheriffOrder0(
            sheriffName, nodeName, feedName, entryFingerprint, category, reasonCode, reasonDetails, createdAt
        );
    }

    public static byte[] sheriffOrder0(
        String sheriffName, String nodeName, String feedName, byte[] entryFingerprint, String category,
        String reasonCode, String reasonDetails, Timestamp createdAt
    ) {
        Fingerprint fingerprint = new Fingerprint(0);
        fingerprint.put("object_type", "SHERIFF_ORDER");
        fingerprint.put("sheriff_name", sheriffName);
        fingerprint.put("node_name", nodeName);
        fingerprint.put("feed_name", feedName);
        fingerprint.put("entry_fingerprint", entryFingerprint);
        fingerprint.put("category", category);
        fingerprint.put("reason_code", reasonCode);
        fingerprint.put("reason_details", reasonDetails);
        fingerprint.put("created_at", createdAt);

        return CryptoUtil.fingerprint(fingerprint, SHERIFF_ORDER0_SCHEMA);
    }

}
