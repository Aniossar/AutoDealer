package com.company.carscubaplatform.entity.car;

import com.company.carscubaplatform.entity.dealer.AutoPicking;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "CARSCUBAPLATFORM_CAR_BRAND")
@Entity(name = "carscubaplatform_CarBrand")
@NamePattern("%s|name")
public class CarBrand extends StandardEntity {
    private static final long serialVersionUID = -5494170363029943037L;

    @Column(name = "NAME")
    private String name;

    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTO_PRODUCER_ID")
    private AutoProducer autoProducer;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "carBrand")
    private List<AutoPicking> picking;

    public List<AutoPicking> getPicking() {
        return picking;
    }

    public void setPicking(List<AutoPicking> picking) {
        this.picking = picking;
    }

    public AutoProducer getAutoProducer() {
        return autoProducer;
    }

    public void setAutoProducer(AutoProducer autoProducer) {
        this.autoProducer = autoProducer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}