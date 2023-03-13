package com.company.carscubaplatform.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.Country;

@UiController("carscubaplatform_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}