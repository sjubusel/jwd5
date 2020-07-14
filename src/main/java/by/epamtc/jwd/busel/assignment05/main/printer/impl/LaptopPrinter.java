package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.Laptop;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.Laptop.*;

public class LaptopPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        String strAppliance = laptop.receiveTypeName() + TYPE_DELIMITER +
                BATTERY_CAPACITY + KEY_VALUE_DELIMITER +
                laptop.getBatteryCapacity() + PARAMETER_DELIMITER +
                OS + KEY_VALUE_DELIMITER +
                laptop.getOperatingSystem() + PARAMETER_DELIMITER +
                MEMORY_ROM + KEY_VALUE_DELIMITER +
                laptop.getMemoryRom() + PARAMETER_DELIMITER +
                SYSTEM_MEMORY + KEY_VALUE_DELIMITER +
                laptop.getSystemMemory() + PARAMETER_DELIMITER +
                CPU + KEY_VALUE_DELIMITER +
                laptop.getCpu() + PARAMETER_DELIMITER +
                DISPLAY_INCHS + KEY_VALUE_DELIMITER +
                laptop.getDisplayInches() + RECORD_ENDING;
        System.out.println(strAppliance);
    }
}
