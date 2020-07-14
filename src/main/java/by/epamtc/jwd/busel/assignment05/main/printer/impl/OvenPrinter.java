package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.Oven;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.Oven.*;

public class OvenPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        Oven oven = (Oven) appliance;
        String strAppliance = oven.receiveTypeName() + TYPE_DELIMITER +
                POWER_CONSUMPTION + KEY_VALUE_DELIMITER +
                oven.getPowerConsumption() + PARAMETER_DELIMITER +
                WEIGHT + KEY_VALUE_DELIMITER +
                oven.getWeight() + PARAMETER_DELIMITER +
                CAPACITY + KEY_VALUE_DELIMITER +
                oven.getCapacity() + PARAMETER_DELIMITER +
                DEPTH + KEY_VALUE_DELIMITER +
                oven.getDepth() + PARAMETER_DELIMITER +
                HEIGHT + KEY_VALUE_DELIMITER +
                oven.getHeight() + PARAMETER_DELIMITER +
                WIDTH + KEY_VALUE_DELIMITER +
                oven.getWidth() + RECORD_ENDING;
        System.out.println(strAppliance);
    }
}
