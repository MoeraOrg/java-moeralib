package org.moera.lib.node.types;

// This file is generated

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryReaction extends Structure implements Cloneable {

    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private Integer emoji;

    /**
     * Retrieves reaction owner's name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets reaction owner's name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves reaction owner's full name.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets reaction owner's full name.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves reaction owner's gender.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets reaction owner's gender.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves reaction code.
     *
     * @return the value
     */
    public Integer getEmoji() {
        return emoji;
    }

    /**
     * Sets reaction code.
     *
     * @param emoji the value to be set
     */
    public void setEmoji(Integer emoji) {
        this.emoji = emoji;
    }

    /**
     * Creates and returns a copy of this {@code StorySummaryReaction} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryReaction clone() {
        try {
            return (StorySummaryReaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
