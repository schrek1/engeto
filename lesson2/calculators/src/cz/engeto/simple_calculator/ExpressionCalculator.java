package cz.engeto.simple_calculator;

import java.util.Locale;
import java.util.Scanner;

public class ExpressionCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Calculator:");
        while (true) {
            System.out.print("Type arithmetic Expression: ");
            String expression = sc.nextLine();

            // Exit if user input: exit
            if (expression.equalsIgnoreCase("exit")) break;

            double result = expre(expression);
            System.out.println(expression + "= " + result);
        }
        sc.close();
    }

    // Recursive method to evaluate arithmetic expression.
    public static double expre(String expre) {

        if (!(expre.contains("+") || expre.contains("-") || expre.contains("*") || expre.contains("/"))) {
            return Integer.valueOf(expre);
        }

        double result = 0;
        for (int i = 0; i < expre.length(); i++) {

            char symbol = expre.charAt(i);
            if (!Character.isDigit(symbol)) { // Symbol

                double operand1 = Integer.parseInt(expre.substring(0, i));

                switch (symbol) {
                    case '+':
                        result = operand1 + expre(expre.substring(i + 1));
                        break;
                    case '-':
                        result = operand1 - expre(expre.substring(i + 1));
                        break;
                    case '*':
                        result = operand1 * expre(expre.substring(i + 1));
                        break;
                    case '/':
                        result = operand1 / expre(expre.substring(i + 1));
                        break;
                }

                break;
            }
        }
        return result;
    }

    void foo() {
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
//
    }
}
