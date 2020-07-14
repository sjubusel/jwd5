package by.epamtc.jwd.busel.assignment05.service.validation.impl;

import by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;

public class LaptopCriteriaValidation implements CriteriaValidation {
    @Override
    public Class<?> getContractParamValueClass(String paramKey) {
        return SearchCriteria.Laptop.valueOf(paramKey).getClassStructure();
    }

    @Override
    public boolean isParameterValueAcceptable(String paramKey, Object paramValue) {
        return SearchCriteria.Laptop.valueOf(paramKey).isAcceptable(paramValue);
    }
}
