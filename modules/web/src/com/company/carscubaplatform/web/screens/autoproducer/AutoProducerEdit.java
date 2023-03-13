package com.company.carscubaplatform.web.screens.autoproducer;

import com.company.carscubaplatform.entity.car.AutoProducer;
import com.company.carscubaplatform.entity.Country;
import com.company.carscubaplatform.service.ExtUserService;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("carscubaplatform_AutoProducer.edit")
@UiDescriptor("auto-producer-edit.xml")
@EditedEntityContainer("autoProducerDc")
@LoadDataBeforeShow
public class AutoProducerEdit extends StandardEditor<AutoProducer> {

    @Inject
    ExtUserService extUserService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<AutoProducer> entityEvent) {
        AutoProducer autoProducer = entityEvent.getEntity();
        Country countryFromUser = extUserService.getDefaultUserCountry();
        autoProducer.setCountry(countryFromUser);
    }

}