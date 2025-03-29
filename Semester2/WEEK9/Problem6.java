package week_9;

public class Problem6{
    public static void main(String[] args) {

        try {
            int numerator = 20;
            int denominator = 0; // Division by zero scenario

            int result = numerator / denominator; // This triggers ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Specific handling for severe runtime exception (division by zero)
            System.err.println("Exception caught: " + e.getMessage());
            System.err.println("Error: You cannot divide by zero.");
        } finally {
            System.out.println("End of program execution.");
        }
    }
}
