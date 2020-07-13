package by.epamtc.jwd.busel.assignment05.entity.criteria;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private Appliance.Type searchGroupName;
    private Map<String, Object> parameters = new HashMap<>();

    public Criteria(Appliance.Type searchGroupName) {
        this.searchGroupName = searchGroupName;
    }

    public Appliance.Type getSearchGroupName() {
        return searchGroupName;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void add(String parameter, Object value) {
        parameters.put(parameter, value);
    }

}
