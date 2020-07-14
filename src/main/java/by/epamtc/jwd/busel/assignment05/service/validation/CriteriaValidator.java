package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;
import by.epamtc.jwd.busel.assignment05.service.exception.ServiceException;

public class CriteriaValidator {
    private CriteriaValidationProvider provider
            = new CriteriaValidationProvider();

    public boolean isCriteriaValid(Criteria criteria) throws ServiceException {
        Appliance.Type type = criteria.getSearchGroupName();
        CriteriaValidation validation = provider.getValidation(type);
        return validation.isValid(criteria);
    }
}
