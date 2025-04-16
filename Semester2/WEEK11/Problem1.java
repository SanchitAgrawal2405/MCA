package week_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Problem1 {

    public static void main(String[] args) {
        String[] dateInputs = {"2025-02-02", "31-02-2025", "04-03-2025", "2024-11-06"};
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (String dateStr : dateInputs) {
            try {
                LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
                System.out.println("Parsed date: " + parsedDate);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format or value: " + dateStr);
            }
        }
    }
}
