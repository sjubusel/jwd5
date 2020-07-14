package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;


import java.util.Map;

/*
CriteriaValidation currently checks whether types of parameters of
particular criteria are similar to types of corresponding parameters,
which contracts are stated in enum constants of
by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.
In the future some validation logic will be added.
 */
public interface CriteriaValidation {
    default boolean isValid(Criteria criteria) {
        Map<String, Object> parameters = criteria.getParameters();
        for (Map.Entry<String, Object> param : parameters.entrySet()) {
            Class<?> contractParamValueClass =
                    getContractParamValueClass(param.getKey());
            Class<?> currentParamValueClass = param.getValue().getClass();

            if (currentParamValueClass != contractParamValueClass) {
                return false;
            }
        }
        return true;
    }

    Class<?> getContractParamValueClass(String paramKey);
}
