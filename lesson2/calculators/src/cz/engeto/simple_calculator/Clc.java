package cz.engeto.simple_calculator;

import java.util.Locale;
import java.util.Scanner;

public class Clc {

    private static int aaa;
    private static final char TERMINATION_SYMBOL = 'x';



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        boolean nextRound;
        do {
            nextRound = calculation(scanner);
        } while (nextRound);

        System.out.println("app shutdown...");

    }

    static boolean calculation(Scanner scanner) {
        System.out.println("Enter two numbers: ");

        String input;

        double first = 0;
        boolean isFirstOk;
        do {
            System.out.print("first: ");

            input = scanner.nextLine();

            if (input.equals("x")) {
                return false;
            }

            try {
                first = Double.parseDouble(input);
                isFirstOk = true;
            } catch (Exception e) {
                System.out.println("spatny vstup");
                isFirstOk = false;
            }

        } while (!isFirstOk);


        double second = 0;
        boolean isSecondOk;
        do {
            System.out.print("second: ");

            input = scanner.nextLine();

            if (input.equals("x")) return false;

            try {
                second = Double.parseDouble(input);
                isSecondOk = true;
            } catch (Exception e) {
                System.out.println("spatny vstup");
                isSecondOk = false;
            }
        } while (!isSecondOk);


        char operator;
        boolean isValidOperator;
        do {
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.nextLine().charAt(0);
            isValidOperator = operatorValidation(operator);
            if (!isValidOperator) System.out.println("spatny operator");
        } while (isValidOperator);

        double result = 0;
        if (operator == '+') { // use switch
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        } else if (operator == TERMINATION_SYMBOL) {
            return false;
        }

        System.out.printf(first + " " + operator + " " + second + " = " + result);

        return true;
    }

    static boolean operatorValidation(char operator) {
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == TERMINATION_SYMBOL) {
            return true;
        } else {
            return false;
        }
    }

}
