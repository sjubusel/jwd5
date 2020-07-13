package by.epamtc.jwd.busel.assignment05.dao.util;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.factory.ApplianceCreator;
import by.epamtc.jwd.busel.assignment05.entity.factory.impl.*;

import java.util.HashMap;
import java.util.Map;

/*
package-access is used intentionally.
 */
public class ApplianceCreatorProvider {
    private final Map<Appliance.Type, ApplianceCreator> repository;

    {
        repository = new HashMap<>();
    }

    ApplianceCreatorProvider() {
        repository.put(Appliance.Type.OVEN, new OvenCreator());
        repository.put(Appliance.Type.LAPTOP, new LaptopCreator());
        repository.put(Appliance.Type.REFRIGERATOR, new RefrigeratorCreator());
        repository.put(Appliance.Type.VACUUM_CLEANER, new VacuumCleanerCreator());
        repository.put(Appliance.Type.TABLET_PC, new TabletPcCreator());
        repository.put(Appliance.Type.SPEAKERS, new SpeakersCreator());
    }

    public ApplianceCreator getCreator(Appliance.Type applianceType) {
        return repository.get(applianceType);
    }
}
