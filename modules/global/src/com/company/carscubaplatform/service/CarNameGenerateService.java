package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.car.Car;

public interface CarNameGenerateService {
    String NAME = "carscubaplatform_CarNameGenerateService";

    public String generateName(Car car);
}