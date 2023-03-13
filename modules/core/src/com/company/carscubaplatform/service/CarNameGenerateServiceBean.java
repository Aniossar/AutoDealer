package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.car.Car;
import com.haulmont.cuba.core.global.MetadataTools;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(CarNameGenerateService.NAME)
public class CarNameGenerateServiceBean implements CarNameGenerateService {
    public static final String NAME_FORMAT = "%s-%s-%s";

    @Inject
    private MetadataTools metadataTools;

    @Override
    public String generateName(Car car) {
        String name = String.format(NAME_FORMAT,
                metadataTools.getInstanceName(car.getAutoProducer()),
                metadataTools.getInstanceName(car.getCarBrand()),
                metadataTools.getInstanceName(car.getAutoPicking()));
        return name;
    }

}