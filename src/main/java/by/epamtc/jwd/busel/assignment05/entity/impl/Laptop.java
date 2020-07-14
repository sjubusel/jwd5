package by.epamtc.jwd.busel.assignment05.entity.impl;

import by.epamtc.jwd.busel.assignment05.entity.Appliance;

public class Laptop implements Appliance {
    private static final long serialVersionUID = -7974436817656857374L;
    private Type type;
    private double batteryCapacity;
    private String operatingSystem;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop() {
    }

    public Laptop(Type type, double batteryCapacity, String operatingSystem,
            double memoryRom, double systemMemory, double cpu,
            double displayInches) {
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return (type == laptop.type)
                && (batteryCapacity == laptop.batteryCapacity)
                && operatingSystem.equals(laptop.operatingSystem)
                && (memoryRom == laptop.memoryRom)
                && (systemMemory == laptop.systemMemory)
                && (cpu == laptop.cpu)
                && (displayInches == laptop.displayInches);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + ((type == null) ? 0 : type.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(batteryCapacity);
        hash = 31 * hash + ((operatingSystem == null)
                            ? 0
                            : operatingSystem.hashCode());
        hash = 31 * hash + (int) Double.doubleToLongBits(memoryRom);
        hash = 31 * hash + (int) Double.doubleToLongBits(systemMemory);
        hash = 31 * hash + (int) Double.doubleToLongBits(cpu);
        hash = 31 * hash + (int) Double.doubleToLongBits(displayInches);
        return hash;
    }

    @Override
    public String receiveTypeName() {
        return type.getName();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + type +
                ", batteryCapacity=" + batteryCapacity +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
