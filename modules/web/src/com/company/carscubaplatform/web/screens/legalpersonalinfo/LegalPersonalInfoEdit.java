package com.company.carscubaplatform.web.screens.legalpersonalinfo;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.person.LegalPersonalInfo;

@UiController("carscubaplatform_LegalPersonalInfo.edit")
@UiDescriptor("legal-personal-info-edit.xml")
@EditedEntityContainer("legalPersonalInfoDc")
@LoadDataBeforeShow
public class LegalPersonalInfoEdit extends StandardEditor<LegalPersonalInfo> {
}