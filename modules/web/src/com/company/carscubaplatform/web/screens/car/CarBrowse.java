package com.company.carscubaplatform.web.screens.car;

import com.company.carscubaplatform.service.CarNameGenerateService;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.car.Car;

import javax.inject.Inject;

@UiController("carscubaplatform_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}