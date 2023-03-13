package com.company.carscubaplatform.entity.dealer;

import com.company.carscubaplatform.entity.car.Car;
import com.company.carscubaplatform.entity.person.LegalPersonalInfo;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Table(name = "CARSCUBAPLATFORM_AUTO_BUYING_REQUEST")
@Entity(name = "carscubaplatform_AutoBuyingRequest")
public class AutoBuyingRequest extends StandardEntity implements SoftDelete {
    private static final long serialVersionUID = 689748903880002300L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    private Car car;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LEGAL_PERSONAL_INFO_ID")
    private LegalPersonalInfo legalPersonalInfo;

    @Column(name = "IS_AUTO_BOUGHT")
    private Boolean isAutoBought;

    @Column(name = "PRICE")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    private User manager;

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIsAutoBought() {
        return isAutoBought;
    }

    public void setIsAutoBought(Boolean isAutoBought) {
        this.isAutoBought = isAutoBought;
    }

    public LegalPersonalInfo getLegalPersonalInfo() {
        return legalPersonalInfo;
    }

    public void setLegalPersonalInfo(LegalPersonalInfo legalPersonalInfo) {
        this.legalPersonalInfo = legalPersonalInfo;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}