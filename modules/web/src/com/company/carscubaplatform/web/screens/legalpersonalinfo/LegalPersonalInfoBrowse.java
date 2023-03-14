package com.company.carscubaplatform.web.screens.legalpersonalinfo;

import com.company.carscubaplatform.service.AutoBuyingRequestService;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.person.LegalPersonalInfo;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;

@UiController("carscubaplatform_LegalPersonalInfo.browse")
@UiDescriptor("legal-personal-info-browse.xml")
@LookupComponent("legalPersonalInfoesTable")
@LoadDataBeforeShow
public class LegalPersonalInfoBrowse extends StandardLookup<LegalPersonalInfo> {

    @Inject
    protected GroupTable<LegalPersonalInfo> legalPersonalInfoesTable;

    @Inject
    protected ComponentsFactory componentsFactory;

    @Inject
    protected AutoBuyingRequestService autoBuyingRequestService;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        legalPersonalInfoesTable.addGeneratedColumn("generatedColumnNumberOfRequests", new Table.PrintableColumnGenerator<LegalPersonalInfo, Integer>() {
            @Override
            public Component generateCell(LegalPersonalInfo entity) {
                Label field = (Label) componentsFactory.createComponent(Label.NAME);
                field.setValue(autoBuyingRequestService.getNumberOfRequestsForBuyer(entity));
                return field;
            }

            @Override
            public Integer getValue(LegalPersonalInfo item) {
                return autoBuyingRequestService.getNumberOfRequestsForBuyer(item);
            }
        });
    }
}