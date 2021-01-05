package cz.engeto.calculator;

public enum Operation {
    ADD {
        @Override
        double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        double calculate(double a, double b) {
            return a + b;
        }
    },
    MULTIPLY {
        @Override
        double calculate(double a, double b) {
            return a + b;
        }
    },
    DIVIDE {
        @Override
        double calculate(double a, double b) {
            return a + b;
        }
    };

    abstract double calculate(double a, double b);
}
