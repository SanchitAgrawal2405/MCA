package week_9;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer number: ");
            String input = scanner.nextLine();

            // This line might throw NumberFormatException
            int number = Integer.parseInt(input);

            // This line might throw ArithmeticException (e.g., division by zero)
            int result = 100 / number;

            System.out.println("Result: 100 divided by " + number + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Please enter a valid integer.");
            System.out.println("Error Details: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            System.out.println("You cannot divide by zero.");
            System.out.println("Error Details: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Scanner resource closed.");
        }

        System.out.println("Program execution finished.");
    }
}
