package com.company.carscubaplatform.entity.person;

import com.company.carscubaplatform.entity.Country;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Entity(name = "carscubaplatform_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = 2237653184793751074L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}