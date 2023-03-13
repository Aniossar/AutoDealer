package com.company.carscubaplatform.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.car.Color;

@UiController("carscubaplatform_Color.edit")
@UiDescriptor("color-edit.xml")
@EditedEntityContainer("colorDc")
@LoadDataBeforeShow
public class ColorEdit extends StandardEditor<Color> {
}