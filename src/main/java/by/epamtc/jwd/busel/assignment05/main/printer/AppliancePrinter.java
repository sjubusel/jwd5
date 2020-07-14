package by.epamtc.jwd.busel.assignment05.main.printer;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public interface AppliancePrinter {
    String TYPE_DELIMITER = " : ";
    String PARAMETER_DELIMITER = ", ";
    String KEY_VALUE_DELIMITER = "=";
    String RECORD_ENDING = ";";

    void print(Appliance appliance);
}
