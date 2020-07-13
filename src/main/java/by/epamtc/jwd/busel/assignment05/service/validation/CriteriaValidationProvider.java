package by.epamtc.jwd.busel.assignment05.service.validation;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.service.validation.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CriteriaValidationProvider {
    private final Map<Appliance.Type, CriteriaValidation> repository
            = new HashMap<>();

    CriteriaValidationProvider() {
        repository.put(Appliance.Type.OVEN, new OvenCriteriaValidation());
        repository.put(Appliance.Type.LAPTOP, new LaptopCriteriaValidation());
        repository.put(Appliance.Type.REFRIGERATOR,
                new RefrigeratorCriteriaValidation());
        repository.put(Appliance.Type.VACUUM_CLEANER,
                new VacuumCleanerCriteriaValidation());
        repository.put(Appliance.Type.TABLET_PC,
                new TabletPcCriteriaValidation());
        repository.put(Appliance.Type.SPEAKERS,
                new SpeakersCriteriaValidation());
    }

    public CriteriaValidation getValidation(Appliance.Type applianceType) {
        return repository.get(applianceType);
    }
}
