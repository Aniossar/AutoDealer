package com.company.carscubaplatform.web.screens.carbrand;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.car.CarBrand;

@UiController("carscubaplatform_CarBrand.edit")
@UiDescriptor("car-brand-edit.xml")
@EditedEntityContainer("carBrandDc")
@LoadDataBeforeShow
public class CarBrandEdit extends StandardEditor<CarBrand> {
}