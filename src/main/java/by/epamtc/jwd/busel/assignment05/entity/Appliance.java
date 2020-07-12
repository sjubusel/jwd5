package by.epamtc.jwd.busel.assignment05.entity;

import java.io.Serializable;

public interface Appliance extends Serializable {
    enum Type {
        OVEN("Oven"), LAPTOP("Laptop"), REFRIGERATOR("Refrigerator"),
        VACUUM_CLEANER("VacuumCleaner"), TABLET_PC("TabletPC"),
        SPEAKERS("Speakers");

        private String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    String receiveTypeName();
}
