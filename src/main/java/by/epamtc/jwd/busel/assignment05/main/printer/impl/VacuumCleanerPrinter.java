package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.VacuumCleaner;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.VacuumCleaner.*;

public class VacuumCleanerPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        VacuumCleaner cleaner = (VacuumCleaner) appliance;
        String strAppliance = cleaner.receiveTypeName() + TYPE_DELIMITER +
                POWER_CONSUMPTION + KEY_VALUE_DELIMITER +
                cleaner.getPowerConsumption() + PARAMETER_DELIMITER +
                FILTER_TYPE + KEY_VALUE_DELIMITER +
                cleaner.getFilterType() + PARAMETER_DELIMITER +
                BAG_TYPE + KEY_VALUE_DELIMITER +
                cleaner.getBagType() + PARAMETER_DELIMITER +
                WAND_TYPE + KEY_VALUE_DELIMITER +
                cleaner.getWandType() + PARAMETER_DELIMITER +
                MOTOR_SPEED_REGULATION + KEY_VALUE_DELIMITER +
                cleaner.getMotorSpeedRegulation() + PARAMETER_DELIMITER +
                CLEANING_WIDTH + KEY_VALUE_DELIMITER +
                cleaner.getCleaningWidth() + RECORD_ENDING;
        System.out.println(strAppliance);
    }
}
