package week_9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Problem7 {

    // Initialize Log4j2 Logger
    private static final Logger logger = LogManager.getLogger(Problem7.class);

    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;  // division by zero, critical error
            
            logger.info("Attempting division: {} / {}", numerator, denominator);
            int result = numerator / denominator;

            logger.info("Result: {}", result);
            
        } catch (ArithmeticException e) {
            // Log critical details of the exception
            logger.error("Severe runtime exception occurred: {}", e.toString(), e);

            // Graceful termination with a non-zero exit code
            logger.error("Application terminated due to critical error.");
            System.exit(1);
        } finally {
            logger.info("Cleanup actions if necessary.");
        }
    }
}
