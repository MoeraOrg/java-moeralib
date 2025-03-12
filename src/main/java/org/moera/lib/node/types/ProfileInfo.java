package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileInfo extends Structure implements Cloneable {

    private String fullName;
    private String gender;
    private String email;
    private String title;
    private String bioSrc;
    private SourceFormat bioSrcFormat;
    private String bioHtml;
    private AvatarInfo avatar;
    private List<FundraiserInfo> fundraisers;
    private ProfileOperations operations;

    /**
     * Retrieves node owner's full name.
     *
     * @return the value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets node owner's full name.
     *
     * @param fullName the value to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves node owner's gender.
     *
     * @return the value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets node owner's gender.
     *
     * @param gender the value to be set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Retrieves node owner's E-mail address.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets node owner's E-mail address.
     *
     * @param email the value to be set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves node title.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets node title.
     *
     * @param title the value to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the source text of node owner's bio (arbitrary text), may be absent if not requested.
     *
     * @return the value
     */
    public String getBioSrc() {
        return bioSrc;
    }

    /**
     * Sets the source text of node owner's bio (arbitrary text), may be absent if not requested.
     *
     * @param bioSrc the value to be set
     */
    public void setBioSrc(String bioSrc) {
        this.bioSrc = bioSrc;
    }

    /**
     * Retrieves format of the source text of node owner's bio, <code>markdown</code> by default, may be absent if not
     * requested; the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @return the value
     */
    public SourceFormat getBioSrcFormat() {
        return bioSrcFormat;
    }

    /**
     * Sets format of the source text of node owner's bio, <code>markdown</code> by default, may be absent if not
     * requested; the list of available formats is returned in <code><a
     * href="#PostingFeatures">PostingFeatures</a></code>
     * .
     *
     * @param bioSrcFormat the value to be set
     */
    public void setBioSrcFormat(SourceFormat bioSrcFormat) {
        this.bioSrcFormat = bioSrcFormat;
    }

    /**
     * Retrieves HTML representation of node owner's bio.
     *
     * @return the value
     */
    public String getBioHtml() {
        return bioHtml;
    }

    /**
     * Sets HTML representation of node owner's bio.
     *
     * @param bioHtml the value to be set
     */
    public void setBioHtml(String bioHtml) {
        this.bioHtml = bioHtml;
    }

    /**
     * Retrieves node owner's avatar.
     *
     * @return the value
     */
    public AvatarInfo getAvatar() {
        return avatar;
    }

    /**
     * Sets node owner's avatar.
     *
     * @param avatar the value to be set
     */
    public void setAvatar(AvatarInfo avatar) {
        this.avatar = avatar;
    }

    /**
     * Retrieves list of fundraisers - methods of giving a donation to the node owner.
     *
     * @return the value
     */
    public List<FundraiserInfo> getFundraisers() {
        return fundraisers;
    }

    /**
     * Sets list of fundraisers - methods of giving a donation to the node owner.
     *
     * @param fundraisers the value to be set
     */
    public void setFundraisers(List<FundraiserInfo> fundraisers) {
        this.fundraisers = fundraisers;
    }

    /**
     * Retrieves the supported operations and the corresponding principals.
     *
     * @return the value
     */
    public ProfileOperations getOperations() {
        return operations;
    }

    /**
     * Sets the supported operations and the corresponding principals.
     *
     * @param operations the value to be set
     */
    public void setOperations(ProfileOperations operations) {
        this.operations = operations;
    }

    /**
     * Creates and returns a copy of this {@code ProfileInfo} object.
     *
     * @return a clone of this instance
     */
    @Override
    public ProfileInfo clone() {
        try {
            return (ProfileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Must implement Cloneable", e);
        }
    }

}
