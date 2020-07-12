package by.epamtc.jwd.busel.assignment05.dao;

import by.epamtc.jwd.busel.assignment05.dao.exception.DaoException;
import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDao {
    List<Appliance> find(Criteria criteria) throws DaoException;
}
