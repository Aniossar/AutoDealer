package com.company.carscubaplatform.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.Country;

@UiController("carscubaplatform_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}