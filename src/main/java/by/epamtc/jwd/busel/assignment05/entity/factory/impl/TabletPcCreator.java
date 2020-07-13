package by.epamtc.jwd.busel.assignment05.entity.factory.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.factory.ApplianceCreator;
import by.epamtc.jwd.busel.assignment05.entity.impl.TabletPc;

import java.util.List;

public class TabletPcCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double batteryCapacity = Double.parseDouble(parameterValues.get(i++));
        double displayInches = Double.parseDouble(parameterValues.get(i++));
        double memoryRom = Double.parseDouble(parameterValues.get(i++));
        double flashMemoryCapacity = Double.parseDouble(parameterValues.get(i++));
        String color = parameterValues.get(i);
        return new TabletPc(Appliance.Type.TABLET_PC, batteryCapacity,
                displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
