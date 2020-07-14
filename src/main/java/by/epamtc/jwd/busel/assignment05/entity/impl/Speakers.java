package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class Speakers implements Appliance {
    private static final long serialVersionUID = -594141459049731349L;
    private Type type;
    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequentRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(Type type, double powerConsumption, int numberOfSpeakers,
            String frequentRange, double cordLength) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequentRange = frequentRange;
        this.cordLength = cordLength;
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

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequentRange() {
        return frequentRange;
    }

    public void setFrequentRange(String frequentRange) {
        this.frequentRange = frequentRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Speakers speakers = (Speakers) o;
        return (type == speakers.type)
                && (powerConsumption == speakers.powerConsumption)
                && (numberOfSpeakers == speakers.numberOfSpeakers)
                && frequentRange.equals(speakers.frequentRange)
                && (cordLength == speakers.cordLength);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (type == null ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(powerConsumption);
        hash = 31 * hash + numberOfSpeakers;
        hash = 31 * hash + (frequentRange == null
                            ? 0
                            : frequentRange.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(cordLength);
        return hash;
    }

    @Override
    public String receiveTypeName() {
        return type.getName();
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "type=" + type +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequentRange='" + frequentRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
