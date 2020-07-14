package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.Speakers;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.Speakers.*;

public class SpeakersPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        String strAppliance = speakers.receiveTypeName() + TYPE_DELIMITER +
                POWER_CONSUMPTION + KEY_VALUE_DELIMITER +
                speakers.getPowerConsumption() + PARAMETER_DELIMITER +
                NUMBER_OF_SPEAKERS + KEY_VALUE_DELIMITER +
                speakers.getNumberOfSpeakers() + PARAMETER_DELIMITER +
                FREQUENCY_RANGE + KEY_VALUE_DELIMITER +
                speakers.getFrequentRange() + PARAMETER_DELIMITER +
                CORD_LENGTH + KEY_VALUE_DELIMITER +
                speakers.getCordLength() + RECORD_ENDING;
        System.out.println(strAppliance);
    }
}
