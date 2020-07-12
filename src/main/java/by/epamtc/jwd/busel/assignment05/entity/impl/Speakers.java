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

    public Speakers(Type type, double powerConsumption, int numberOfSpeakers, String frequentRange, double cordLength) {
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

        return false;
    }

    @Override
    public int hashCode() {

        return -1;
    }

    @Override
    public String receiveTypeName() {
        return null;
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
