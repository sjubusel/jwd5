package by.epamtc.jwd.busel.assignment05.service.validation.impl;

import by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;

public class SpeakersCriteriaValidation implements CriteriaValidation {
    @Override
    public Class<?> getContractParamValueClass(String paramKey) {
        return SearchCriteria.Speakers.valueOf(paramKey).getClassStructure();
    }

    @Override
    public boolean isParameterValueAcceptable(String paramKey, Object paramValue) {
        return SearchCriteria.Speakers.valueOf(paramKey).isAcceptable(paramValue);
    }
}
