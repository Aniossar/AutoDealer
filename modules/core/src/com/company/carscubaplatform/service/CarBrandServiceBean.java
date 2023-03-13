package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.car.AutoProducer;
import com.company.carscubaplatform.entity.car.CarBrand;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(CarBrandService.NAME)
public class CarBrandServiceBean implements CarBrandService {

    @Inject
    private DataManager dataManager;

    public int getNumberOfCarBrands(AutoProducer autoProducer) {
        List<CarBrand> carBrands = dataManager.load(CarBrand.class)
                .query("select a from carscubaplatform_CarBrand a where a.autoProducer = :autoProducer")
                .parameter("autoProducer", autoProducer)
                .list();
        return carBrands.size();
    }
}