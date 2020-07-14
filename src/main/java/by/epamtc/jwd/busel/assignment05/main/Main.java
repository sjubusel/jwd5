package by.epamtc.jwd.busel.assignment05.main;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;
import by.epamtc.jwd.busel.assignment05.service.ApplianceService;
import by.epamtc.jwd.busel.assignment05.service.ServiceFactory;
import by.epamtc.jwd.busel.assignment05.service.exception.ServiceException;

import java.util.List;

import static by.epamtc.jwd.busel.assignment05.entity.criteria.SearchCriteria.*;

public class Main {
    public static void main(String[] args) {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Appliance.Type.OVEN);
        criteriaOven.add(Oven.WIDTH.toString(), 70.0);

        try {
            appliances = service.find(criteriaOven);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaOven);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaLaptop = new Criteria(Appliance.Type.LAPTOP);
        criteriaLaptop.add(Laptop.BATTERY_CAPACITY.toString(), 1.0);

        try {
            appliances = service.find(criteriaLaptop);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaLaptop);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaRefrigerator = new Criteria(Appliance.Type.REFRIGERATOR);
        criteriaRefrigerator.add(Refrigerator.WEIGHT.toString(), 20.0);

        try {
            appliances = service.find(criteriaRefrigerator);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaRefrigerator);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaVacuumCleaner = new Criteria(Appliance.Type.VACUUM_CLEANER);
        criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE.toString(), "B");

        try {
            appliances = service.find(criteriaVacuumCleaner);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaVacuumCleaner);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPc = new Criteria(Appliance.Type.TABLET_PC);
        criteriaTabletPc.add(TabletPc.DISPLAY_INCHES.toString(), 15.0);
        criteriaTabletPc.add(TabletPc.BATTERY_CAPACITY.toString(), 4.0);
        criteriaTabletPc.add(TabletPc.COLOR.toString(), "red");

        try {
            appliances = service.find(criteriaTabletPc);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaTabletPc);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaSpeakers = new Criteria(Appliance.Type.SPEAKERS);
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE.toString(), "2-3.5");
        criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS.toString(), 4);

        try {
            appliances = service.find(criteriaSpeakers);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaSpeakers);
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        Criteria criteriaNotFound = new Criteria(Appliance.Type.SPEAKERS);
        criteriaNotFound.add(Speakers.FREQUENCY_RANGE.toString(), "1");
        criteriaNotFound.add(Speakers.NUMBER_OF_SPEAKERS.toString(), 4);

        try {
            appliances = service.find(criteriaNotFound);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteriaNotFound);
        System.out.println();

    }
}
