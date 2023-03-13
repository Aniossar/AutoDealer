package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.dealer.AutoBuyingRequest;
import com.company.carscubaplatform.entity.car.Car;
import com.company.carscubaplatform.entity.car.CarBrand;
import com.company.carscubaplatform.entity.person.LegalPersonalInfo;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service(AutoBuyingRequestService.NAME)
public class AutoBuyingRequestServiceBean implements AutoBuyingRequestService {

    @Inject
    private DataManager dataManager;

    public int getNumberOfRequestsForBuyer(LegalPersonalInfo legalPersonalInfo) {
        List<AutoBuyingRequest> autoBuyingRequests = dataManager.load(AutoBuyingRequest.class)
                .query("select a from carscubaplatform_AutoBuyingRequest a where a.legalPersonalInfo = :legalPersonalInfo")
                .parameter("legalPersonalInfo", legalPersonalInfo)
                .list();
        return autoBuyingRequests.size();
    }

    public List<CarBrand> getCarBrandsNotSold() {
        List<AutoBuyingRequest> autoBuyingRequests = dataManager.load(AutoBuyingRequest.class)
                .query("select a from carscubaplatform_AutoBuyingRequest a where a.isAutoBought = false")
                .list();
        List<Car> cars = autoBuyingRequests.stream()
                .map(AutoBuyingRequest::getCar)
                .collect(Collectors.toList());
        List<CarBrand> carBrands = new ArrayList<>();
        for (Car car : cars) {
            LoadContext<CarBrand> loadContext = LoadContext.create(CarBrand.class)
                    .setId(car.getCarBrand().getId());
            carBrands.add(dataManager.load(loadContext));
        }
        return carBrands;
    }
}