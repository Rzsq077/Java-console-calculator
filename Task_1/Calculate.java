package Task_1;

import java.util.*;

public class Calculate {
    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Substract
    public static double subs(double a, double b) {
        return a - b;

    }

    // Multiplication
    public static double multi(double a, double b) {
        return a * b;
    }

    // Division
    public static double divis(double a, double b) {
        if (b == 0) {
            System.out.println("Can't Divide With Zero Please Choose Another Number");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Java Console Calculator ===");

        while (keepRunning) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting Calculator... Goodbye!");
                break;
            }

            // Get numbers from user
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subs(num1, num2);
                    break;
                case 3:
                    result = multi(num1, num2);
                    break;
                case 4:
                    result = divis(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
