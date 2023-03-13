package com.company.carscubaplatform.web.screens.carbrand;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.car.CarBrand;

@UiController("carscubaplatform_CarBrand.browse")
@UiDescriptor("car-brand-browse.xml")
@LookupComponent("carBrandsTable")
@LoadDataBeforeShow
public class CarBrandBrowse extends StandardLookup<CarBrand> {
}