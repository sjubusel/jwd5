package by.epamtc.jwd.busel.assignment05.service;

import by.epamtc.jwd.busel.assignment05.service.impl.DefaultApplianceService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService
            = new DefaultApplianceService();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ApplianceService getApplianceService() {
        return applianceService;
    }
}
