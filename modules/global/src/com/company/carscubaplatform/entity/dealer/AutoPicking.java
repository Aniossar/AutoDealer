package com.company.carscubaplatform.entity.dealer;

import com.company.carscubaplatform.entity.car.CarBrand;
import com.company.carscubaplatform.entity.car.CarType;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CARSCUBAPLATFORM_AUTO_PICKING")
@Entity(name = "carscubaplatform_AutoPicking")
public class AutoPicking extends StandardEntity {
    private static final long serialVersionUID = 3311252382978875393L;

    @Column(name = "PICKING_NAME", length = 100)
    private String pickingName;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "CAR_TYPE")
    private String carType;

    @Column(name = "COMMENT_")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CAR_BRAND_ID")
    private CarBrand carBrand;

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CarType getCarType() {
        return carType == null ? null : CarType.fromId(carType);
    }

    public void setCarType(CarType carType) {
        this.carType = carType == null ? null : carType.getId();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPickingName() {
        return pickingName;
    }

    public void setPickingName(String pickingName) {
        this.pickingName = pickingName;
    }
}