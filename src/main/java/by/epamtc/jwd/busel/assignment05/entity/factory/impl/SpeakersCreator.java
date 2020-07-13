package by.epamtc.jwd.busel.assignment05.entity.factory.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.factory.ApplianceCreator;
import by.epamtc.jwd.busel.assignment05.entity.impl.Speakers;

import java.util.List;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double powerConsumption = Double.parseDouble(parameterValues.get(i++));
        int numberOfSpeakers = Integer.parseInt(parameterValues.get(i++));
        String frequentRange = parameterValues.get(i++);
        double cordLength = Double.parseDouble(parameterValues.get(i));
        return new Speakers(Appliance.Type.SPEAKERS, powerConsumption,
                numberOfSpeakers, frequentRange, cordLength);
    }
}
