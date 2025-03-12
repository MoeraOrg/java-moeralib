package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorySummaryEntry extends Structure implements Cloneable {

    private String ownerName;
    private String ownerFullName;
    private String ownerGender;
    private String heading;
    private List<String> sheriffs;
    private List<SheriffMark> sheriffMarks;

    /**
     * Retrieves entry owner's name.
     *
     * @return the value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets entry owner's name.
     *
     * @param ownerName the value to be set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Retrieves entry owner's full name.
     *
     * @return the value
     */
    public String getOwnerFullName() {
        return ownerFullName;
    }

    /**
     * Sets entry owner's full name.
     *
     * @param ownerFullName the value to be set
     */
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    /**
     * Retrieves entry owner's gender.
     *
     * @return the value
     */
    public String getOwnerGender() {
        return ownerGender;
    }

    /**
     * Sets entry owner's gender.
     *
     * @param ownerGender the value to be set
     */
    public void setOwnerGender(String ownerGender) {
        this.ownerGender = ownerGender;
    }

    /**
     * Retrieves entry heading.
     *
     * @return the value
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets entry heading.
     *
     * @param heading the value to be set
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Retrieves list of sheriffs supervising the entry.
     *
     * @return the value
     */
    public List<String> getSheriffs() {
        return sheriffs;
    }

    /**
     * Sets list of sheriffs supervising the entry.
     *
     * @param sheriffs the value to be set
     */
    public void setSheriffs(List<String> sheriffs) {
        this.sheriffs = sheriffs;
    }

    /**
     * Retrieves list of sheriff marks on the entry.
     *
     * @return the value
     */
    public List<SheriffMark> getSheriffMarks() {
        return sheriffMarks;
    }

    /**
     * Sets list of sheriff marks on the entry.
     *
     * @param sheriffMarks the value to be set
     */
    public void setSheriffMarks(List<SheriffMark> sheriffMarks) {
        this.sheriffMarks = sheriffMarks;
    }

    /**
     * Creates and returns a copy of this {@code StorySummaryEntry} object.
     *
     * @return a clone of this instance
     */
    @Override
    public StorySummaryEntry clone() {
        try {
            return (StorySummaryEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
