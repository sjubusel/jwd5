package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class TabletPc implements Appliance {
    private static final long serialVersionUID = 4715205936083917074L;
    private Type type;
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPc() {
    }

    public TabletPc(Type type, double batteryCapacity, double displayInches,
            double memoryRom, double flashMemoryCapacity, String color) {
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        TabletPc tabletPc = (TabletPc) o;
        return (type == tabletPc.type)
                && (batteryCapacity == tabletPc.batteryCapacity)
                && (displayInches == tabletPc.displayInches)
                && (memoryRom == tabletPc.memoryRom)
                && (flashMemoryCapacity == tabletPc.flashMemoryCapacity)
                && color.equals(tabletPc.color);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (type == null ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(batteryCapacity);
        hash = 31 * hash + (int) Double.doubleToLongBits(displayInches);
        hash = 31 * hash + (int) Double.doubleToLongBits(memoryRom);
        hash = 31 * hash + (int) Double.doubleToLongBits(flashMemoryCapacity);
        hash = 31 * hash + (color == null ? 0 : color.hashCode());
        return hash;
    }

    @Override
    public String receiveTypeName() {
        return type.getName();
    }

    @Override
    public String toString() {
        return "TabletPc{" +
                "type=" + type +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
