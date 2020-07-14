package by.epamtc.jwd.busel.assignment05.main;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;

import java.util.List;

public class PrintApplianceInfo {
    private static AppliancePrinterProvider provider
            = new AppliancePrinterProvider();

    public static void print(List<Appliance> appliances, Criteria criteria) {
        System.out.printf("RESULT OF QUERY (%s : %s):\n",
                criteria.getSearchGroupName(), criteria.getParameters());

        if (appliances.size() > 0) {
            printAppliances(appliances);
        } else {
            System.out.println("NOT FOUND.");
        }

    }

    private static void printAppliances(List<Appliance> appliances) {
        AppliancePrinter printer;
        for (Appliance appliance : appliances) {
            printer = provider.getAppliancePrinter(appliance.receiveTypeName());
            printer.print(appliance);
        }
    }
}
