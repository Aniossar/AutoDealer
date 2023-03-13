package com.company.carscubaplatform.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.car.Color;

@UiController("carscubaplatform_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}