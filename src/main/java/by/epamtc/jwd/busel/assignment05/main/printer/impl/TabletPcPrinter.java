package by.epamtc.jwd.busel.assignment05.main.printer.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.impl.TabletPc;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.TabletPc.*;

public class TabletPcPrinter implements AppliancePrinter {
    @Override
    public void print(Appliance appliance) {
        TabletPc tabletPc = (TabletPc) appliance;
        String strAppliance = tabletPc.receiveTypeName() + TYPE_DELIMITER +
                BATTERY_CAPACITY + KEY_VALUE_DELIMITER +
                tabletPc.getBatteryCapacity() + PARAMETER_DELIMITER +
                DISPLAY_INCHES + KEY_VALUE_DELIMITER +
                tabletPc.getDisplayInches() + PARAMETER_DELIMITER +
                MEMORY_ROM + KEY_VALUE_DELIMITER +
                tabletPc.getMemoryRom() + PARAMETER_DELIMITER +
                FLASH_MEMORY_CAPACITY + KEY_VALUE_DELIMITER +
                tabletPc.getFlashMemoryCapacity() + PARAMETER_DELIMITER +
                COLOR + KEY_VALUE_DELIMITER +
                tabletPc.getColor() + RECORD_ENDING;
        System.out.println(strAppliance);
    }
}
