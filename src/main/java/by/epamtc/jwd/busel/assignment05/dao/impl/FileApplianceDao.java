package by.epamtc.jwd.busel.assignment05.dao.impl;

import by.epamtc.jwd.busel.assignment05.dao.ApplianceDao;
import by.epamtc.jwd.busel.assignment05.dao.exception.DaoException;
import by.epamtc.jwd.busel.assignment05.dao.util.FileAccessAssistant;
import by.epamtc.jwd.busel.assignment05.dao.util.LineIntoApplianceParser;
import by.epamtc.jwd.busel.assignment05.dao.util.LineValidator;
import by.epamtc.jwd.busel.assignment05.entity.Appliance;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileApplianceDao implements ApplianceDao {
    private FileAccessAssistant fileAssistant = FileAccessAssistant.getInstance();
    private LineValidator validator = new LineValidator();
    private LineIntoApplianceParser parser = new LineIntoApplianceParser();

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<Appliance> appliances = new ArrayList<>();
        Appliance.Type type = criteria.getSearchGroupName();

        try (FileReader in = new FileReader(fileAssistant.getSourceFilePath());
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                if (validator.isLineValid(line, criteria)) {
                    Appliance appliance = parser.parseAppliance(line, type);
                    appliances.add(appliance);
                }
            }
        } catch (FileNotFoundException e) {
            throw new DaoException("FILE NOT FOUND", e);
        } catch (IOException e) {
            throw new DaoException("OTHER DAO IO ERROR", e);
        }

        return appliances;
    }
}
