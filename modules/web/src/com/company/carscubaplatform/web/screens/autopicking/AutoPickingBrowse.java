package com.company.carscubaplatform.web.screens.autopicking;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.dealer.AutoPicking;

@UiController("carscubaplatform_AutoPicking.browse")
@UiDescriptor("auto-picking-browse.xml")
@LookupComponent("autoPickingsTable")
@LoadDataBeforeShow
public class AutoPickingBrowse extends StandardLookup<AutoPicking> {
}