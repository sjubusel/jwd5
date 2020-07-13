package by.epamtc.jwd.busel.assignment05.entity.factory;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

import java.util.List;
/*
Creator (GoF Factory Method Pattern)
 */
public interface ApplianceCreator {
    /*
    factoryMethod (GoF Factory Method Pattern
     */
    Appliance createAppliance(List<String> parameterValues);
}
