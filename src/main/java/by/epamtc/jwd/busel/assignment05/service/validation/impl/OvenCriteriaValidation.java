package by.epamtc.jwd.busel.assignment05.service.validation.impl;

import by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;

public class OvenCriteriaValidation implements CriteriaValidation {
    @Override
    public Class<?> getContractParamValueClass(String paramKey) {
        return SearchCriteria.Oven.valueOf(paramKey).getClassStructure();
    }

    @Override
    public boolean isParameterValueAcceptable(String paramKey, Object paramValue) {
        return SearchCriteria.Oven.valueOf(paramKey).isAcceptable(paramValue);
    }
}
