package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;
import by.epamtc.jwd.busel.assignment05.service.exception.ServiceException;


import java.util.Map;

/*
CriteriaValidation currently checks whether types of parameters of
particular criteria are similar to types of corresponding parameters,
which contracts are stated in enum constants of
by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.
In the future some validation logic will be added.
 */
public interface CriteriaValidation {
    default boolean isValid(Criteria criteria) throws ServiceException {
        Map<String, Object> parameters = criteria.getParameters();
        for (Map.Entry<String, Object> param : parameters.entrySet()) {
            String key = param.getKey();
            Object value = param.getValue();
            Class<?> contractParamValueClass = getContractParamValueClass(key);
            Class<?> currentParamValueClass = value.getClass();

            if (currentParamValueClass != contractParamValueClass) {
                throw new ServiceException("INCOMPATIBLE TYPE OF" +
                        " INPUTTED PARAMETER");
            }
            if (!isParameterValueAcceptable(key, value)) {
                return false;
            }
        }
        return true;
    }

    Class<?> getContractParamValueClass(String paramKey);

    boolean isParameterValueAcceptable(String paramKey, Object paramValue);
}
