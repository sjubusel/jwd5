package by.epamtc.jwd.busel.assignment05.dao;

import by.epamtc.jwd.busel.assignment05.dao.impl.FileApplianceDao;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ApplianceDao applianceDao = new FileApplianceDao();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    public ApplianceDao getApplianceDao() {
        return applianceDao;
    }
}
