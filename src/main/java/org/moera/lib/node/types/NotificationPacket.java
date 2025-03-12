package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;
import org.moera.lib.node.types.validate.ValidationUtil;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPacket extends Structure implements Cloneable {

    private String id;
    private String nodeName;
    private String fullName;
    private String gender;
    private AvatarImage avatar;
    private long createdAt;
    private String type;
    private String notification;
    private byte[] signature;
    private short signatureVersion;

    /**
     * Retrieves ID of the notification packet on the sending node (used to filter out duplicates).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of the notification packet on the sending node (used to filter out duplicates).
     *
     * @param id the value to be set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves name of the sending node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets name of the sending node.
     *
     * @param nodeName the value to be set
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Retrieves full name of the sending node.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name of the sending node.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves gender of the sending node.
     *
     * @return the value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender of the sending node.
     *
     * @param gender the value to be set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Retrieves avatar of the sending node.
     *
     * @return the value
     */
    public AvatarImage getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar of the sending node.
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarImage avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves notification packet creation timestamp.
     *
     * @return the value
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets notification packet creation timestamp.
     *
     * @param createdAt the value to be set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Retrieves notification type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Sets notification type.
     *
     * @param type the value to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves the notification, a string representation of a JSON structure (see <a
     * href="notifications.html">Notifications</a> page for details)
     * .
     *
     * @return the value
     */
    public String getNotification() {
        return notification;
    }

    /**
     * Sets the notification, a string representation of a JSON structure (see <a
     * href="notifications.html">Notifications</a> page for details)
     * .
     *
     * @param notification the value to be set
     */
    public void setNotification(String notification) {
        this.notification = notification;
    }

    /**
     * Retrieves the notification packet sender signature (use <code><a
     * href="fingerprints.html#NotificationPacket">NotificationPacket</a></code> fingerprint)
     * .
     *
     * @return the value
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the notification packet sender signature (use <code><a
     * href="fingerprints.html#NotificationPacket">NotificationPacket</a></code> fingerprint)
     * .
     *
     * @param signature the value to be set
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    /**
     * Retrieves signature version (i.e. fingerprint version).
     *
     * @return the value
     */
    public short getSignatureVersion() {
        return signatureVersion;
    }

    /**
     * Sets signature version (i.e. fingerprint version).
     *
     * @param signatureVersion the value to be set
     */
    public void setSignatureVersion(short signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    @Override
    public void validate() {
        super.validate();
        ValidationUtil.notBlank(nodeName, "notification.node-name.blank");
        ValidationUtil.maxSize(nodeName, 63, "notification.node-name.wrong-size");
        ValidationUtil.maxSize(fullName, 96, "notification.full-name.wrong-size");
        ValidationUtil.maxSize(gender, 31, "notification.gender.wrong-size");
        ValidationUtil.notBlank(type, "notification.type.blank");
        ValidationUtil.notBlank(notification, "notification.notification.blank");
    }

    /**
     * Creates and returns a copy of this {@code NotificationPacket} object.
     *
     * @return a clone of this instance
     */
    @Override
    public NotificationPacket clone() {
        try {
            return (NotificationPacket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
