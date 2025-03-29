package week_9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Problem4 {

    // Logger instance
    private static final Logger logger = LogManager.getLogger(Problem4.class);

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);  // Intentional exception
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException ex) {
            // Log detailed exception information
            logger.error("ArithmeticException encountered while performing division operation", ex);
            
            // Graceful and meaningful message to the user
            System.out.println("Error: Cannot perform division by zero. Please enter a valid divisor.");
        } catch (Exception ex) {
            // Catch any other unexpected exceptions
            logger.error("An unexpected error occurred", ex);
            
            // General meaningful message for unknown issues
            System.out.println("Oops! Something went wrong. Please try again later.");
        }
    }

    private static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;  // Could throw ArithmeticException
    }
}
