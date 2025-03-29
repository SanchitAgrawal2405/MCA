package week_9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {
        logger.info("Test INFO message");
        logger.error("Test ERROR message");
    }
}
