package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

public class CriteriaValidator {
    private CriteriaValidationProvider provider
            = new CriteriaValidationProvider();

    public boolean isCriteriaValid(Criteria criteria) {
        Appliance.Type type = criteria.getSearchGroupName();
        CriteriaValidation validation;
        validation = provider.getCommand(type);
        return validation.isValid(criteria);
    }
}
