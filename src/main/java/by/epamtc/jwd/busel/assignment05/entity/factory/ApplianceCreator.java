package by.epamtc.jwd.busel.assignment05.entity.factory;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

import java.util.List;

public interface ApplianceCreator {
    Appliance createAppliance(List<String> parameterValues);
}
