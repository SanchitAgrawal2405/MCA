package week_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Problem1 {
    public static void main(String[] args) {
        String urlString = "https://example.com"; // Try valid or invalid
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close(); // Manual close
            } else {
                System.out.println("Failed: HTTP error code " + responseCode);
            }

            connection.disconnect(); // Manual disconnect

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}