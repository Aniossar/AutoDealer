package com.company.carscubaplatform.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.carscubaplatform.entity.person.ExtUser;

@UiController("carscubaplatform_ExtUser.browse")
@UiDescriptor("ext-user-browse.xml")
@LookupComponent("extUsersTable")
@LoadDataBeforeShow
public class ExtUserBrowse extends StandardLookup<ExtUser> {
}