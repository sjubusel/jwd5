package by.epamtc.jwd.busel.assignment05.dao.util;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.factory.ApplianceCreator;

import java.util.ArrayList;
import java.util.List;

public class LineIntoApplianceParser {
    private static final String PARAMETER_PAIRS_DELIMITER = ", ";
    private static final String PARAMETER_DELIMITER = "=";
    private final ApplianceCreatorProvider provider;

    {
        provider = new ApplianceCreatorProvider();
    }

    public Appliance parseAppliance(String line, Appliance.Type applianceType) {
        int typePlusDelimiterOffset = applianceType.getName().length() + 3;
        String[] paramPairs = line
                .substring(typePlusDelimiterOffset, line.length() - 1)
                .split(PARAMETER_PAIRS_DELIMITER);

        List<String> parameters = new ArrayList<>();
        for (String pair : paramPairs) {
            int delimiterIndex = pair.indexOf(PARAMETER_DELIMITER);
            parameters.add(pair.substring(delimiterIndex + 1));
        }
        ApplianceCreator applianceCreator = provider.getCreator(applianceType);
        return applianceCreator.createAppliance(parameters);
    }
}
