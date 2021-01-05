package cz.engeto.java.gui.calculator;

public enum Operation {
    ADD {
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double calculate(double a, double b) {
            return a / b;
        }
    };

    abstract double calculate(double a, double b);
}
