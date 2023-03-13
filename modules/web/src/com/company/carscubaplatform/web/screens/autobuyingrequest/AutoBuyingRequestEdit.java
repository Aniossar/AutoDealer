package com.company.carscubaplatform.web.screens.autobuyingrequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.dealer.AutoBuyingRequest;

@UiController("carscubaplatform_AutoBuyingRequest.edit")
@UiDescriptor("auto-buying-request-edit.xml")
@EditedEntityContainer("autoBuyingRequestDc")
@LoadDataBeforeShow
public class AutoBuyingRequestEdit extends StandardEditor<AutoBuyingRequest> {
}