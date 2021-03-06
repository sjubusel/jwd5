package by.epamtc.jwd.busel.assignment05.service.validation.impl;

import by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;

public class TabletPcCriteriaValidation implements CriteriaValidation {
    @Override
    public Class<?> getContractParamValueClass(String paramKey) {
        return SearchCriteria.TabletPc.valueOf(paramKey).getClassStructure();
    }

    @Override
    public boolean isParameterValueAcceptable(String paramKey, Object paramValue) {
        SearchCriteria.TabletPc pc = SearchCriteria.TabletPc.valueOf(paramKey);
        return (paramValue != null) && pc.isAcceptable(paramValue);
    }
}
