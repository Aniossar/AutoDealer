package com.company.carscubaplatform.web.screens.car;

import com.company.carscubaplatform.entity.dealer.AutoPicking;
import com.company.carscubaplatform.entity.car.AutoProducer;
import com.company.carscubaplatform.entity.car.Car;
import com.company.carscubaplatform.entity.car.CarBrand;
import com.company.carscubaplatform.service.CarNameGenerateService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.time.LocalDate;

@UiController("carscubaplatform_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
public class CarEdit extends StandardEditor<Car> {

    @Inject
    private InstanceLoader<Car> carsDl;

    @Inject
    private CollectionLoader<CarBrand> carBrandsDl;

    @Inject
    private CollectionLoader<AutoPicking> autoPickingDl;

    @Inject
    private LookupPickerField<AutoProducer> autoProducerField;

    @Inject
    private LookupPickerField<CarBrand> carBrandField;

    @Inject
    private LookupPickerField<AutoPicking> autoPickingField;

    @Inject
    private CarNameGenerateService carNameGenerateService;

    @Inject
    private DataManager dataManager;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carsDl.load();
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Car> entityEvent) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        entityEvent.getEntity().setYearProduce(year);
    }

    @Subscribe("autoProducerField")
    protected void onAutoProducerFieldChange(HasValue.ValueChangeEvent<AutoProducer> event) {
        if (autoProducerField.isEmpty()) {
            carBrandField.setEditable(false);
            carBrandField.clear();
        }
        carBrandsDl.setParameter("autoProducer", event.getValue());
        carBrandsDl.load();
        carBrandField.setEditable(true);
    }

    @Subscribe("carBrandField")
    protected void onCarBrandFieldChange(HasValue.ValueChangeEvent<CarBrand> event) {
        if (carBrandField.isEmpty()) {
            autoPickingField.setEditable(false);
            autoPickingField.clear();
        }
        autoPickingDl.setParameter("carBrand", event.getValue());
        autoPickingDl.load();
        autoPickingField.setEditable(true);
    }

    @Subscribe(id = "carDc", target = Target.DATA_CONTAINER)
    private void onCarDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Car> event) {
        Car car = event.getItem();
        if (event.getProperty().contains("autoPicking")) {
            AutoPicking autoPickingValue = (AutoPicking) event.getValue();
            LoadContext<AutoPicking> loadContext = LoadContext.create(AutoPicking.class)
                    .setId(autoPickingValue.getId());
            AutoPicking autoPicking = dataManager.load(loadContext);
            car.setCarPrice(autoPicking.getPrice());
        }
        if (event.getProperty().contains("price")) {
            if ((Double) event.getPrevValue() > (Double) event.getValue()) {
                car.setCarPrice((Double) event.getPrevValue());
            }
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Car editedEntity = getEditedEntity();
        editedEntity.setName(carNameGenerateService.generateName(editedEntity));
        event.resume();
    }

}