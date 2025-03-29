package week_9;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user for input
            System.out.print("Enter a valid integer number: ");
            String input = scanner.nextLine();
            
            // Attempt to parse the input to integer
            int number = Integer.parseInt(input);
            
            // Perform some calculation if parsing succeeds
            int result = 100 / number;
            
            System.out.println("Result of 100 divided by " + number + " is: " + result);
            
        } catch (NumberFormatException e) {
            // Catch parsing exception if input is not a valid integer
            System.out.println("Unchecked Exception occurred: Invalid number format!");
            System.out.println("Exception Details: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            // Catch arithmetic exception like division by zero
            System.out.println("Unchecked Exception occurred: Arithmetic error!");
            System.out.println("Exception Details: " + e.getMessage());
            
        } finally {
            // Close the scanner to avoid memory leaks
            scanner.close();
        }
        
        System.out.println("Program execution completed.");
    }
}
