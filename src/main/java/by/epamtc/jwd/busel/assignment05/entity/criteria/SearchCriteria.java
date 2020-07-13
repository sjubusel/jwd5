package by.epamtc.jwd.busel.assignment05.entity.criteria;

public final class SearchCriteria {
    private static final Class<Double> DOUBLE_CLASS = Double.class;
    private static final Class<Integer> INTEGER_CLASS = Integer.class;
    private static final Class<String> STRING_CLASS = String.class;


    public enum Oven {
        POWER_CONSUMPTION(DOUBLE_CLASS), WEIGHT(DOUBLE_CLASS),
        CAPACITY(DOUBLE_CLASS), DEPTH(DOUBLE_CLASS), HEIGHT(DOUBLE_CLASS),
        WIDTH(DOUBLE_CLASS);
        Class<?> classStructure;

        Oven(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    public enum Laptop {
        BATTERY_CAPACITY(DOUBLE_CLASS), OS(STRING_CLASS),
        MEMORY_ROM(DOUBLE_CLASS), SYSTEM_MEMORY(DOUBLE_CLASS),
        CPU(DOUBLE_CLASS), DISPLAY_INCHS(DOUBLE_CLASS);
        Class<?> classStructure;

        Laptop(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    public enum Refrigerator {
        POWER_CONSUMPTION(DOUBLE_CLASS), WEIGHT(DOUBLE_CLASS),
        FREEZER_CAPACITY(DOUBLE_CLASS), OVERALL_CAPACITY(DOUBLE_CLASS),
        HEIGHT(DOUBLE_CLASS), WIDTH(DOUBLE_CLASS);
        Class<?> classStructure;

        Refrigerator(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    public enum VacuumCleaner {
        POWER_CONSUMPTION(DOUBLE_CLASS), FILTER_TYPE(STRING_CLASS),
        BAG_TYPE(STRING_CLASS), WAND_TYPE(STRING_CLASS),
        MOTOR_SPEED_REGULATION(DOUBLE_CLASS), CLEANING_WIDTH(DOUBLE_CLASS);
        Class<?> classStructure;

        VacuumCleaner(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    public enum TabletPc {
        BATTERY_CAPACITY(DOUBLE_CLASS), DISPLAY_INCHES(DOUBLE_CLASS),
        MEMORY_ROM(DOUBLE_CLASS), FLASH_MEMORY_CAPACITY(DOUBLE_CLASS),
        COLOR(STRING_CLASS);
        Class<?> classStructure;

        TabletPc(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    public enum Speakers {
        POWER_CONSUMPTION(DOUBLE_CLASS), NUMBER_OF_SPEAKERS(INTEGER_CLASS),
        FREQUENCY_RANGE(STRING_CLASS), CORD_LENGTH(DOUBLE_CLASS);
        Class<?> classStructure;

        Speakers(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }
    }

    private SearchCriteria() {
    }
}
