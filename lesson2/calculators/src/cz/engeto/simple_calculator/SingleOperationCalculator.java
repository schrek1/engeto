package cz.engeto.simple_calculator;

import java.util.Locale;
import java.util.Scanner;

public class SingleOperationCalculator {

    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter number 1: ");
        a = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter number 2: ");
        b = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Please enter operation + - / or *: ");
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        if (operation.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
        if (operation.equals("/")) {
            System.out.println(a + " ÷ " + b + " = " + (a / b));
        }
        if (operation.equals("*")) {
            System.out.println(a + " x " + b + " = " + (a * b));
        }

    }

}
