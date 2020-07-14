package by.epamtc.jwd.busel.assignment05.entity.criteria;

/*
Enums of this class are used while validation of inputted parameters values.
Each enum has method "public boolean isAcceptable(Object paramValue)", which is
to contain acceptable boundaries of parameter value.
For example:
If there is a necessity to make a parameter "DISPLAY_INCHS" of enum "Laptop"
between "10" and "21" inches, a relevant method  "isAcceptable" will be
overridden in the following way:
@<code>
...
DISPLAY_INCHS(DOUBLE_CLASS) {
    @Override
        public boolean isAcceptable(Object paramValue) {
            Double value = (Double) paramValue;
            return (value >= 10.0) && (value <= 21.0);
        }
};
...
</code>
 */
public final class SearchCriteria {
    private static final Class<Double> DOUBLE_CLASS = Double.class;
    private static final Class<Integer> INTEGER_CLASS = Integer.class;
    private static final Class<String> STRING_CLASS = String.class;

    public enum Oven {
        POWER_CONSUMPTION(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        WEIGHT(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        DEPTH(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        HEIGHT(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        WIDTH(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        };
        private Class<?> classStructure;

        Oven(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    public enum Laptop {
        BATTERY_CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return (value >= 0);
            }
        },
        OS(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                String value = (String) paramValue;
                return value.equals("Windows") || value.equals("Linux");
            }
        },
        MEMORY_ROM(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        SYSTEM_MEMORY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        CPU(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        DISPLAY_INCHS(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        };
        private Class<?> classStructure;

        Laptop(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    public enum Refrigerator {
        POWER_CONSUMPTION(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        WEIGHT(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        FREEZER_CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        OVERALL_CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        HEIGHT(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        WIDTH(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        };
        private Class<?> classStructure;

        Refrigerator(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    public enum VacuumCleaner {
        POWER_CONSUMPTION(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        FILTER_TYPE(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                return true;
            }
        },
        BAG_TYPE(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                return true;
            }
        },
        WAND_TYPE(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                return true;
            }
        },
        MOTOR_SPEED_REGULATION(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        CLEANING_WIDTH(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        };
        private Class<?> classStructure;

        VacuumCleaner(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    public enum TabletPc {
        BATTERY_CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        DISPLAY_INCHES(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        MEMORY_ROM(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        FLASH_MEMORY_CAPACITY(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        COLOR(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                return true;
            }
        };
        private Class<?> classStructure;

        TabletPc(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    public enum Speakers {
        POWER_CONSUMPTION(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        },
        NUMBER_OF_SPEAKERS(INTEGER_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Integer value = (Integer) paramValue;
                return value >= 0;
            }
        },
        FREQUENCY_RANGE(STRING_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                return true;
            }
        },
        CORD_LENGTH(DOUBLE_CLASS) {
            @Override
            public boolean isAcceptable(Object paramValue) {
                Double value = (Double) paramValue;
                return value >= 0;
            }
        };
        private Class<?> classStructure;

        Speakers(Class<?> classStructure) {
            this.classStructure = classStructure;
        }

        public Class<?> getClassStructure() {
            return classStructure;
        }

        public abstract boolean isAcceptable(Object paramValue);
    }

    private SearchCriteria() {
    }
}
