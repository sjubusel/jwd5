package by.epamtc.jwd.busel.assignment05.service.impl;

import by.epamtc.jwd.busel.assignment05.dao.ApplianceDao;
import by.epamtc.jwd.busel.assignment05.dao.DaoFactory;
import by.epamtc.jwd.busel.assignment05.dao.exception.DaoException;
import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;
import by.epamtc.jwd.busel.assignment05.service.ApplianceService;
import by.epamtc.jwd.busel.assignment05.service.exception.ServiceException;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidator;

import java.util.List;

public class DefaultApplianceService implements ApplianceService {
    CriteriaValidator validator = new CriteriaValidator();

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!validator.isCriteriaValid(criteria)) {
            throw new ServiceException("INVALID APPLIANCE CRITERIA");
        }

        DaoFactory factory = DaoFactory.getInstance();
        ApplianceDao applianceDao = factory.getApplianceDao();

        List<Appliance> appliances;
        try {
            appliances = applianceDao.find(criteria);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }
}
