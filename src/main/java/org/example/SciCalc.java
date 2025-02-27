package org.example;

import java.util.Scanner;

public class SciCalc {
    public static double factorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid Number");
        }
        double fact = 1;
        for (double i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid Number");
        }
        return Math.sqrt(number);
    }

    public static double logarithm(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for non-positive numbers");
        }
        return Math.log(number);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------Here is your scientific calculator----------------------------------");


        while (true) {
            System.out.println("1. square-root");
            System.out.println("2. factorial of number");
            System.out.println("3. Natural logarithm base e");
            System.out.println("4. Power function");
            System.out.println("5: Exit");
            System.out.print("Select Which operation do you want to perform? -->");

            int op = sc.next().charAt(0);

            double number = 0.0, a = 0 , b = 0;

            if (op == '5') {
                break;
            } else if (op != '4') {
                System.out.print("\nPlease Enter Your Lucky Number: ");
                number = sc.nextDouble();
                System.out.println();
            } else {
                System.out.print("\nPlease Enter first number: ");
                a = sc.nextDouble();
                System.out.print("\nPlease Enter second number: ");
                b = sc.nextDouble();
                System.out.println();
            }

            try {

                double result;
                switch (op) {
                    case '1': result = squareRoot(number); break;
                    case '2': result = factorial(number); break;
                    case '3': result = logarithm(number); break;
                    case '4': result = power(a, b); break;
                    default: throw new IllegalArgumentException("Invalide operation");
                }
                System.out.println("result: "+ result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();

    }
}