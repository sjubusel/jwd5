package by.epamtc.jwd.busel.assignment05.dao.util;

import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {
    private static final String PARAM_DELIMITER = "=";

    public boolean isLineValid(String line, Criteria criteria) {
        Map<String, Object> parameters = criteria.getParameters();
        String applianceType = criteria.getSearchGroupName().getName();
        if (!line.startsWith(applianceType)) {
            return false;
        }
        for (Map.Entry<String, Object> paramPair : parameters.entrySet()) {
            String parameter = createQueryParameter(paramPair.getKey(),
                    paramPair.getValue());
            if (!doesLineContainParameter(line, parameter)) {
                return false;
            }
        }
        return true;
    }

    private String createQueryParameter(String key, Object value) {
        String parameter = key + PARAM_DELIMITER + value.toString();
        return cutParameterIfIntegralValue(parameter);
    }

    /**
     * a method will be deprecated when lines in a source file will be rewritten
     * according to logic of beans (implementations of interface "Appliance".
     * <p>
     * The method will cut if a parameter's value ends with ".0".
     * <p>
     * The reason for this is the following: some beans field is of primitive
     * "double" type (according to meaning it has), but a record of
     * corresponding data in the source file can be written
     * as primitive "int" type.
     *
     * @param parameter a String in the format "KEY=VALUE"
     * @return an initial parameter or parameter with removed ".0" ending
     */
    private String cutParameterIfIntegralValue(String parameter) {
        int floatingPointIndex = parameter.indexOf(".0");
        if (floatingPointIndex == (parameter.length() - 2)) {
            parameter = parameter.substring(0, floatingPointIndex);
        }
        return parameter;
    }

    private boolean doesLineContainParameter(String line, String parameter) {
        Pattern pattern = Pattern.compile("\\b" + parameter + "(?=[^.0-9])");
        Matcher matcher = pattern.matcher(line);
        return matcher.find();
    }
}
