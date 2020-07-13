package by.epamtc.jwd.busel.assignment05.dao.impl;

import by.epamtc.jwd.busel.assignment05.dao.ApplianceDao;
import by.epamtc.jwd.busel.assignment05.dao.exception.DaoException;
import by.epamtc.jwd.busel.assignment05.dao.util.LineIntoApplianceParser;
import by.epamtc.jwd.busel.assignment05.dao.util.LineSelector;
import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class FileApplianceDao implements ApplianceDao {
    LineSelector selector = new LineSelector();
    LineIntoApplianceParser parser = new LineIntoApplianceParser();

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<String> correctStringRecords = selector.selectAppliances(criteria);

        List<Appliance> appliances = new ArrayList<>();
        Appliance.Type applianceType = criteria.getSearchGroupName();
        for (String applianceRecord : correctStringRecords) {
            appliances.add(parser.parseAppliance(applianceRecord, applianceType));
        }

        return appliances;
    }
}
