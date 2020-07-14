package by.epamtc.jwd.busel.assignment05.main;

import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;
import by.epamtc.jwd.busel.assignment05.main.printer.impl.*;

import java.util.HashMap;
import java.util.Map;

import static by.epamtc.jwd.busel.assignment05.entity.Appliance.Type.*;

public class AppliancePrinterProvider {
    private final Map<String, AppliancePrinter> repository = new HashMap<>();

    AppliancePrinterProvider() {
        repository.put(OVEN.getName(), new OvenPrinter());
        repository.put(LAPTOP.getName(), new LaptopPrinter());
        repository.put(REFRIGERATOR.getName(), new RefrigeratorPrinter());
        repository.put(VACUUM_CLEANER.getName(), new VacuumCleanerPrinter());
        repository.put(TABLET_PC.getName(), new TabletPcPrinter());
        repository.put(SPEAKERS.getName(), new SpeakersPrinter());
    }

    public AppliancePrinter getAppliancePrinter(String typeName) {
        return repository.get(typeName);
    }
}
