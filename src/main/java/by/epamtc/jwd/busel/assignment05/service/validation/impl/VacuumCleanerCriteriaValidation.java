package by.epamtc.jwd.busel.assignment05.service.validation.impl;

import by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;

public class VacuumCleanerCriteriaValidation implements CriteriaValidation {
    @Override
    public Class<?> getContractParamValueClass(String paramKey) {
        return SearchCriteria.VacuumCleaner.valueOf(paramKey).getClassStructure();
    }

    @Override
    public boolean isParameterValueAcceptable(String paramKey, Object paramValue) {
        SearchCriteria.VacuumCleaner vacuumCleaner
                = SearchCriteria.VacuumCleaner.valueOf(paramKey);
        return (paramValue != null) && vacuumCleaner.isAcceptable(paramValue);
    }
}
