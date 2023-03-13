package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.Country;
import com.company.carscubaplatform.entity.person.ExtUser;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(ExtUserService.NAME)
public class ExtUserServiceBean implements ExtUserService {

    @Inject
    private DataManager dataManager;

    @Value("${cuba.default.country.code}")
    protected int defaultCountryCode;

    public Country getDefaultUserCountry() {
        User user = AppBeans.get(UserSessionSource.class).getUserSession().getUser();
        LoadContext<ExtUser> loadContext = LoadContext.create(ExtUser.class)
                .setId(user.getId())
                .setView("user.edit");
        ExtUser extUser = dataManager.load(loadContext);
        Country defaultCountry = extUser.getCountry();

        if (defaultCountry == null) {
            defaultCountry = dataManager.load(Country.class)
                    .query("select a from carscubaplatform_Country a where a.code = :code")
                    .parameter("code", defaultCountryCode)
                    .one();
        }
        return defaultCountry;
    }
}