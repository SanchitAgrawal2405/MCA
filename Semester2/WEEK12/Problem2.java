package week_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Problem2 {
    private static final Logger logger = LogManager.getLogger(Problem2.class);

    public static void main(String[] args) {
        HttpURLConnection connection = null;

        try (BufferedReader fileReader = new BufferedReader(new FileReader("url_valid.txt"))) {
            String urlString = fileReader.readLine(); // Read URL from file
            if (urlString == null || urlString.isEmpty()) {
                throw new NetworkConnectionException("URL in file is empty or missing.", null);
            }

            try {
                URL url = new URL(urlString);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                int responseCode = connection.getResponseCode();
                logger.info("HTTP Response Code: {}", responseCode);

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    try (BufferedReader reader = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()))) {

                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                } else {
                    logger.warn("Server returned non-OK response code: {}", responseCode);
                }

            } catch (MalformedURLException e) {
                logger.error("Malformed URL found in file: {}", e.getMessage());
                throw new NetworkConnectionException("Invalid URL format: " + urlString, e);
            } catch (IOException e) {
                logger.error("IOException while connecting to {}", urlString, e);
                throw new NetworkConnectionException("Network error while connecting to: " + urlString, e);
            }

        } catch (IOException e) {
            System.err.println("File reading error: " + e.getMessage());
        } catch (NetworkConnectionException e) {
            System.err.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
                logger.info("HttpURLConnection closed successfully.");
            }
        }
    }
}