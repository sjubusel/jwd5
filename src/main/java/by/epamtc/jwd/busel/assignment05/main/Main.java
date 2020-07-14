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

        Criteria criteria1 = new Criteria(Appliance.Type.TABLET_PC);
        criteria1.add(TabletPc.DISPLAY_INCHES.toString(), 15.0);
        criteria1.add(TabletPc.BATTERY_CAPACITY.toString(), 4.0);
        criteria1.add(TabletPc.COLOR.toString(), "red");

        try {
            appliances = service.find(criteria1);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteria1);

        ////////////////////////////////////////////////////////////////////////

        Criteria criteria2 = new Criteria(Appliance.Type.OVEN);
        criteria2.add(Oven.WIDTH.toString(), 70.0);

        try {
            appliances = service.find(criteria2);
        } catch (ServiceException e) {
            System.err.println(e.toString());
            System.out.println("SOMETHING WENT WRONG, PLEASE CONTACT US.\n" +
                    "sergey.busel@tut.by");
            return;
        }

        PrintApplianceInfo.print(appliances, criteria2);
    }
}
