package com.company.carscubaplatform.entity.car;

import com.company.carscubaplatform.entity.Country;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CARSCUBAPLATFORM_AUTO_PRODUCER")
@Entity(name = "carscubaplatform_AutoProducer")
@NamePattern("%s|name")
public class AutoProducer extends StandardEntity {
    private static final long serialVersionUID = -5925333659057947838L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    @NotNull
    @Column(name = "PRODUCER_CODE", nullable = false, unique = true)
    private Integer producerCode;

    public Integer getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(Integer producerCode) {
        this.producerCode = producerCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@PostConstruct
    protected void init() {
        ExtUser user = (ExtUser) (AppBeans.get(UserSessionSource.class).getUserSession().getUser());
        setCountry(user.getCountry());
    }*/

}