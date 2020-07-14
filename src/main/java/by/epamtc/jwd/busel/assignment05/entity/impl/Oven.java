package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class Oven implements Appliance {
    private static final long serialVersionUID = -3346361574124474575L;
    private Type type;
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(Type type, double powerConsumption, double weight,
            double capacity, double depth, double height, double width) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Oven oven = (Oven) o;
        return (type == oven.type)
                && (powerConsumption == oven.powerConsumption)
                && (weight == oven.weight) && (capacity == oven.capacity)
                && (depth == oven.depth) && (height == oven.height)
                && (width == oven.width);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (type == null ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(powerConsumption);
        hash = 31 * hash + (int) Double.doubleToLongBits(weight);
        hash = 31 * hash + (int) Double.doubleToLongBits(capacity);
        hash = 31 * hash + (int) Double.doubleToLongBits(depth);
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
        return "Oven{" +
                "type=" + type +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
