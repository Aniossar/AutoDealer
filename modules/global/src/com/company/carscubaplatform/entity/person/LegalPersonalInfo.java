package com.company.carscubaplatform.entity.person;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Table(name = "CARSCUBAPLATFORM_LEGAL_PERSONAL_INFO")
@Entity(name = "carscubaplatform_LegalPersonalInfo")
public class LegalPersonalInfo extends StandardEntity {
    private static final long serialVersionUID = 636450709762342581L;

    @Column(name = "LEGAL_NAME")
    private String legalName;

    @Lob
    @Column(name = "I_NN_ADDRESS")
    private String iNNAddress;

    @Column(name = "PERSONAL_NAME")
    private String personalName;

    @Column(name = "PHONE_NUMBER", length = 7)
    @Pattern(message = "Номер телефона должен состоять только из цифр", regexp = "^[0-9]*$")
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getiNNAddress() {
        return iNNAddress;
    }

    public void setiNNAddress(String iNNAddress) {
        this.iNNAddress = iNNAddress;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
}