package org.moera.lib.node.types;

// This file is generated

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileAttributes {

    private String fullName;
    private String gender;
    private String email;
    private String title;
    private String bioSrc;
    private SourceFormat bioSrcFormat;
    private String avatarId;
    private List<FundraiserInfo> fundraisers;
    private ProfileOperations operations;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBioSrc() {
        return bioSrc;
    }

    public void setBioSrc(String bioSrc) {
        this.bioSrc = bioSrc;
    }

    public SourceFormat getBioSrcFormat() {
        return bioSrcFormat;
    }

    public void setBioSrcFormat(SourceFormat bioSrcFormat) {
        this.bioSrcFormat = bioSrcFormat;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public List<FundraiserInfo> getFundraisers() {
        return fundraisers;
    }

    public void setFundraisers(List<FundraiserInfo> fundraisers) {
        this.fundraisers = fundraisers;
    }

    public ProfileOperations getOperations() {
        return operations;
    }

    public void setOperations(ProfileOperations operations) {
        this.operations = operations;
    }

}
