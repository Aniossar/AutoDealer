package com.company.carscubaplatform.web.screens.autobuyingrequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.dealer.AutoBuyingRequest;

@UiController("carscubaplatform_AutoBuyingRequest.browse")
@UiDescriptor("auto-buying-request-browse.xml")
@LookupComponent("autoBuyingRequestsTable")
@LoadDataBeforeShow
public class AutoBuyingRequestBrowse extends StandardLookup<AutoBuyingRequest> {
}