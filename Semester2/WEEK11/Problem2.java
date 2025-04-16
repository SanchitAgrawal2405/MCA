package week_11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Wrapper to simulate AutoCloseable for DateFormat
class AutoCloseableDateFormat implements AutoCloseable {
    private final DateFormat dateFormat;

    public AutoCloseableDateFormat(String pattern) {
        this.dateFormat = new SimpleDateFormat(pattern);
    }

    public Date parse(String dateStr) throws ParseException {
        return dateFormat.parse(dateStr);
    }

    @Override
    public void close() {
        // Simulated close (no real resource released)
        // Real formatter doesn’t need explicit closing
    }
}

public class Problem2 {

    private static final Logger logger = LogManager.getLogger(Problem2.class);

    public static void main(String[] args) {
        String[] dates = {"28-03-2025", "31-02-2025", "wrong-format", "12-12-2024"};

        for (String dateStr : dates) {
            try (AutoCloseableDateFormat formatter = new AutoCloseableDateFormat("dd-MM-yyyy")) {
                Date parsedDate = formatter.parse(dateStr);
                logger.info("Parsed date: {}", parsedDate);
            } catch (ParseException e) {
                throw new DateParsingException("Error parsing date: " + dateStr, e);
            } catch (DateParsingException e) {
                logger.error("Custom Exception: {}", e.getMessage());
            } finally {
                logger.info("Finished processing date string: {}", dateStr);
            }
        }
    }
}
