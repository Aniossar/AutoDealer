package com.company.carscubaplatform.entity.car;

import com.company.carscubaplatform.entity.dealer.AutoPicking;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "CARSCUBAPLATFORM_CAR")
@Entity(name = "carscubaplatform_Car")
@NamePattern("%s|name")
public class Car extends StandardEntity {
    private static final long serialVersionUID = -2707501992769434239L;

    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "AUTO_PRODUCER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @Lookup(type = LookupType.DROPDOWN, actions = {})
    private AutoProducer autoProducer;

    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "CAR_BRAND_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @Lookup(type = LookupType.DROPDOWN, actions = {})
    private CarBrand carBrand;

    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "AUTO_PICKING_ID")
    @OneToOne(fetch = FetchType.LAZY)
    @Lookup(type = LookupType.SCREEN, actions = "lookup")
    private AutoPicking autoPicking;

    @Column(name = "NAME", length = 500)
    private String name;

    @NumberFormat(pattern = "#")
    @Column(name = "YEAR_PRODUCE")
    private Integer yearProduce;

    @Column(name = "CAR_PRICE")
    private Double carPrice;

    public void setYearProduce(Integer yearProduce) {
        this.yearProduce = yearProduce;
    }

    public Integer getYearProduce() {
        return yearProduce;
    }

    public void setAutoProducer(AutoProducer autoProducer) {
        this.autoProducer = autoProducer;
    }

    public AutoProducer getAutoProducer() {
        return autoProducer;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoPicking getAutoPicking() {
        return autoPicking;
    }

    public void setAutoPicking(AutoPicking autoPicking) {
        this.autoPicking = autoPicking;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

}