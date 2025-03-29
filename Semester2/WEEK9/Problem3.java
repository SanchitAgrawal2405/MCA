package week_9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Problem3 {

    // Logger instance
    private static final Logger logger = LogManager.getLogger(Problem3.class);

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // This will throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Log exception details
            logger.error("An exception occurred while dividing numbers:", e);
        }
    }

    private static int divide(int a, int b) {
        return a / b; // May throw ArithmeticException
    }
}
