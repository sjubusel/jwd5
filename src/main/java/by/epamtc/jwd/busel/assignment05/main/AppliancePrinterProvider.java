package by.epamtc.jwd.busel.assignment05.main;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.main.printer.AppliancePrinter;
import by.epamtc.jwd.busel.assignment05.service.validation.CriteriaValidation;
import by.epamtc.jwd.busel.assignment05.service.validation.impl.*;

import java.util.HashMap;
import java.util.Map;

public class AppliancePrinterProvider {
    private final Map<String, AppliancePrinter> repository = new HashMap<>();

    AppliancePrinterProvider() {
//        repository.put(Appliance.Type.OVEN, new OvenCriteriaValidation());
//        repository.put(Appliance.Type.LAPTOP, new LaptopCriteriaValidation());
//        repository.put(Appliance.Type.REFRIGERATOR,
//                new RefrigeratorCriteriaValidation());
//        repository.put(Appliance.Type.VACUUM_CLEANER,
//                new VacuumCleanerCriteriaValidation());
//        repository.put(Appliance.Type.TABLET_PC,
//                new TabletPcCriteriaValidation());
//        repository.put(Appliance.Type.SPEAKERS,
//                new SpeakersCriteriaValidation());
    }

    public AppliancePrinter getAppliancePrinter(String typeName) {
        return repository.get(typeName);
    }
}
