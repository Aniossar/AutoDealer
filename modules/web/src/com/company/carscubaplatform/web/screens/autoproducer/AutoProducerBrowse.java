package com.company.carscubaplatform.web.screens.autoproducer;

import com.company.carscubaplatform.entity.car.AutoProducer;
import com.company.carscubaplatform.service.CarBrandService;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;

@UiController("carscubaplatform_AutoProducer.browse")
@UiDescriptor("auto-producer-browse.xml")
@LookupComponent("autoProducersTable")
@LoadDataBeforeShow
public class AutoProducerBrowse extends StandardLookup<AutoProducer> {

    @Inject
    protected GroupTable<AutoProducer> autoProducersTable;

    @Inject
    protected ComponentsFactory componentsFactory;

    @Inject
    protected CarBrandService carBrandService;

    @Override
    protected void initActions(InitEvent event) {
        super.initActions(event);
        autoProducersTable.addGeneratedColumn("generatedColumnNumberOfCarBrands", new Table.ColumnGenerator<AutoProducer>() {
            @Override
            public Component generateCell(AutoProducer entity) {
                Label field = (Label) componentsFactory.createComponent(Label.NAME);
                field.setValue(carBrandService.getNumberOfCarBrands(entity));
                return field;
            }
        });
    }
}