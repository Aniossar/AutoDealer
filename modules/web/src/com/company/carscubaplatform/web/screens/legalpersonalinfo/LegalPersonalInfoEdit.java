package com.company.carscubaplatform.web.screens.legalpersonalinfo;

import com.company.carscubaplatform.entity.car.AutoProducer;
import com.company.carscubaplatform.entity.car.Car;
import com.company.carscubaplatform.entity.dealer.AutoPicking;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.person.LegalPersonalInfo;

import javax.inject.Inject;
import java.time.LocalDate;

@UiController("carscubaplatform_LegalPersonalInfo.edit")
@UiDescriptor("legal-personal-info-edit.xml")
@EditedEntityContainer("legalPersonalInfoDc")
@LoadDataBeforeShow
public class LegalPersonalInfoEdit extends StandardEditor<LegalPersonalInfo> {

    /*@Inject
    private TextField<String> iNNAddressField;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        if (iNNAddressField == null) {

            iNNAddressField.setEditable(true);
        }
    }*/

}