package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.car.AutoProducer;

public interface CarBrandService {
    String NAME = "carscubaplatform_CarBrandService";

    int getNumberOfCarBrands(AutoProducer autoProducer);
}