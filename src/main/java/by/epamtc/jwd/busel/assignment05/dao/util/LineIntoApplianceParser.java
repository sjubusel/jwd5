package by.epamtc.jwd.busel.assignment05.dao.util;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

import java.util.ArrayList;
import java.util.List;

public class LineIntoApplianceParser {
    private static final String PARAMETER_PAIRS_DELIMITER = ", ";
    private static final String PARAMETER_DELIMITER = "=";
    private final CommandProvider provider = new CommandProvider();

    public Appliance parseAppliance(String line, Appliance.Type applianceType) {
        int typePlusDelimiterOffset = applianceType.getName().length() + 3;
        String[] paramPairs = line.substring(typePlusDelimiterOffset)
                .split(PARAMETER_PAIRS_DELIMITER);

        List<String> parameters = new ArrayList<>();
        for (String pair : paramPairs) {
            int delimiterIndex = pair.indexOf(PARAMETER_DELIMITER);
            parameters.add(pair.substring(delimiterIndex + 1));
        }
        Command executionCommand = provider.getCommand(applianceType);
        return executionCommand.execute(parameters);
    }
}
