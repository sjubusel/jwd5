package by.epamtc.jwd.busel.assignment05.service;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);
}
