package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.Refrigerator;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.Refrigerator.*;

public class RefrigeratorPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        String strAppliance = refrigerator.receiveTypeName() + TYPE_DELIMITER +
                POWER_CONSUMPTION + KEY_VALUE_DELIMITER +
                refrigerator.getPowerConsumption() + PARAMETER_DELIMITER +
                WEIGHT + KEY_VALUE_DELIMITER +
                refrigerator.getWeight() + PARAMETER_DELIMITER +
                FREEZER_CAPACITY + KEY_VALUE_DELIMITER +
                refrigerator.getFreezerCapacity() + PARAMETER_DELIMITER +
                OVERALL_CAPACITY + KEY_VALUE_DELIMITER +
                refrigerator.getOverallCapacity() + PARAMETER_DELIMITER +
                HEIGHT + KEY_VALUE_DELIMITER +
                refrigerator.getHeight() + PARAMETER_DELIMITER +
                WIDTH + KEY_VALUE_DELIMITER +
                refrigerator.getWidth() + RECORD_ENDING;
        System.out.println(strAppliance);

    }
}
