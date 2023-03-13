package com.company.carscubaplatform.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.person.ExtUser;

@UiController("carscubaplatform_ExtUser.edit")
@UiDescriptor("ext-user-edit.xml")
@EditedEntityContainer("extUserDc")
@LoadDataBeforeShow
public class ExtUserEdit extends StandardEditor<ExtUser> {
}