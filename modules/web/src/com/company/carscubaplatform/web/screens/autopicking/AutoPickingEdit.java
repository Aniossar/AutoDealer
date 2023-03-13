package com.company.carscubaplatform.web.screens.autopicking;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.dealer.AutoPicking;

@UiController("carscubaplatform_AutoPicking.edit")
@UiDescriptor("auto-picking-edit.xml")
@EditedEntityContainer("autoPickingDc")
@LoadDataBeforeShow
public class AutoPickingEdit extends StandardEditor<AutoPicking> {
}