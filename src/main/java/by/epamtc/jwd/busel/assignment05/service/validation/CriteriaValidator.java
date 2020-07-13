package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

public class CriteriaValidator {
    public boolean isCriteriaValid(Criteria criteria) {
        Appliance.Type type = criteria.getSearchGroupName();

        return false;
    }
}
