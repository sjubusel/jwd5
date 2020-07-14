package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class VacuumCleaner implements Appliance {
    private static final long serialVersionUID = 1684329412579605346L;
    private Type type;
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(Type type, double powerConsumption, String filterType,
            String bagType, String wandType, double motorSpeedRegulation,
            double cleaningWidth) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        VacuumCleaner vacuumCleaner = (VacuumCleaner) o;
        return (type == vacuumCleaner.type)
                && (powerConsumption == vacuumCleaner.powerConsumption)
                && filterType.equals(vacuumCleaner.filterType)
                && bagType.equals(vacuumCleaner.bagType)
                && wandType.equals(vacuumCleaner.wandType)
                && (motorSpeedRegulation == vacuumCleaner.motorSpeedRegulation)
                && (cleaningWidth == vacuumCleaner.cleaningWidth);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (type == null ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(powerConsumption);
        hash = 31 * hash + (filterType == null ? 0 : filterType.hashCode());
        hash = 31 * hash + (bagType == null ? 0 : bagType.hashCode());
        hash = 31 * hash + (wandType == null ? 0 : wandType.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(motorSpeedRegulation);
        hash = 31 * hash + (int) Double.doubleToLongBits(cleaningWidth);
        return hash;
    }

    @Override
    public String receiveTypeName() {
        return type.getName();
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "type=" + type +
                ", powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
