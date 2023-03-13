package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.Country;

public interface ExtUserService {
    String NAME = "carscubaplatform_ExtUserService";

    Country getDefaultUserCountry();
}