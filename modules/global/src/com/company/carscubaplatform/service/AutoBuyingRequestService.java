package com.company.carscubaplatform.service;

import com.company.carscubaplatform.entity.person.LegalPersonalInfo;

public interface AutoBuyingRequestService {
    String NAME = "carscubaplatform_AutoBuyingRequestService";

    int getNumberOfRequestsForBuyer(LegalPersonalInfo legalPersonalInfo);
}