package by.epamtc.jwd.busel.assignment05.dao.util;

import by.epamtc.jwd.busel.assignment05.dao.exception.DaoException;
import by.epamtc.jwd.busel.assignment05.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineSelector {
    private FileAccessAssistant fileAssistant = FileAccessAssistant.getInstance();
    private LineValidator validator = new LineValidator();

    public List<String> selectAppliances(Criteria criteria) throws DaoException {
        List<String> strAppliances = new ArrayList<>();

        try (FileReader in = new FileReader(fileAssistant.getSourceFilePath());
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                if (validator.isLineValid(line, criteria)) {
                    strAppliances.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new DaoException("FILE NOT FOUND", e);
        } catch (IOException e) {
            throw new DaoException("OTHER DAO IO ERROR", e);
        }

        return strAppliances;
    }
}
