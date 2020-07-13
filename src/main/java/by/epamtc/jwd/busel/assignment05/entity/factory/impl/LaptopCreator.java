package by.epamtc.jwd.busel.assignment05.entity.factory.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.factory.ApplianceCreator;
import by.epamtc.jwd.busel.assignment05.entity.impl.Laptop;

import java.util.List;

public class LaptopCreator implements ApplianceCreator {

    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double batteryCapacity = Double.parseDouble(parameterValues.get(i++));
        String operatingSystem = parameterValues.get(i++);
        double memoryRom = Double.parseDouble(parameterValues.get(i++));
        double systemMemory = Double.parseDouble(parameterValues.get(i++));
        double cpu = Double.parseDouble(parameterValues.get(i++));
        double displayInches = Double.parseDouble(parameterValues.get(i));
        return new Laptop(Appliance.Type.LAPTOP, batteryCapacity,
                operatingSystem, memoryRom, systemMemory, cpu, displayInches);
    }
}
