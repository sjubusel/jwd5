package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class Refrigerator implements Appliance {
    private static final long serialVersionUID = -4952091167497413529L;
    private Type type;
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(Type type, double powerConsumption, double weight,
            double freezerCapacity, double overallCapacity, double height,
            double width) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Refrigerator refrigerator = (Refrigerator) o;
        return (type == refrigerator.type)
                && powerConsumption == refrigerator.powerConsumption
                && weight == refrigerator.weight
                && freezerCapacity == refrigerator.freezerCapacity
                && overallCapacity == refrigerator.overallCapacity
                && height == refrigerator.height
                && width == refrigerator.width;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (type == null ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(powerConsumption);
        hash = 31 * hash + (int) Double.doubleToLongBits(weight);
        hash = 31 * hash + (int) Double.doubleToLongBits(freezerCapacity);
        hash = 31 * hash + (int) Double.doubleToLongBits(overallCapacity);
        hash = 31 * hash + (int) Double.doubleToLongBits(height);
        hash = 31 * hash + (int) Double.doubleToLongBits(width);
        return hash;
    }

    @Override
    public String receiveTypeName() {
        return type.getName();
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "type=" + type +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
